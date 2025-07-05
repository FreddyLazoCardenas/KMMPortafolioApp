package org.freddy.project

import kotlinx.browser.window

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun openUrl(url: String) {
    window.open(url, "_blank")
}

actual fun makePhoneCall(phoneNumber: String) {
    window.open("tel:$phoneNumber", "_self")
}
