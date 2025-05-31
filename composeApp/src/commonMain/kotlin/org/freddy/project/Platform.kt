package org.freddy.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform