package ec.edu.GR01.Servicio;

import ec.edu.GR01.Modelo.RespuestaUnidadModelo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UnidadServicio {
    @GET("ConUni/cmAin/{centimetros}")
    Call<RespuestaUnidadModelo> servicioCentimetrosAPulgadas(@Path("centimetros") double centimetros);

    @GET("ConUni/inAcm/{pulgadas}")
    Call<RespuestaUnidadModelo> servicioPulgadasACentimetros(@Path("pulgadas") double pulgadas);


}
