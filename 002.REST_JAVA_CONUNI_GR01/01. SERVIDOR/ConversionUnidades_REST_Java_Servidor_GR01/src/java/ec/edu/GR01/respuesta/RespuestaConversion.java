package ec.edu.GR01.respuesta;

public class RespuestaConversion {
    private String tipo;
    private double entrada;
    private double resultado;

    public RespuestaConversion() {}

    public RespuestaConversion(String tipo, double entrada, double resultado) {
        this.tipo = tipo;
        this.entrada = entrada;
        this.resultado = resultado;
    }

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
