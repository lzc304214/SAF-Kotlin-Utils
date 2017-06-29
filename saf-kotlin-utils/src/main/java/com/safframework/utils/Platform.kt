package com.safframework.utils

import android.os.Build

/**
 * Created by Tony Shen on 2017/6/28.
 */

fun isFroyoOrHigher(): Boolean = versionOrHigher(8)

fun isGingerbreadOrHigher(): Boolean = versionOrHigher(9)

fun isHoneycombOrHigher(): Boolean = versionOrHigher(11)

fun isICSOrHigher(): Boolean = versionOrHigher(14)

fun isJellyBeanOrHigher(): Boolean = versionOrHigher(16)

fun isJellyBeanMR1OrHigher(): Boolean = versionOrHigher(17)

fun isJellyBeanMR2OrHigher(): Boolean = versionOrHigher(18)

fun isKitkatOrHigher(): Boolean = versionOrHigher(19)

fun isKitkatWatchOrHigher(): Boolean = versionOrHigher(20)

fun isLOrHigher(): Boolean = versionOrHigher(21)

/**
 * api level 22是android 5.1
 * @return
 */
fun isLMR1OrHigher(): Boolean = versionOrHigher(22)

fun isMOrHigher(): Boolean = versionOrHigher(23)

fun isNOrHigher(): Boolean = versionOrHigher(24)

private fun versionOrHigher(version: Int) = Build.VERSION.SDK_INT >= version