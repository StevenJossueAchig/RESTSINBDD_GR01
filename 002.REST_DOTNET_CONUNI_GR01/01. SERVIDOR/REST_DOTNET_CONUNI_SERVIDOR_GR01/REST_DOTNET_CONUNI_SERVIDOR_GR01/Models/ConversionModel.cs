using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace REST_DOTNET_CONUNI_SERVIDOR_GR01.Models
{
    public class ConversionModel
    {
        public double Valor { get; set; }
        public string Tipo { get; set; } // "cm_a_pulgadas" o "pulgadas_a_cm"
    }
}