/**
 * Created by jiayu on 3/19/16.
 */
package com.madadata.Kotlin

data class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {

    println(String.format("Hello World %s", Point(1, 2)))

}