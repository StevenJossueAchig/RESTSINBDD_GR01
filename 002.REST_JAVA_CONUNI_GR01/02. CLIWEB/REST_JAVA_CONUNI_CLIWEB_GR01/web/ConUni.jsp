<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="ec.edu.monster.modelo.ConUni" %>
<!DOCTYPE html>
<html>
<head>
    <title>Conversión de Unidades</title>
    <meta charset="UTF-8">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
            overflow: hidden;
        }

        body::before {
            content: "";
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-image: url('https://www.infobae.com/resizer/v2/BCWNAG4MNRBSLHAM7COBNDWIJM.jpg?auth=4845436f90b1b02cbeabbf006bc9ecaec9ed461e4f44709a1949d39e4f2dde4f&smart=true&width=992&height=558&quality=85');
            background-size: cover;
            background-position: center;
            opacity: 0.6;
            z-index: -1;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.7);
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            width: 400px;
            text-align: center;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        form {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
            font-size: 14px;
        }

        input[type="number"],
        select {
            width: 75%;
            padding: 6px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 0.9em;
        }

        input[type="submit"] {
            width: 75%;
            height: 36px;
            border: none;
            background-color: #6C3483;
            border-radius: 20px;
            font-size: 14px;
            color: white;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #884EA0;
        }

        .resultado-label {
            font-weight: bold;
            margin-top: 20px;
            font-size: 1.1em;
            color: #333;
        }

        .success {
            color: green;
            font-size: 1.2em;
            font-weight: bold;
            margin-top: 8px;
        }

        .error {
            color: red;
            font-weight: bold;
            margin-top: 8px;
        }

        .salir {
            position: absolute;
            top: 20px;
            right: 20px;
        }

        .salir input[type="submit"] {
            width: auto;
            padding: 8px 16px;
            height: auto;
            background-color: #6C3483;
            font-size: 13px;
            border-radius: 20px;
        }

        .salir input[type="submit"]:hover {
            background-color: #884EA0;
        }
    </style>
</head>
<body>

    <!-- Botón salir -->
    <form class="salir" action="login.jsp" method="get">
        <input type="submit" value="Salir">
    </form>

    <div class="container">
        <h2>Conversión de Unidades</h2>

        <form action="ConUniControlador" method="post">
            <label>Valor:</label>
            <input type="number" name="valor" step="any" required>
            <label>Tipo de conversión:</label>
            <select name="tipo">
                <option value="inAcm">Pulgadas a Centímetros</option>
                <option value="cmAin">Centímetros a Pulgadas</option>
            </select><br/>
            <input type="submit" value="Convertir">
        </form>

        <div class="resultado-label">Resultado:</div>

        <%
            ConUni resultado = (ConUni) request.getAttribute("resultado");
            if (resultado != null) {
        %>
            <p class="success">Conversión de: <%= resultado.getTipo() %></p>
            <p class="success">Entrada: <%= resultado.getEntrada() %></p>
            <p class="success">Resultado: <%= resultado.getResultado() %></p>
        <%
            }
        %>

        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje != null) {
        %>
            <p class="error"><%= mensaje %></p>
        <%
            }
        %>
    </div>
</body>
</html>
