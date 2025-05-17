/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.controlador;
import ec.edu.monster.modelo.Usuario;
import ec.edu.monster.servicio.LoginService;
import org.json.JSONObject;
import javax.servlet.annotation.WebServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
/**
 *
 * @author UsuarioLVD
 */
@WebServlet("/LoginControlador")  // 👈 Esta anotación reemplaza el web.xml

public class LoginControlador extends HttpServlet {
    private final LoginService loginService = new LoginService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        Usuario user = new Usuario(usuario, contrasena);

        try {
            JSONObject resultado = loginService.autenticar(user);

            if (resultado.getBoolean("autorizado")) {
                response.sendRedirect("ConUni.jsp");
            } else {
                request.setAttribute("mensaje", resultado.getString("mensaje"));
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } catch (Exception e) {
            request.setAttribute("mensaje", "Error: " + e.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
