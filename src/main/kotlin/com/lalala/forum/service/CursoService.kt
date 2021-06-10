package com.lalala.forum.service

import com.lalala.forum.model.Curso
import com.lalala.forum.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }
}
