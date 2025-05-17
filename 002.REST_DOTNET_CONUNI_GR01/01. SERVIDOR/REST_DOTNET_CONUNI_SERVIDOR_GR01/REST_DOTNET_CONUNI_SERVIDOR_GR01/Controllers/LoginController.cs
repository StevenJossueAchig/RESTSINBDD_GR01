using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using REST_DOTNET_CONUNI_SERVIDOR_GR01.Models;
using REST_DOTNET_CONUNI_SERVIDOR_GR01.Services;

namespace REST_DOTNET_CONUNI_SERVIDOR_GR01.Controllers
{
    public class LoginController : ApiController
    {
        private readonly LoginService _loginService = new LoginService();

        [HttpPost]
        [Route("api/login")]
        public IHttpActionResult IniciarSesion(LoginModel model)
        {
            if (model == null)
                return BadRequest("Datos inválidos");

            bool valido = _loginService.ValidarCredenciales(model.Usuario, model.Clave);

            if (valido)
                return Ok(new { mensaje = "Login exitoso" });
            else
                return Unauthorized();
        }
    }
}
