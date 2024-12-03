package org.example.dao;

import org.example.Entity.Usuarios;
import org.example.Juegos;

import java.util.List;

public interface JuegosDao {

    List<Usuarios> juegosUsuarios(Long juegos);

}
