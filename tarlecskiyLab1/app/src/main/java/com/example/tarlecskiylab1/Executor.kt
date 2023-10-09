package com.example.tarlecskiylab1

object Executor {
    fun execute(inputData: List<Int>, valueZ: Int) : ExecutorResult {
        var countOfChange = 0;
        val newList = inputData.map { number ->
            if (number > valueZ) {
                countOfChange++
                return@map valueZ.toString()
            }
            return@map number.toString()
        }
        return ExecutorResult(newList, countOfChange)
    }
}