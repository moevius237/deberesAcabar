package org.example.tests;

import org.example.Entity.Juegos;
import org.example.Entity.Mesas;
import org.example.Entity.Usuarios;
import org.example.service.JuegosService;
import org.example.service.UsuarioService;

public class test1 {
    public static void main(String[] args) {
        Juegos juegos = new Juegos(19,"pa");
        Mesas mesas = new Mesas(1);
        Usuarios usuarios = new Usuarios("pepito",1,juegos,mesas);
        JuegosService service = new JuegosService();
        service.juegosUsuarios(1L);
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.plusUsuario(usuarios);
        usuarioService.saldoUsuario();
        usuarioService.tiempoJuegoUsuarios(1);
    }
}
