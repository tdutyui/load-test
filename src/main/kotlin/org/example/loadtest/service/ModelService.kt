package org.example.loadtest.service

import org.example.loadtest.mapper.ModelMapper
import org.example.loadtest.model.ModelRequest
import org.example.loadtest.model.ModelResponse
import org.example.loadtest.repository.ModelRepository
import org.springframework.stereotype.Service

interface ModelService {

    fun create(request: ModelRequest): ModelResponse

    fun fetchAll(): List<ModelResponse>
}

@Service
class DefaultModelService(
    private val repository: ModelRepository,
    private val mapper: ModelMapper
) : ModelService {

    override fun create(request: ModelRequest) =
        mapper.toModel(request)
            .apply { repository.save(this) }
            .let { mapper.toResponse(it) }

    override fun fetchAll() =
        repository.findAll()
            .map { mapper.toResponse(it) }
            .toList()
}