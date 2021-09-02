package de.wz.divinv.application.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    @Suppress("SpringMVCViewInspection")
    override fun addViewControllers(registry: ViewControllerRegistry) {
        // Als Einstiegspunkt wird auf die UI weitergeleitet. Kann die statische index.html ablösen.
        registry.addViewController("/").setViewName("redirect:ui/")

        // Sorgt dafür, dass wir unter /ui/ immer die index.html ausliefern und der React-Router
        // seinen Dienst machen kann.
        registry.addViewController("/ui/**").setViewName("/ui-static/index.html")
    }
}


