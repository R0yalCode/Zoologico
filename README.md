# Zoologico

![image](https://github.com/user-attachments/assets/baaf0ddc-b2d6-4f7d-a1d5-2242d1b748c1)
> Diagrama de clases-UML del zoologico

## Sistema de Gestión de un Zoológico
Este trabajo se basa principalmente en un sistema de zoológico representado mediante un diagrama de clases-UML en el cual se va a representar diferentes partes que tiene como estructura un zoológico, es decir los seres vivos, la administración del zoológico, la gestion de clientes y diversas clasificaciones de los animales.
## Objetivo Principal
Definir las entidades principales de un zoológico, sus relaciones y los métodos que permiten gestionar la información de los animales, los empleados, los clientes, las jaulas y otros elementos relevantes.
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


