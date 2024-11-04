import java.util.ArrayList;
import java.util.List;
public class Zoologico {
    //Atributos:
    private int capacidad;
    private String nombre;
    private String telefono;
    private static Zoologico instancia;
    //Asociacion:
    private List <SerVivo> seresVivos;
    //Agregacion:
    private Direccion direccion;
    //Constructor:
    private Zoologico(String nombre, String telefono, int capacidad, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.direccion = direccion;
        this.seresVivos = new ArrayList<>();
    }
    //Getter:
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public static Zoologico getInstance(String nombre, String telefono, int capacidad, Direccion direccion){
        if(instancia==null){
            instancia=new Zoologico(nombre,telefono,capacidad,direccion);
        }
        return instancia;
    }
    //Metodos:
    public void agregarAnimal(Animal animal) {
        if (seresVivos.size() < capacidad) {
            seresVivos.add(animal);
            System.out.println("! " + animal.getNombre() + " agregado al zoológico !");
        } else {
            System.out.println("< No se puede agregar (" + animal.getNombre() + "), capacidad máxima alcanzada >");
        }
    }
    public void calcularAnimales(){
        int numeroAnimales=Animal.getContador();
        System.out.println("Numero de animales: "+numeroAnimales);
    }
    public void calcularEmpleados(){
        int numeroEmpleados=Empleado.getContador();
        System.out.println("Numero de empleados: "+numeroEmpleados);
    }
    public void indicarInformacion(){
        System.out.println(getNombre()+" | Telefono: "+getTelefono()+" | Capacidad: ("+getCapacidad()+") animales | "
                +direccion.mostrarUbicacion());
    }
}
