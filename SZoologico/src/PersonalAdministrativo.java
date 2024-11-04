import java.time.LocalDate;
public class PersonalAdministrativo extends Empleado {
    //Constructor
    public PersonalAdministrativo(String nombre, LocalDate fechaNacimiento, String cedula, float salario, Zona zona) {
        super(nombre, fechaNacimiento, cedula, salario, zona);
    }
    //Metodos:
    public void gestionarRecursos(){
        System.out.println("Gestionando recursos en la zona: "+getZona());
    }
}
