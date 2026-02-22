package com.Drakor

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class DrakorPlugin : Plugin() {
    override fun load(context: Context) {
        // Register Main Provider
        registerMainAPI(Drakor())
        
        // Register Extractors
        // Mendaftarkan Jeniusplay yang baru (dari IdlixProvider)
        registerExtractorAPI(Jeniusplay())
    }
}
