# RESTSINBDD_GR01  
Conversión de Unidades REST sin Base de Datos — Java y .NET

**Autores:** Grupo 1  
**Materia:** Arquitectura de Software  
**Carrera:** Ingeniería en Software  
**Nivel:** Octavo Nivel  
**Institución:** Universidad de las Fuerzas Armadas ESPE  

## Descripción del Proyecto

Este repositorio contiene una serie de proyectos diseñados para implementar un sistema de **conversión de unidades mediante servicios web REST sin persistencia en base de datos**, desarrollado en **Java** y **.NET**.

El sistema expone un servidor REST que proporciona operaciones de conversión, el cual es consumido por cuatro tipos de clientes:

- Cliente Web  
- Cliente de Consola  
- Cliente Móvil  
- Cliente de Escritorio  

El objetivo es demostrar la implementación y consumo de servicios REST en distintas plataformas utilizando buenas prácticas de arquitectura de software, como separación por capas y uso de patrones adecuados.

## Tecnologías Utilizadas

### Java

- Apache NetBeans
- JDK 8 o superior
- Payara Server
- Jersey para servicios REST

### .NET

- Visual Studio 2022
- .NET SDK 8.0
- ASP.NET Core
- IIS (Internet Information Services)

## Estructura del Repositorio
RESTSINBDD_GR01/
├── Java/
│ ├── ServidorREST/
│ ├── ClienteConsola/
│ ├── ClienteWeb/
│ ├── ClienteMovil/
│ └── ClienteEscritorio/
├── DotNet/
│ ├── ServidorREST/
│ ├── ClienteConsola/
│ ├── ClienteWeb/
│ ├── ClienteMovil/
│ └── ClienteEscritorio/
└── README.md

## Requisitos Previos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar los proyectos:

- [Visual Studio 2022](https://visualstudio.microsoft.com/es/vs/)
- [ASP.NET Core SDK](https://dotnet.microsoft.com/es-es/download/dotnet)
- [Apache NetBeans](https://netbeans.apache.org/)
- [JDK 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Payara Server](https://www.payara.fish/downloads/)
- [IIS (Windows)](https://learn.microsoft.com/en-us/iis/install/installing-iis-7/)

## Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/RESTSINBDD_GR01.git
cd RESTSINBDD_GR01

## Licencia

Este proyecto está autorizado bajo la Licencia MIT; consulte el archivo de [Licencia](LICENSE.txt) para mas detalles.

