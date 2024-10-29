# Zoologico
## Diagrama de clases del zoologico
![Screenshot 2024-10-28 210140](https://github.com/user-attachments/assets/4659dfcf-e165-467d-a76d-e7de80309f26)
# Sistema de Gestión de un Zoológico
Este trabajo se basa principalmente en un sistema de zoológico representado mediante un diagrama de clases-UML en el cual se va a representar diferentes partes que tiene como estructura un zoológico, es decir los seres vivos, la administración del zoológico, la gestion de clientes y diversas clasificaciones de los animales.
# Objetivo Principal
Definir las entidades principales de un zoológico, sus relaciones y los métodos que permiten gestionar la información de los animales, los empleados, los clientes, las jaulas y otros elementos relevantes.
# Caracteristicas del Diagrama de Clases UML - Zoológico
### Persona :
De esta Clase Abstracta surgen sub clases que forman parte de un zoológico como los empleados y seres vivos, ademas permite gestionar datos comunes de las personas.
### SerVivo : 
Es una clase de la cual heredan tanto animal como persona ya que ambos tienen vida, define atributos esenciales para cualquier ser vivo, como el nombre y la fecha de nacimiento, lo que permite calcular su edad.
### Empleado : 
Es una clase que hereda de Persona y representa a los trabajadores del zoológico, se subdivide en diferentes sub clases que cuentan cómo personal especializado de un zoológico como por ejemplo : Veterinario, Cuidador, Personal Administrativo, Guia y Personal de Limpieza.
