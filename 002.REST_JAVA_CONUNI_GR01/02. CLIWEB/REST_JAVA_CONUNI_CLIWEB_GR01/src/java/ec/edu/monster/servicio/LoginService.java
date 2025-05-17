/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.servicio;
import ec.edu.monster.modelo.Usuario;
import java.io.*;
import java.net.*;
import org.json.JSONObject;
/**
 *
 * @author UsuarioLVD
 */
public class LoginService {
    private final String API_URL = "http://localhost:8080/ConversionUnidades_REST_Java_Servidor_GR01/api/login/autenticacion";

    public JSONObject autenticar(Usuario usuario) throws Exception {
        String jsonInput = new JSONObject()
            .put("usuario", usuario.getUsuario())
            .put("contrasena", usuario.getContrasena())
            .toString();

        URL url = new URL(API_URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        try (OutputStream os = con.getOutputStream()) {
            os.write(jsonInput.getBytes());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response = reader.readLine();
        return new JSONObject(response);
    }
}