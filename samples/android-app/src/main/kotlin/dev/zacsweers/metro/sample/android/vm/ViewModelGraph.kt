// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android.vm

import dev.zacsweers.metro.Multibinds
import dev.zacsweers.metro.Provider
import kotlin.reflect.KClass

interface ViewModelGraph {
  @Multibinds
  val assistedFactoryProviders: Map<KClass<out ViewModelFactory>, Provider<ViewModelFactory>>
}
