package com.moshenskyi.collections

import java.util.*
import kotlin.NoSuchElementException

class Queue<T> {
    private var elements: LinkedList<T?> = LinkedList()
    private var capacity = 0

    fun push(item: T) {
        elements.add(item)
        capacity++
    }

    fun pop(): T? {
        if (capacity == 0) throw NoSuchElementException("Queue is empty")

        val item = elements[0]
        capacity--

        elements.remove()

        return item
    }

    fun peek(): T? {
        if (capacity == 0) throw NoSuchElementException("Stack is empty")

        return elements[0]
    }

    fun size(): Int = capacity

    fun isEmpty(): Boolean = capacity == 0

}
