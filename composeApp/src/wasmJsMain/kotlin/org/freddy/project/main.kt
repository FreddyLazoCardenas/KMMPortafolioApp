package org.freddy.project

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.w3c.dom.HTMLElement

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val rootElement = document.getElementById("root") as HTMLElement
    ComposeViewport(rootElement) {
        App()
    }
}

