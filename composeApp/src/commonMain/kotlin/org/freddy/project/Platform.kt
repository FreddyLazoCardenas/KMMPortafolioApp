package org.freddy.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun openUrl(url: String)

expect fun makePhoneCall(phoneNumber: String)
