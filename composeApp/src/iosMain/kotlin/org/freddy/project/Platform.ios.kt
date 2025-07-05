package org.freddy.project

import platform.UIKit.UIDevice
import platform.UIKit.UIApplication
import platform.Foundation.NSURL

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

actual fun openUrl(url: String) {
    val nsUrl = NSURL.URLWithString(url)
    if (nsUrl != null) {
        UIApplication.sharedApplication.openURL(nsUrl)
    }
}

actual fun makePhoneCall(phoneNumber: String) {
    val phoneUrl = NSURL.URLWithString("tel:$phoneNumber")
    if (phoneUrl != null) {
        UIApplication.sharedApplication.openURL(phoneUrl)
    }
}
