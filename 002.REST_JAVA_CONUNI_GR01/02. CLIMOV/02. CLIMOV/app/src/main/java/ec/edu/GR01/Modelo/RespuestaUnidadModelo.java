package ec.edu.GR01.Modelo;

public class RespuestaUnidadModelo {
    private String tipo;
    private double entrada;
    private double resultado;

    public RespuestaUnidadModelo(String tipo, double entrada, double resultado) {
        this.tipo = tipo;
        this.entrada = entrada;
        this.resultado = resultado;
    }

    public RespuestaUnidadModelo(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
