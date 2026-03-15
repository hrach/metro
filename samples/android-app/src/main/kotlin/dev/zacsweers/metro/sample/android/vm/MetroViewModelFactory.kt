// Copyright (C) 2026 Zac Sweers
// SPDX-License-Identifier: Apache-2.0
package dev.zacsweers.metro.sample.android.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.sample.android.AppGraph

@Inject
class MetroViewModelFactory(private val appGraph: AppGraph) : ViewModelProvider.Factory {
  @Suppress("KotlinUnreachableCode")
  override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
    val viewModelGraph = appGraph.viewModelGraphFactory.create(extras.createSavedStateHandle())
    val vmf = viewModelGraph.assistedFactoryProviders[TODO()]
    return TODO()
  }
}
