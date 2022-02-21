package com.moshenskyi.collections

import java.util.*
import kotlin.NoSuchElementException
import kotlin.jvm.Throws

class Queue<T> {
    private var elements: LinkedList<T> = LinkedList()
    private var capacity = 0

    fun push(item: T) {
        elements.add(item)
        capacity++
    }

    fun pushAll(items: Collection<T>) {
        elements.addAll(items)
        capacity += elements.size
    }

    @Throws(NoSuchElementException::class)
    fun pop(): T {
        if (capacity == 0) throw NoSuchElementException("Queue is empty")

        capacity--
        return elements.removeAt(0)
    }

    @Throws(NoSuchElementException::class)
    fun peek(): T {
        if (capacity == 0) throw NoSuchElementException("Stack is empty")

        return elements[0]
    }

    fun clear() {
        elements.clear()
    }

    fun size(): Int = capacity

    fun isEmpty(): Boolean = capacity == 0

}
