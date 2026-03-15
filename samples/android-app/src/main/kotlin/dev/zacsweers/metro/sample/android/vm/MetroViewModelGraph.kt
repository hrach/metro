// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android.vm

import androidx.lifecycle.SavedStateHandle
import dev.zacsweers.metro.GraphExtension
import dev.zacsweers.metro.Provides

@GraphExtension(ViewModelScope::class)
interface MetroViewModelGraph : ViewModelGraph {
  @GraphExtension.Factory
  fun interface Factory {
    fun create(@Provides state: SavedStateHandle): MetroViewModelGraph
  }
}
