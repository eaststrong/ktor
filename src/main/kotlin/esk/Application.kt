package esk

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import esk.plugins.*

fun main() {
  embeddedServer(Netty, port = (System.getenv("PORT") ?: "8080").toInt()) {
    configureRouting()
  }.start(wait = true)
}
