package org.freddy.project

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.w3c.dom.HTMLElement
import org.w3c.dom.css.CSSStyleDeclaration

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    // Get the body element
    val body = document.body!!

    // Configure the body and HTML for full height
    configureFullHeight(document.documentElement as HTMLElement)
    configureFullHeight(body)

    // Set up the Compose viewport
    ComposeViewport(body) {
        App()
    }
}

/**
 * Configure an HTML element to take full height
 */
private fun configureFullHeight(element: HTMLElement) {
    val style: CSSStyleDeclaration = element.style
    style.setProperty("width", "100%")
    style.setProperty("height", "100vh")
    style.setProperty("margin", "0")
    style.setProperty("padding", "0")
    style.setProperty("overflow", "hidden")
}

