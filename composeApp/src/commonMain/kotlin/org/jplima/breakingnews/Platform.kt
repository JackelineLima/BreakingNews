package org.jplima.breakingnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform