package com.cmd.PcShop.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configurers.CorsConfigurer
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer
import org.springframework.security.config.annotation.web.configurers.oauth2.client.OAuth2LoginConfigurer
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
class WebSecurityConfig {
    @Bean
    @Throws(Exception::class)
    fun securityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain {
        httpSecurity
            .authorizeHttpRequests { requests ->
                requests.anyRequest().authenticated()
            }
            .oauth2Login { login: OAuth2LoginConfigurer<HttpSecurity?> ->
                login.defaultSuccessUrl("http://localhost:8080", true)
            }
            .csrf { obj: CsrfConfigurer<HttpSecurity> -> obj.disable() }
            .cors { httpSecurityCorsConfigurer: CorsConfigurer<HttpSecurity?> ->
                httpSecurityCorsConfigurer.configurationSource(
                    corsConfigurationSource()
                )
            }
        return httpSecurity.build()
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val configuration = CorsConfiguration()
        configuration.allowedOrigins = listOf("http://localhost:3000")
        configuration.allowedMethods =
            mutableListOf("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
        configuration.allowedHeaders =
            mutableListOf("authorization", "content-type", "x-auth-token")
        configuration.exposedHeaders = listOf("x-auth-token")
        configuration.allowCredentials = true
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", configuration)
        return source
    }
}