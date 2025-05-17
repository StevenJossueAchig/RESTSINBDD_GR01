using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace REST_DOTNET_CONUNI_SERVIDOR_GR01.Services
{
    public class LoginService
    {
        public bool ValidarCredenciales(string usuario, string clave)
        {
            return usuario == "MONSTER" && clave == "MONSTER9";
        }
    }
}