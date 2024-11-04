import java.time.LocalDate;
abstract class Persona extends SerVivo {
    //Atributos:
    protected String cedula;
    protected int edad;
    //Constructores:
    public Persona(String nombre, LocalDate fechaNacimiento, String cedula) {
        super(nombre, fechaNacimiento); //Constructor de clase SerVivo
        this.cedula=cedula;
        this.edad=calcularEdad();
    }
    //Getter:
    public String getCedula() {
        return cedula;
    }
    public int getEdad() {
        return edad;
    }
}