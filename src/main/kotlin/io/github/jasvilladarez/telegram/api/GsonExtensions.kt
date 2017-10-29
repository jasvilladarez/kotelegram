package io.github.jasvilladarez.telegram.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import java.io.IOException
import java.util.Locale


internal val GSON by lazy {
    GsonBuilder().registerTypeAdapterFactory(EnumTypeFactory())
            .setLongSerializationPolicy(LongSerializationPolicy.STRING)
            .create()
}


private class EnumTypeFactory : TypeAdapterFactory {
    override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
        val rawType = type.rawType as Class<T>
        if (!rawType.isEnum) {
            return null
        }

        val lowercaseToConstant = HashMap<String, T>()
        for (constant in rawType.enumConstants) {
            lowercaseToConstant.put(toLowercase(constant), constant)
        }

        return object : TypeAdapter<T>() {
            @Throws(IOException::class)
            override fun write(out: JsonWriter, value: T?) {
                if (value == null) {
                    out.nullValue()
                } else {
                    out.value(toLowercase(value))
                }
            }

            @Throws(IOException::class)
            override fun read(reader: JsonReader): T? {
                if (reader.peek() == JsonToken.NULL) {
                    reader.nextNull()
                    return null
                } else {
                    return lowercaseToConstant[reader.nextString().toLowerCase()]
                }
            }
        }
    }

    private fun toLowercase(o: Any?): String {
        return o.toString().toLowerCase(Locale.US)
    }
}