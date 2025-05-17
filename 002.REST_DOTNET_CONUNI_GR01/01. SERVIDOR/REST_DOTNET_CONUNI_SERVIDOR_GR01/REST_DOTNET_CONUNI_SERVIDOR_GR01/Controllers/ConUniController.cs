using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using REST_DOTNET_CONUNI_SERVIDOR_GR01.Models;

namespace REST_DOTNET_CONUNI_SERVIDOR_GR01.Controllers
{
    public class ConUniController : ApiController
    {
        private readonly ConversionService _conversionService = new ConversionService();

        [HttpPost]
        [Route("api/conuni")]
        public IHttpActionResult Convertir(ConversionModel model)
        {
            if (model == null || string.IsNullOrEmpty(model.Tipo))
                return BadRequest("Datos incompletos");

            try
            {
                double resultado = _conversionService.Convertir(model.Tipo, model.Valor);
                return Ok(new { resultado });
            }
            catch (ArgumentException ex)
            {
                return BadRequest(ex.Message);
            }
        }
    }
}
