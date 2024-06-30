package org.example.loadtest.mapper

import org.example.loadtest.model.Model
import org.example.loadtest.model.ModelRequest
import org.example.loadtest.model.ModelResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface ModelMapper {

    @Mapping(target = "createdAt", expression = "java(new Date())")
    fun toModel(request: ModelRequest): Model

    fun toResponse(model: Model): ModelResponse
}