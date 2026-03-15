// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android.vm

import dev.zacsweers.metro.MapKey
import kotlin.reflect.KClass

interface ViewModelFactory

@MapKey
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewModelFactoryKey(val value: KClass<out ViewModelFactory>)
