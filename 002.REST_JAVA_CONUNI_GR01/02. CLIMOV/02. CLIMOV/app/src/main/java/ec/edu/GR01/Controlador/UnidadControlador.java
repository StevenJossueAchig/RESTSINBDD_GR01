package ec.edu.GR01.Controlador;

import ec.edu.GR01.Modelo.RespuestaUnidadModelo;
import ec.edu.GR01.Servicio.UnidadServicio;
import retrofit2.Call;

public class UnidadControlador {
    private final UnidadServicio unidadServicio;
    public UnidadControlador (UnidadServicio unidadServicio) {
        this.unidadServicio = unidadServicio;
    }

    public Call<RespuestaUnidadModelo> convertirCentimetrosAPulgadas (double centimetros){
        return unidadServicio.servicioCentimetrosAPulgadas(centimetros);
    }

    public  Call<RespuestaUnidadModelo> convertirPulgadasACentimetros(double pulgadas){
        return unidadServicio.servicioPulgadasACentimetros(pulgadas);
    }
}
