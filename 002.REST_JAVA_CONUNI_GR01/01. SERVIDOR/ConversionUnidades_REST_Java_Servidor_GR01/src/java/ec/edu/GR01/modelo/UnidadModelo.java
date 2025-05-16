/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.GR01.modelo;

/**
 *
 * @author Owner
 */
public class UnidadModelo {

    private double centimetros;
    private double pulgadas;

    public UnidadModelo() {
    }

    public UnidadModelo(double centimetros, double pulgadas) {
        this.centimetros = centimetros;
        this.pulgadas = pulgadas;
    }

    public double getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(double centimetros) {
        this.centimetros = centimetros;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

}
