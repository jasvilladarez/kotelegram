import io.github.jasvilladarez.kotelegram.command
import io.github.jasvilladarez.kotelegram.request.SendMessageRequest
import io.github.jasvilladarez.kotelegram.telegramBot

fun main(args: Array<String>) {
    val botToken = ""
    telegramBot(botToken) {
        command("/start") {
            sendMessage(SendMessageRequest( it.chat.id.toString(),
                    "You have succeeded in starting"))
        }
    }.startPolling()
}