// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android.vm

import androidx.lifecycle.ViewModel
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.AssistedInject
import dev.zacsweers.metro.ContributesIntoMap

@AssistedInject
class TestViewModel(val foo: Foo) : ViewModel() {
  @AssistedFactory
  @ViewModelFactoryKey(Factory::class)
  @ContributesIntoMap(ViewModelScope::class)
  fun interface Factory : ViewModelFactory {
    fun create(): TestViewModel
  }
}
