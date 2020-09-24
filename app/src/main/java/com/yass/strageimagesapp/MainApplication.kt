package com.yass.strageimagesapp

import android.app.Application
import com.yass.strageimagesapp.ui.StrageImagesAdapter
import com.yass.strageimagesapp.view_model.StrageImagesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setUpKoin()
    }

    private fun setUpKoin() {

        val modules = module {
            factory { StrageImagesAdapter() }
            viewModel { StrageImagesViewModel(get()) }
        }

        startKoin {
            androidContext(this@MainApplication)
            modules(modules)
        }
    }
}