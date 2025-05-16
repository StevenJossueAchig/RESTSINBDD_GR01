/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.GR01.servicio;

import ec.edu.GR01.modelo.UnidadModelo;

/**
 *
 * @author Owner
 */
public class UnidadServicio {

    private final UnidadModelo unidad = new UnidadModelo();

    public double servicioCentimetrosAPulgadas(double centimetros) {
        unidad.setCentimetros(centimetros);
        unidad.setPulgadas(2.54);

        return unidad.getCentimetros() * unidad.getPulgadas();
    }

    public double servicioPulgadasACentimetros(double pulgadas) {
        unidad.setPulgadas(pulgadas);
        unidad.setCentimetros(2.54);
        return unidad.getPulgadas() / unidad.getCentimetros();
    }

}
