package com.lalala.forum.service

import com.lalala.forum.model.Usuario
import com.lalala.forum.repository.UsuarioRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
//import org.springframework.security.core.userdetails.UserDetails
//import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val repository: UsuarioRepository
) : UserDetailsService {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        val usuario = repository.findByEmail(username) ?: throw RuntimeException()
        return UserDetail(usuario)
    }
}
