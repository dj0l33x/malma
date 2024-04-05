package com.github.dj0l33x.port.location

import java.time.LocalDateTime

data class LocationSave(val data: String)
data class LocationDelete(val id: Long)
data class LocationList(val id: Long, val data: String, val createdAt: LocalDateTime)