package org.example.loadtest.repository

import org.example.loadtest.model.Model
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ModelRepository : JpaRepository<Model, Long> {
}