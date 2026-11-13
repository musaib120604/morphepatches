/*
 * Copyright (C) 2026 Musaib Bhat
 * SPDX-License-Identifier: GPL-3.0-only
 */
package app.morphe.patches.pixlr.layout.home

import app.morphe.patcher.Fingerprint

internal object HomeSectionConstructorFingerprint : Fingerprint(
    name = "<init>",
    parameters = listOf("Lorg/json/JSONObject;"),
    strings = listOf("autoscroll"),
)
