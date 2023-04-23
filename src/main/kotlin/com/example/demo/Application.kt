package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy


@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
