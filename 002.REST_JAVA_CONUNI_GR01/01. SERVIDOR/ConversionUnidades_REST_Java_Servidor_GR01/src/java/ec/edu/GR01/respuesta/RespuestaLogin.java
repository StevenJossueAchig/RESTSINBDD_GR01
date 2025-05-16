package ec.edu.GR01.respuesta;

public class RespuestaLogin {
    private boolean autorizado;
    private String mensaje;

    public RespuestaLogin() {
    }

    public RespuestaLogin(boolean autorizado, String mensaje) {
        this.autorizado = autorizado;
        this.mensaje = mensaje;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
