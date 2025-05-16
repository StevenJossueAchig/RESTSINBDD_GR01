/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.GR01.controlador;

import ec.edu.GR01.modelo.LoginModelo;
import ec.edu.GR01.respuesta.RespuestaLogin;
import ec.edu.GR01.servicio.LoginServicio;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Owner
 */
@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoginControlador {

    private final LoginServicio loginServicio = new LoginServicio();

    @POST
    @Path("/autenticacion")
    public RespuestaLogin autenticacionLogin(LoginModelo login) {
        boolean autorizado = loginServicio.autorizacion(login.getUsuario(), login.getContrasena());
        String mensaje = autorizado ? "Login exitoso" : "Usuario o contraseña incorrectos";
        return new RespuestaLogin(autorizado, mensaje);
    }

}
