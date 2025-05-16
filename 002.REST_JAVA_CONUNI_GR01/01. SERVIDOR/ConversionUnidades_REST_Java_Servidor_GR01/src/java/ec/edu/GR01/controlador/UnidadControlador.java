package ec.edu.GR01.controlador;

import ec.edu.GR01.respuesta.RespuestaConversion;
import ec.edu.GR01.servicio.UnidadServicio;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ConUni")
@Produces(MediaType.APPLICATION_JSON)
public class UnidadControlador {

    private final UnidadServicio unidadServicio = new UnidadServicio();

    @GET
    @Path("cmAin/{centimetros}")
    public RespuestaConversion centimetrosAPulgadas(@PathParam("centimetros") double centimetros) {
        double resultado = unidadServicio.servicioCentimetrosAPulgadas(centimetros);
        return new RespuestaConversion("cm->in", centimetros, resultado);
    }

    @GET
    @Path("inAcm/{pulgadas}")
    public RespuestaConversion pulgadasAcentimetros(@PathParam("pulgadas") double pulgadas) {
        double resultado = unidadServicio.servicioPulgadasACentimetros(pulgadas);
        return new RespuestaConversion("in->cm", pulgadas, resultado);
    }
}
