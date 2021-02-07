package com.batch.task

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableBatchProcessing
class BatchBulkInsertApplication

fun main(args: Array<String>) {
    runApplication<BatchBulkInsertApplication>(*args)
}