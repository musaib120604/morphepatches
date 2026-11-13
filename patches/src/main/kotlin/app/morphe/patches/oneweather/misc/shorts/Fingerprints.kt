/*
 * Copyright (C) 2026 Musaib Bhat
 * SPDX-License-Identifier: GPL-3.0-only
 */
package app.morphe.patches.oneweather.misc.shorts

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object TodayCardsFingerprint : Fingerprint(
    definingClass = TODAY_CARDS_ORDER_CLASS,
    name = "getTodayCards",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Ljava/util/Map;",
    parameters = emptyList(),
)
