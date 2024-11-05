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
Utiliza el siguiente comando para clonar el repositorio en tu máquina local. Estos descargará todos los archivos del proyecto.

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

`Animal.class` Representa a los animales que habitan en el zoológico. Incluyendo atributos como la edad, el peso, el tipo de cuerpo(vertebrado o invertebrado), la dieta, y el nombre científico. Además, ofrece métodos para indicar diagnósticos, sugerir alimentos, y mostrar el nombre científico del animal.

`Boleto.class `Gestiona la información relacionada con los tickets de entrada al zoológico. Contiene detalles como el número de boleto, la fecha de visita y el valor del ticket, así como métodos para comprar boletos e imprimir información del boleto.

`Cliente.class` Hereda de la clase Persona y representa a los visitantes del zoológico. Permite gestionar la compra de boletos y la información de historial de visitas de los clientes.

`Compra.class `Maneja las transacciones relacionadas con la compra de boletos. Registra detalles como el número de compra, el total y los boletos comprados.

`Cuidador.class `Es una subclase de Empleado responsable del cuidado diario de los animales, incluyendo tareas como alimentar a los animales y cuidar de sus jaulas.

`Direccion.class` Maneja la información de direcciones asociadas a personas o entidades dentro del sistema. Incluye atributos como calle principal, calle secundaria, y referencia, y un método para mostrar la ubicación.

`Empleado.class` Clase base que representa a todos los trabajadores del zoológico, con atributos como contador, identificación y salario. Esta clase se subdivide en varios tipos de empleados, incluyendo cuidadores, veterinarios y personal de limpieza.

`Estado.class` Enumeración que define los estados o condiciones en que pueden encontrarse los animales, como dormido, comiendo, herido, entre otros.

`Guia.class` Es una subclase de Empleado encargada de proporcionar información y orientación a los visitantes del zoológico, incluyendo establecer recorridos y agregar clientes a los tours.

`HistorialMedico.class` Registra los diagnósticos médicos y fechas relacionadas con el historial de salud de cada animal, permitiendo un registro detallado del historial médico.

`Jaula.class `Representa los recintos físicos donde se alojan los animales, con atributos como capacidad, estado de limpieza, y el número de la jaula. También cuenta con métodos para agregar animales y mostrar el número de jaula.

`Main.class` Clase principal del programa, que contiene el método main y gestiona la ejecución del sistema.

`Persona.class` Clase abstracta que representa a todas las personas en el sistema, gestionando datos como nombre, edad y cédula.

`PersonalAdministrativo.class` Es una subclase de Empleado que se encarga de tareas administrativas, como la gestión de recursos del zoológico.

`PersonalLimpieza.class` Es una subclase de Empleado responsable de mantener las instalaciones del zoológico limpias y en buen estado.

`SerVivo.class` Clase base que representa a todos los seres vivos en el zoológico, tanto personas como animales. Define atributos esenciales como el nombre y la fecha de nacimiento y un método para calcular la edad.

`TipoCuerpo.class` Enumeración que clasifica a los animales según su tipo de cuerpo, ya sea vertebrado o invertebrado.

`TipoDieta.class` Enumeración que clasifica a los animales según su dieta, permitiendo categorizar entre carnívoros, herbívoros, omnívoros, entre otros.

`TipoAlimento.class` Enumeración que especifica los diferentes tipos de alimentos que se pueden proporcionar a los animales, como carne, pescado, hierba, y fruta.

`Veterinario.class `Subclase de Empleado especializada en la atención médica de los animales. Es responsable de realizar diagnósticos, tratamientos y verificar la especialidad del veterinario.

`Zona.class` Representa las distintas áreas del zoológico, como Este, Norte, Oeste y Sur, y agrupa las jaulas en diferentes secciones.

`Zoologico.class` Clase principal que coordina todas las operaciones y entidades dentro del zoológico. Contiene información general del zoológico, como el nombre y capacidad, y métodos para agregar animales, calcular el número de empleados y mostrar información general del zoológico.

# Autores: 
## [Israel Rodriguez](https://github.com/IsraelSRodriguezT)
## [Carlos Granda](https://github.com/Carlosjosu)
## [Royel Jima](https://github.com/R0yalCode)
## [Steeven Pardo](https://github.com/Dan1el17)
## [Juan Calopino](https://github.com/JuaaanCalopino)
