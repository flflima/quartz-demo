package com.tutorial.dev.quartzdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class QuartzDemoApplication

fun main(args: Array<String>) {
	runApplication<QuartzDemoApplication>(*args)
}
