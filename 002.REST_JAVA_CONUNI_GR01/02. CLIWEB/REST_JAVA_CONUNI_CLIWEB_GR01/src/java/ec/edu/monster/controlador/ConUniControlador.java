/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.controlador;

import ec.edu.monster.modelo.ConUni;
import ec.edu.monster.servicio.ConUniService;
import javax.servlet.annotation.WebServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
/**
 *
 * @author UsuarioLVD
 */
@WebServlet("/ConUniControlador") // 👈 También aquí

public class ConUniControlador  extends HttpServlet {
     private final ConUniService service = new ConUniService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tipo = request.getParameter("tipo");
        double valor = Double.parseDouble(request.getParameter("valor"));

        try {
            ConUni resultado = service.convertir(tipo, valor);
            request.setAttribute("resultado", resultado);
        } catch (Exception e) {
            request.setAttribute("mensaje", "Error: " + e.getMessage());
        }

        request.getRequestDispatcher("ConUni.jsp").forward(request, response);
    }
}
