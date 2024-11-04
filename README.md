# Zoologico

![image](https://github.com/user-attachments/assets/baaf0ddc-b2d6-4f7d-a1d5-2242d1b748c1)

> Diagrama de clases-UML del zoologico


# Sistema de Gestión de un Zoológico

Este trabajo se basa principalmente en un sistema de zoológico representado mediante un diagrama de clases-UML en el cual se va a representar diferentes partes que tiene como estructura un zoológico, es decir los seres vivos, la administración del zoológico, la gestion de clientes y diversas clasificaciones de los animales.

# Objetivo Principal

Definir las entidades principales de un zoológico, sus relaciones y los métodos que permiten gestionar la información de los animales, los empleados, los clientes, las jaulas y otros elementos relevantes.

# Requisitos
#### Requisitos de Software:
###### Sistema Operativo
- **Compatible con**: Windows, macOS o Linux.

###### JDK
- **Versión**: JDK 8 o superior. Asegúrate de tenerlo instalado para compilar y ejecutar el proyecto. Puedes descargarlo desde [aqui](https://www.oracle.com/java/technologies/downloads/#java8).

###### IDE (Entorno de Desarrollo Integrado)
- **IntelliJ IDEA**: Un potente IDE para Java. Puedes descargarlo desde [aqui](https://www.jetbrains.com/idea/download/?section=windows).
- **Eclipse**: Otro popular IDE para desarrollo en Java. Descárgalo desde [aqui](https://www.eclipse.org/downloads/packages/installer).

###### Compilador
- **Java Compiler**: Asegúrate de que el compilador de Java esté configurado correctamente en tu entorno de desarrollo.

- **Visual Studio Code (opcional)**
Descarga e instala Visual Studio Code desde su sitio web oficial. Para ir al sitio oficial ingresa [aqui](https://code.visualstudio.com/).
**Java Extension Pack**: Instala esta extensión para facilitar el desarrollo en Java.

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

## Caracteristicas del Diagrama de Clases UML - Zoológico

- **Zoológico** :
  Se podra decir que esta seria la clase principal en la cual se implementan varias clases relacionadas con un zoológico.
- **Persona** :
  De esta Clase Abstracta surgen sub clases que forman parte de un zoológico como los empleados y seres vivos, ademas permite gestionar datos comunes de las personas.
- **SerVivo** :
  Es una clase de la cual heredan tanto animal como persona ya que ambos tienen vida, define atributos esenciales para cualquier ser vivo, como el nombre y la fecha de nacimiento, lo que permite calcular su edad.
- **Empleado** :
  Es una clase que hereda de Persona y representa a los trabajadores del zoológico, se subdivide en diferentes sub clases que cuentan cómo personal especializado de un zoológico como por ejemplo : Veterinario, Cuidador, Personal Administrativo, Guia y Personal de Limpieza.
- **Animal** :
  Esta clase hereda de SerVivo y representa a los animales del zoológico. Incluye atributos específicos como especie, género, familia, peso y tipo de cuerpo. Además, se relaciona con Jaula para definir dónde habitan los animales.
- **Jaula** :
  Representa los recintos donde se encuentran los animales, cada jaula tiene atributos como tamaño, capacidad y un número identificador único el cual se considera de tipo cadena ya que la mayoria de jaulas suelen tener caracteres y numeros, está relacionada con la clase Animal.
- **Cuidador**:
  Subclase de Empleado encargada de la alimentación, cuidado y limpieza de los recintos de los animales. Su principal responsabilidad es el bienestar de los animales en términos de alimentación y aseo.

- **Veterinario**:
  Es una subclase de Empleado que se especializa en la atención médica de los animales

- **PersonalAdministrativo**:
  Subclase de Empleado que abarca a aquellos empleados que desempeñan tareas administrativas y de gestión dentro del zoológico, como la organización y la administración de recursos.

- **PersonalLimpieza**:
  Subclase de Empleado encargada de mantener en buenas condiciones las instalaciones del zoológico mediante tareas de limpieza.

- **Guia**:
  Subclase de Empleado que se encarga de proporcionar información a los visitantes y guiarlos en sus recorridos por el zoológico.

- **Cliente**:
  Hereda de Persona y representa a los visitantes del zoológico que adquieren boletos para ingresar. Está relacionado con la clase Boleto, que gestiona la compra y la información del acceso de los clientes.
- **Boleto**:
  Clase que se encarga de manejar los tickets que los clientes adquieren para visitar el zoológico. Define atributos como el valor del boleto, la cantidad, la fecha de la visita, entre otros.
- **Enumeraciones (Especie y Cuerpo)**:
  Sirven para clasificar a los animales según su dieta (CARNIVORO, HERVIVORO, OMNIVORO) y la presencia o ausencia de columna vertebral (VERTEBRADO, INVERTEBRADO).
  
# Cómo Ejecutar el Proyecto

##### - Clona el repositorio: 

    git clone https://github.com/R0yalCode/zoologico.git

###### Espera a que termine el proceso
Una vez que se complete la clonación, verás un mensaje indicando que el repositorio se ha clonado correctamente.

##### - Navega al directorio del proyecto:
    cd zoologico

##### - Compila el proyecto:
    javac *.class

##### - Ejecuta la aplicación:
    java Main




# Autores: 
## [Israel Rodriguez](https://github.com/IsraelSRodriguezT)
## [Carlos Granda](https://github.com/Carlosjosu)
## [Royel Jima](https://github.com/R0yalCode)
## [Steeven Pardo](https://github.com/Dan1el17)
## [Juan Calopino](https://github.com/JuaaanCalopino)
