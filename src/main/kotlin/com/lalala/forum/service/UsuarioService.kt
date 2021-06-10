package com.lalala.forum.service

import com.lalala.forum.model.Usuario
import com.lalala.forum.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}
