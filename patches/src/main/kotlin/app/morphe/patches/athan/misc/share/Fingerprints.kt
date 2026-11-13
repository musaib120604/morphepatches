/*
 * Copyright (C) 2026 Musaib Bhat
 * SPDX-License-Identifier: GPL-3.0-only
 */
package app.morphe.patches.athan.misc.share

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.methodCall

internal const val CREATE_CHOOSER =
    "Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;"

private val excludedPackages = listOf("Lapp/morphepatches/", "Landroidx/", "Lcom/google/", "Lcom/facebook/", "Lcom/adpushup/")

internal object CreateChooserFingerprint : Fingerprint(
    filters = listOf(methodCall(smali = CREATE_CHOOSER)),
    custom = { _, classDef -> excludedPackages.none { classDef.type.startsWith(it) } },
)
