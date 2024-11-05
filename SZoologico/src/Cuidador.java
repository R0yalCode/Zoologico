import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Cuidador extends Empleado {
    //Asociacion:
    private List <Animal> animales;
    //Constructor:
    public Cuidador(String nombre, LocalDate fechaNacimiento, String cedula,
                    float salario, Zona zona) {
        super(nombre, fechaNacimiento, cedula, salario, zona);
        this.animales=new ArrayList<>();
    }
    //Metodos:
    public void cuidarAnimal(Animal... animalesCuidar) {
        for (Animal animal : animalesCuidar) {
            System.out.println("[ "+getNombre() + " está cuidando al " + animal.getNombre()+" ]");
            animales.add(animal);
            Estado estadoActual = animal.getEstado();
            if (estadoActual == Estado.HAMBRIENTO) {
                System.out.println("-> El "+animal.getNombre()+" tiene hambre");
                darComida(animal);
            } else if (estadoActual == Estado.NORMAL) {
                System.out.println("-> El " + animal.getNombre() + " no tiene hambre en este momento");
            } else if (estadoActual == Estado.COMIENDO) {
                System.out.println("-> El " + animal.getNombre() + " ya estaba comiendo");
            }
        }
    }
    private void darComida(Animal animal){
        System.out.println("--> "+getNombre()+" va a alimentarlo con ("+animal.sugerirAlimento()+") ");
        animal.setEstado(Estado.COMIENDO);
        System.out.println("---> El " + animal.getNombre() + " ya se encuentra comiendo su alimento");
    }
}
