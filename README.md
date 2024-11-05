# Zoologico

![image](https://github.com/user-attachments/assets/46b1261e-fa0b-44bc-a197-28650403cfa7)

> Diagrama de clases-UML del zoologico


# Sistema de Gestión de un Zoológico

Este trabajo se basa principalmente en un sistema de zoológico representado mediante un diagrama de clases-UML en el cual se va a representar diferentes partes que tiene como estructura un zoológico, es decir los seres vivos, la administración del zoológico, la gestion de clientes y diversas clasificaciones de los animales.

# Objetivo Principal

Definir las entidades principales de un zoológico, sus relaciones y los métodos que permiten gestionar la información de los animales, los empleados, los clientes, las jaulas y otros elementos relevantes.

# Requisitos
#### Requisitos de Software:
###### Sistema Operativo
- **Compatible con**: Windows, macOs o Linux.

###### JDK
- **Versión**: JDK 8 o superior. Asegúrate de tenerlo instalado para compilar y ejecutar el proyecto. Puedes descargarlo desde [aqui](https://www.oracle.com/java/technologies/downloads/#java8).

###### IDE (Entorno de Desarrollo Integrado)
- **IntelliJ IDEA**: Un potente IDE para Java. Puedes descargarlo desde [aqui](https://www.jetbrains.com/idea/download/?section=windows).
- **Eclipse**: Otro popular IDE para desarrollo en Java. Descárgalo desde [aqui](https://www.eclipse.org/downloads/packages/installer).

###### Compilador
- **Java Compiler**: Asegúrate de que el compilador de Java esté configurado correctamente en tu erntorno de desarrollo.

- **Visual Studio Code (opcional)**
Descarga e instala Visual Studio Code desde su sitio web oficial. Para ir al sitio oficial ingresa [aqui](https://code.visualstudio.com/).
**Java Extension Pack**: Instala esta extensión para facilitar el desarrollo en Java.

# Cómo Ejecutar el Proyecto
Sigue estos pasos para clonar, compilar y ejecutar el proyecto del zoológico:

##### Clona el repositorio:

Abre tu terminal o línea de comandos.
Utiliza el siguiente comando para clonar el repositorio en tu máquina local. Esto descargará todos los archivos del proyecto.

    git clone https://github.com/tu_usuario/zoologico.git
-  Asegúrate de reemplazar `tu_usuario` con tu nombre de usuario de GitHub.

##### Navega al directorio del proyecto:

Cambia tu directorio actual al directorio del proyecto recién clonado. Esto es necesario para que puedas ejecutar los siguientes comandos en el contexto del proyecto.

    cd zoologico

##### Compila el proyecto:

Antes de ejecutar la aplicación, necesitas compilar los archivos .class de Java. Utiliza el siguiente comando, que compilará todos los archivos de clase en el directorio actual.

    javac *.class

- Asegúrate de tener el JDK instalado y configurado correctamente en tu sistema. Si tienes problemas con la compilación, verifica que tu ruta de JDK esté correctamente añadida a las variables de entorno.




# Clases del Sistema
A continuación, se presenta la lista de clases que forman parte del sistema, junto con una breve descripción de su función:

`Animal.class` Representa a los animales que habitan en el zoológico, incluyendo atributos como especie, género, y características específicas del comportamiento y la dieta.

`Boleto.class `Gestiona la información relacionada con los tickets de entrada al zoológico, incluyendo detalles como el precio, la fecha de compra y el tipo de entrada.

`Cliente.class` Hereda de la clase Persona y representa a los visitantes del zoológico, manejando datos sobre su historial de visitas y boletos adquiridos.

`Compra.class `Se encarga de la lógica de las transacciones relacionadas con la compra de boletos y otros servicios, registrando detalles de la compra.

`Cuidador.class `Subclase de Empleado, responsable del cuidado diario de los animales, asegurando su bienestar a través de la alimentación y el mantenimiento de sus recintos.

`Direccion.class` Maneja la información de direcciones asociadas a las personas y entidades dentro del sistema, permitiendo gestionar la ubicación de los empleados y clientes.

`Empleado.class` Clase base que representa a todos los trabajadores del zoológico. Se subdivide en diferentes tipos de empleados, como cuidadores y veterinarios.

`Estado.class` Define los estados o condiciones que pueden aplicarse a los animales o empleados, permitiendo gestionar su estatus dentro del sistema.

`Guia.class` Subclase de Empleado, encargada de proporcionar información y orientación a los visitantes durante su recorrido por el zoológico.

`Jaula.class `Representa los recintos físicos donde se alojan los animales, incluyendo atributos como tamaño, capacidad y un identificador único para cada jaula.

`Main.class` Clase principal del programa, que contiene el método main y gestiona la ejecución del sistema.

`Persona.class` Clase abstracta que representa a las personas en el sistema, gestionando datos comunes como nombre, edad y fecha de nacimiento.

`PersonalAdministrativo.class` Subclase de Empleado que se encarga de las tareas administrativas y de gestión del zoológico.

`PersonalLimpieza.class` Subclase de Empleado responsable de mantener las instalaciones del zoológico limpias y en buen estado.

`SerVivo.class` Clase base que representa a todos los seres vivos, tanto animales como personas, definiendo atributos esenciales como nombre y fecha de nacimiento.

`TipoCuerpo.class` Enum que clasifica a los animales según su tipo de cuerpo, proporcionando categorías como vertebrados e invertebrados.

`TipoDieta.class` Enum que clasifica a los animales según su dieta, permitiendo categorizar entre carnívoros, herbívoros y omnívoros.

`Veterinario.class `Subclase de Empleado especializada en la atención médica de los animales, responsable de su salud y bienestar.

`Zona.class` Representa las distintas áreas del zoológico, agrupando las jaulas y recintos en diferentes secciones temáticas o geográficas.

`Zoologico.class` Clase principal que coordina todas las operaciones y entidades dentro del zoológico, actuando como un punto de acceso central para la gestión del sistema.

# Autores: 
## [Israel Rodriguez](https://github.com/IsraelSRodriguezT)
## [Carlos Granda](https://github.com/Carlosjosu)
## [Royel Jima](https://github.com/R0yalCode)
## [Steeven Pardo](https://github.com/Dan1el17)
## [Juan Calopino](https://github.com/JuaaanCalopino)
