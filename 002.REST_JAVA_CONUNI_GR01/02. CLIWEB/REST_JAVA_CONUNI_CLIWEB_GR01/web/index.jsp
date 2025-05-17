<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
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
            background-repeat: no-repeat;
            opacity: 0.6;
            z-index: -1;
        }

        .formulario {
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            width: 400px;
            padding: 30px 40px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .formulario h2 {
            text-align: center;
            padding: 20px 0;
            border-bottom: 1px solid silver;
            margin: 0;
        }

        .campo {
            position: relative;
            margin: 30px 0;
            border-bottom: 2px solid #adadad;
        }

        .campo input {
            width: 100%;
            padding: 5px;
            height: 40px;
            font-size: 16px;
            border: none;
            background: none;
            outline: none;
        }

        .campo label {
            position: absolute;
            top: 50%;
            left: 5px;
            color: #adadad;
            transform: translateY(-50%);
            font-size: 16px;
            pointer-events: none;
            transition: 0.3s;
        }

        .campo input:focus ~ label,
        .campo input:valid ~ label {
            top: -5px;
            color: #6C3483;
            font-size: 14px;
        }

        input[type="submit"] {
            width: 100%;
            height: 50px;
            border: 1px solid;
            background: #6C3483;
            border-radius: 25px;
            font-size: 18px;
            color: white;
            cursor: pointer;
            outline: none;
            transition: .5s;
        }

        input[type="submit"]:hover {
            border-color: purple;
        }

        .error {
            color: red;
            margin-top: 10px;
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="formulario">
        <h2>Inicio de Sesión</h2>
        <form action="LoginControlador" method="post">
            <div class="campo">
                <input type="text" id="usuario" name="usuario" required>
                <label for="usuario">Usuario</label>
            </div>

            <div class="campo">
                <input type="password" id="contrasena" name="contrasena" required>
                <label for="contrasena">Contraseña</label>
            </div>

            <input type="submit" value="Entrar">
        </form>

        <c:if test="${not empty mensaje}">
            <div class="error">${mensaje}</div>
        </c:if>
    </div>
</body>
</html>
