package org.example.loadtest.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Table
@Entity
class Model(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    val createdAt: Date
)