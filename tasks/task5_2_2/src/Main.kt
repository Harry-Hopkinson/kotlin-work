// Task 5.2.2: conversion of marks into grades, using a function

import kotlin.system.exitProcess

fun grade(mark: Int) = when (mark) {
    in 0..39 -> "Fail"
    in 40..69 -> "Pass"
    in 70..100 -> "Distinction"
    else -> "?"
}

fun main(args: Array<String>) {
    for (i in 0..args.size - 1) {
        println("${args[i]} is a ${grade(args[i].toInt())}");
    }
}
