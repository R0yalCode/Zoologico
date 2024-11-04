import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class PersonalLimpieza extends Empleado{
    //Asociacion:
    private List <Jaula> jaulas;
    //Constructor:
    public PersonalLimpieza(String nombre, LocalDate fechaNacimiento, String cedula, float salario, Zona zona) {
        super(nombre, fechaNacimiento, cedula, salario, zona);
        this.jaulas=new ArrayList<>();
    }
    //Metodos:
    public void limpiarJaula(Jaula... jaulas) {
        for (Jaula jaula : jaulas) {
            if (jaula.isEstaLimpio()) {
                System.out.println("[ La jaula " + jaula.getNumeroJaula() + " ya está limpia ]");
            } else {
                System.out.println("-> "+getNombre()+" está limpiando la jaula "+jaula.getNumeroJaula());
                jaula.setEstaLimpio(true); // Cambia el estado a limpio
                System.out.println("--> La jaula " + jaula.getNumeroJaula() + " ahora está limpia");
            }
        }
    }
}
