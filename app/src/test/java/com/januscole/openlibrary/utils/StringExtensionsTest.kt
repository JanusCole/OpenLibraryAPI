package com.januscole.openlibrary.utils

import org.junit.Assert.*
import org.junit.Test

class StringExtensionsTest {

    @Test
    fun `Encoding and decoding a string with a forward slash produces the same result`() {
        val testString = "/works/OL27448W"
        assertEquals(testString, testString.encodeNavParameter().decodeNavParameter())
    }

    @Test
    fun `Encoding and decoding a string with special characters produces the same result`() {
        val testString = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+[{]}|;:.>,</?"
        assertEquals(testString, testString.encodeNavParameter().decodeNavParameter())
    }
}
