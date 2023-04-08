package com.januscole.openlibrary.utils

import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

// One weakness of Compose Navigation is that it can be derailed by forward slash
// characters in the parameter string. So these extension functions encode and decode
// parameter strings to mitigate that.

fun String.encodeNavParameter(): String {
    return URLEncoder.encode(this, StandardCharsets.UTF_8.toString())
}

fun String.decodeNavParameter(): String {
    return URLDecoder.decode(this, StandardCharsets.UTF_8.toString())
}
