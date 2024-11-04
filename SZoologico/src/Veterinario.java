import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Veterinario extends Empleado{
    //Atributos:
    private String especialidad;
    //Asociacion:
    private List<Animal> animales;
    //Constructor:
    public Veterinario(String nombre, LocalDate fechaNacimiento, String cedula,
                       float salario, Zona zona, String especialidad) {
        super(nombre, fechaNacimiento, cedula, salario, zona);
        this.especialidad = especialidad;
        this.animales=new ArrayList<>();
    }
    //Getter:
    public String getEspecialidad(){
        return especialidad;
    }
    //Metodos:

    public void realizarDiagnostico(Animal... animales) {
        for (Animal animal : animales) {
            System.out.println("[ "+getNombre() + " revisa y examina al " + animal.getNombre()+" ]");
            Estado estadoActual = animal.getEstado();

            if (estadoActual == Estado.ENFERMO || estadoActual == Estado.HERIDO || estadoActual == Estado.ESTRESADO) {
                System.out.println("-> El animal está en mal estado (" + estadoActual + "). Iniciando tratamiento...");
                realizarTratamiento(animal);
            } else {
                System.out.println("-> El animal está en buen estado (" + estadoActual + "). No se requiere tratamiento");
            }
        }
    }
    public void realizarTratamiento(Animal animal){
        animal.setEstado(Estado.NORMAL); // Cambiar el estado a NORMAL después del tratamiento
        System.out.println("--> El " + animal.getNombre() + " ha sido tratado y ahora se encuentra bien (NORMAL)");
    }
}
