package com.moshenskyi.collections

import com.moshenskyi.collections.exceptions.IllegalCollectionSizeException
import kotlin.jvm.Throws

const val DEFAULT_STACK_SIZE = 16

class Stack<T>(size: Int = DEFAULT_STACK_SIZE) {
    private var elements: Array<Any?>
    private var capacity = 0

    init {
        if (size < 0) {
            throw IllegalCollectionSizeException("Illegal initial capacity")
        }
        elements = arrayOfNulls(size)
    }

    fun push(item: T) {
        elements[capacity++] = item
    }

    @Throws(NoSuchElementException::class)
    fun pop(): T? {
        if (capacity == 0) throw NoSuchElementException("Stack is empty")

        val item = elements[--capacity]
        elements[capacity] = null

        @Suppress("UNCHECKED_CAST")
        return item as T?
    }

    @Throws(NoSuchElementException::class)
    fun peek(): T? {
        if (capacity == 0) throw NoSuchElementException("Stack is empty")

        @Suppress("UNCHECKED_CAST")
        return elements[capacity - 1] as T?
    }

    fun size(): Int = capacity

    fun isEmpty(): Boolean = capacity == 0

}
