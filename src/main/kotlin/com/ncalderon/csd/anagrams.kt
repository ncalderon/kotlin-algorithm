package com.ncalderon.csd

import java.util.LinkedList

/*fun anagrams(
    word1: String,
    word2: String,
    words: List<String>,
    memo: MutableMap<String,
    List<String>> = mutableMapOf<String, List<String>>()): MutableMap<String, List<String>> {

    if (words.size == 0)
        return memo;

    if (word1.length != word2.length){

    }

    val word1Sorted = word1.toCharArray().apply { sort() }.joinToString("")
    val word2Sorted = word2.toCharArray().apply { sort() }.joinToString("")

}*/


fun compareWords(word: ByteArray, anotherWord: ByteArray): String {
    word.sort();
    anotherWord.sort();
    if (word.contentEquals(anotherWord)) {
        return word
    } else {
        return "";
    }
}

fun main() {
    val words = listOf("aaa", "aaat", "tat", "att", "taaa", "aatt", "tata", "ttaa");
}