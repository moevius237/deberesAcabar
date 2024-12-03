package org.example.dao;

import org.example.Entity.Usuarios;

import java.util.List;

public interface UsuarioDao {
    void tiempoJuegoUsuarios(long idMesa);
    List<Usuarios> saldoUsuario();
    void plusUsuario(Usuarios usuarios);
}
