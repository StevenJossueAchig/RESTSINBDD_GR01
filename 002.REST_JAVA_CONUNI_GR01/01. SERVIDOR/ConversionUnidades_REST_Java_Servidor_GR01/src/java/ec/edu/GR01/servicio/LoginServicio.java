/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.GR01.servicio;

import ec.edu.GR01.modelo.LoginModelo;

/**
 *
 * @author Owner
 */
public class LoginServicio {

    private final LoginModelo login = new LoginModelo("MONSTER", "MONSTER9");

    public boolean autorizacion(String usuario, String contrasena) {
        if (usuario == null || contrasena == null) return false;
        return (usuario.equals(login.getUsuario()) && contrasena.equals(login.getContrasena()));
    }

}
