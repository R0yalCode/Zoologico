# Zoológico

![image](https://github.com/user-attachments/assets/61e6ddc5-c524-458b-a9c7-c7536f80d217)

> Diagrama de clases-UML del zoologico


# Sistema de Gestión Integral de un Zoológico
Este trabajo se basa principalmente en un sistema de zoológico representado mediante un diagrama de clases-UML en el cual se va a representar diferentes partes que tiene como estructura un zoológico, es decir los seres vivos, la administración del zoológico, la gestion de clientes y diversas clasificaciones de los animales.

# Objetivo Principal del Proyecto: Gestión Integral de un Zoológico

Definir las entidades principales de un zoológico, sus relaciones y los métodos que permiten gestionar la información de los animales, los empleados, los clientes, las jaulas y otros elementos relevantes.

# Cómo Ejecutar el Proyecto
Para poder ejecutar este proyecto en tu máquina local, sigue estos pasos:
##### 1. Preparación del Entorno
Antes de ejecutar el proyecto, asegúrate de tener todo lo necesario instalado en tu máquina.

###### - Instalar JDK 8 o Superior
Este proyecto está desarrollado en Java, por lo que necesitas tener el JDK 8 o superior instalado.

- Versión requerida: JDK 8 o superior
- Cómo instalarlo: Puedes descargarlo desde el sitio oficial de Oracle [aqui](https://www.oracle.com/java/technologies/downloads/#java8).

Una vez instalado, asegúrate de que el JDK esté correctamente configurado en tu sistema. Puedes verificarlo abriendo una terminal o línea de comandos y ejecutando:

      java -version

Si ves algo similar a esto, significa que el JDK está correctamente instalado:

    java version "1.8.0_281"
    Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
    Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)

###### - Instalar un IDE (Opcional)
Es recomendable usar un IDE (Entorno de Desarrollo Integrado) para trabajar con el proyecto. Dos opciones populares son:

- **IntelliJ IDEA**: Un potente IDE para Java. Puedes descargarlo desde [aqui](https://www.jetbrains.com/idea/download/?section=windows).
- **Eclipse**: Otro popular IDE para desarrollo en Java. Descárgalo desde [aqui](https://www.eclipse.org/downloads/packages/installer).

##### 2. Clonar el Repositorio
Ahora que tienes el entorno preparado, lo siguiente es clonar el repositorio del proyecto en tu máquina local.

######  Clonar el repositorio: 
Abre tu terminal o línea de comandos.
Utiliza el siguiente comando para clonar el repositorio en tu máquina local. Esto descargará todos los archivos del proyecto.

    git clone https://github.com/tu_usuario/zoologico.git
-  Asegúrate de reemplazar `tu_usuario` con tu nombre de usuario de GitHub.

######  **Navega al directorio del proyecto:**
Cambia tu directorio actual al directorio del proyecto recién clonado. Esto es necesario para que puedas ejecutar los siguientes comandos en el contexto del proyecto.

    cd zoologico

##### 3.  Compilar el Proyecto
Antes de ejecutar el proyecto, debes compilar los archivos .java para generar los archivos .class necesarios para la ejecución.
######   **Compilar el código**:
Ejecuta el siguiente comando en la terminal para compilar todos los archivos .java en el directorio actual:

    javac *.java
Esto creará los archivos .class que el programa necesita para ejecutarse.

##### 4. Ejecutar el Proyecto
Con los archivos ya compilados, ahora puedes ejecutar el proyecto.

######  Ejecutar el proyecto:
Usa el siguiente comando para correr el sistema:

    java Zoologico

######  Interacción con el sistema:
El sistema debería iniciar y mostrar un menú interactivo en la consola donde podrás elegir entre varias opciones, como registrar un nuevo animal, comprar boletos, o consultar el historial médico de los animales. Por ejemplo:

```java
Bienvenido al Sistema de Gestión de Zoológico
Selecciona una opción:
1. Registrar un nuevo animal
2. Comprar boletos
3. Consultar historial médico de un animal
4. Salir

```

# Clases del Sistema
A continuación, se presenta la lista de clases que forman parte del sistema, junto con una breve descripción de su función:

`Animal.class` Representa a los animales que habitan en el zoológico. Incluye atributos como la edad, el peso, el tipo de cuerpo (vertebrado o invertebrado), la dieta, y el nombre científico. Además, ofrece métodos para indicar diagnósticos, sugerir alimentos, y mostrar el nombre científico del animal.

`Boleto.class` Gestiona la información relacionada con los tickets de entrada al zoológico. Contiene detalles como el número de boleto, la fecha de visita y el valor del ticket, así como métodos para comprar boletos e imprimir información del boleto.

`Cliente.class` Hereda de la clase Persona y representa a los visitantes del zoológico. Permite gestionar la compra de boletos y la información de historial de visitas de los clientes.

`Compra.class` Maneja las transacciones relacionadas con la compra de boletos. Registra detalles como el número de compra, el total y los boletos comprados.

`Cuidador.class` Es una subclase de Empleado responsable del cuidado diario de los animales, incluyendo tareas como alimentar a los animales y cuidar de sus jaulas.

`Direccion.class` Maneja la información de direcciones asociadas a personas o entidades dentro del sistema. Incluye atributos como calle principal, calle secundaria, y referencia, y un método para mostrar la ubicación.

`Empleado.class` Clase base que representa a todos los trabajadores del zoológico, con atributos como contador, identificación y salario. Esta clase se subdivide en varios tipos de empleados, incluyendo cuidadores, veterinarios y personal de limpieza.

`Estado.class` Enumeración que define los estados o condiciones en que pueden encontrarse los animales, como dormido, comiendo, herido, entre otros.

`Guia.class` Es una subclase de Empleado encargada de proporcionar información y orientación a los visitantes del zoológico, incluyendo establecer recorridos y agregar clientes a los tours.

`HistorialMeico.class` Registra los diagnósticos médicos y fechas relacionadas con el historial de salud de cada animal, permitiendo un registro detallado del historial médico.

`Jaula.class` Representa los recintos físicos donde se alojan los animales, con atributos como capacidad, estado de limpieza, y el número de la jaula. También cuenta con métodos para agregar animales y mostrar el número de jaula.

`Persona.class` Clase abstracta que representa a todas las personas en el sistema, gestionando datos como nombre, edad y cédula.

`PersonalAdministrativo.class` Es una subclase de Empleado que se encarga de tareas administrativas, como la gestión de recursos del zoológico.

`PersonalLimpieza.class` Es una subclase de Empleado responsable de mantener las instalaciones del zoológico limpias y en buen estado.

`SerVivo.class` Clase base que representa a todos los seres vivos en el zoológico, tanto personas como animales. Define atributos esenciales como el nombre y la fecha de nacimiento y un método para calcular la edad.

`TipoEstado.class` Enumeración que describe los diferentes estados en los que puede encontrarse un animal, incluyendo estados como comiendo, dormido, enfermo, estresado, hambriento, herido y normal.

`TipoCuerpo.class` Enumeración que clasifica a los animales según su tipo de cuerpo, ya sea vertebrado o invertebrado.

`TipoDieta.class` Enumeración que clasifica a los animales según su dieta, permitiendo categorizar entre carnívoros, herbívoros, omnívoros, entre otros.

`TipoAlimento.class` Enumeración que especifica los diferentes tipos de alimentos que se pueden proporcionar a los animales, como carne, pescado, hierba, y fruta.

`Veterinario.class` Subclase de Empleado especializada en la atención médica de los animales. Es responsable de realizar diagnósticos, tratamientos y verificar la especialidad del veterinario.

`Zona.class` Representa las distintas áreas del zoológico, como Este, Norte, Oeste y Sur, y agrupa las jaulas en diferentes secciones.

`Zoologico.class` Clase principal que coordina todas las operaciones y entidades dentro del zoológico. Contiene información general del zoológico, como el nombre y capacidad, y métodos para agregar animales, calcular el número de empleados y mostrar información general del zoológico.

# Autores: 
## [Israel Rodriguez](https://github.com/IsraelSRodriguezT)
## [Carlos Granda](https://github.com/Carlosjosu)
## [Royel Jima](https://github.com/R0yalCode)
## [Steeven Pardo](https://github.com/Dan1el17)
## [Juan Calopino](https://github.com/JuaaanCalopino)
