import java.time.LocalDate;
import java.time.Period;
public abstract class SerVivo {
    //Atributos:
    protected LocalDate fechaNacimiento;
    protected String nombre;
    //Constructor:
    public SerVivo(String nombre, LocalDate fechaNacimiento){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }
    //Getter:
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public String getNombre(){
        return nombre;
    }
    //Metodos:
    public int calcularEdad(){
        LocalDate fechaActual=LocalDate.now();
        if((getFechaNacimiento()!=null)&&(getFechaNacimiento().isBefore(fechaActual)||
                getFechaNacimiento().equals(fechaActual))){
            return Period.between(getFechaNacimiento(),fechaActual).getYears();
        } else{
            return 0;
        }
    }
}
