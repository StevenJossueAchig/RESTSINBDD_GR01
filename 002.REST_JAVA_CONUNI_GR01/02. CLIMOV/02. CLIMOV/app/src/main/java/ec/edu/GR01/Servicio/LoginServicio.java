package ec.edu.GR01.Servicio;

import ec.edu.GR01.Modelo.LoginModelo;
import ec.edu.GR01.Modelo.RespuestaLoginModelo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoginServicio {
    @POST("login/autenticacion")
    Call<RespuestaLoginModelo> autorizacionServicio(@Body LoginModelo loginModelo);
}
