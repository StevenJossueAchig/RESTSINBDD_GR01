package ec.edu.GR01.Controlador;

import ec.edu.GR01.ClienteWeb.ApiCliente;
import ec.edu.GR01.Modelo.LoginModelo;
import ec.edu.GR01.Modelo.RespuestaLoginModelo;
import ec.edu.GR01.Servicio.LoginServicio;
import retrofit2.Call;

public class LoginControlador {

    private final LoginServicio loginServicio;

    public LoginControlador() {
        loginServicio = ApiCliente.getClient().create(LoginServicio.class);
    }

    public Call<RespuestaLoginModelo> iniciarSesion(LoginModelo loginModelo) {
        return loginServicio.autorizacionServicio(loginModelo);
    }
}
