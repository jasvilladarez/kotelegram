package io.github.jasvilladarez.telegram.api

import io.github.jasvilladarez.telegram.model.User
import io.reactivex.Single
import retrofit2.http.GET

internal interface UserApi {

    @GET("getMe")
    fun getMe(): Single<User>
}