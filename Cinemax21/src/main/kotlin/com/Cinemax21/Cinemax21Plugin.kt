package com.Cinemax21

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class Cinemax21Plugin : Plugin() {
    override fun load(context: Context) {
        // Register Main Provider
        registerMainAPI(Cinemax21())
        
        // Register Extractors
        // Mendaftarkan Jeniusplay yang baru (dari IdlixProvider)
        registerExtractorAPI(Jeniusplay())
    }
}
