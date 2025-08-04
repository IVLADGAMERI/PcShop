package com.cmd.PcShop.exception.handler

import com.cmd.PcShop.web.response.error.ErrorResponse
import jakarta.persistence.EntityNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class BusinessExceptionHandler {
    @ExceptionHandler(EntityNotFoundException::class)
    fun handleEntityNotFound(ex: EntityNotFoundException) : ResponseEntity<ErrorResponse> {
        val responseBody = ErrorResponse(ex.message ?: "Запрошенная страница не найдена")
        val responseEntity = ResponseEntity<ErrorResponse>(responseBody, HttpStatus.NOT_FOUND)
        return responseEntity
    }
}