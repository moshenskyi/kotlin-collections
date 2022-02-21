package com.moshenskyi.collections.exceptions

import java.lang.Exception

class IllegalCollectionSizeException(
    override val message: String? = "Illegal initial capacity",
    override val cause: Throwable? = null
): Exception(message, cause)