/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.servicio;
import ec.edu.monster.modelo.ConUni;
import java.io.*;
import java.net.*;
import org.json.JSONObject;
/**
 *
 * @author UsuarioLVD
 */
public class ConUniService {
    private final String BASE_URL = "http://localhost:8080/ConversionUnidades_REST_Java_Servidor_GR01/api/ConUni/";

    public ConUni convertir(String tipo, double valor) throws Exception {
        URL url = new URL(BASE_URL + tipo + "/" + valor);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response = reader.readLine();
        JSONObject json = new JSONObject(response);

        ConUni resultado = new ConUni();
        resultado.setEntrada(json.getDouble("entrada"));
        resultado.setResultado(json.getDouble("resultado"));
        resultado.setTipo(json.getString("tipo"));

        return resultado;
    }
}
