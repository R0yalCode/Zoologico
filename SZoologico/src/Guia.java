import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
public class Guia extends Empleado{
    //Asociacion:
    private List<Cliente> clientes;
    //Constructor:
    public Guia(String nombre, LocalDate fechaNacimiento,String cedula, float salario, Zona zona) {
        super(nombre, fechaNacimiento, cedula, salario, zona);
        this.clientes=new ArrayList<>();
    }
    //Metodos:
    public void agregarCliente(Cliente... nuevosClientes) {
        for (Cliente cliente : nuevosClientes) {
            this.clientes.add(cliente);
        }
    }
    private String establecerRecorrido(){
        List <Zona> zonas = Arrays.asList(Zona.values());
        Collections.shuffle(zonas);
        StringBuilder recorrido = new StringBuilder();
        for(Zona zona : zonas) {
            recorrido.append(zona).append(" -> ");
        }
        recorrido.setLength(recorrido.length() - 4); // Elimina el último " -> "
        return recorrido.toString();
    }
    public void mostrarCliente() {
        String clientesNombres = clientes.stream().map(Cliente::getNombre)
                .collect(Collectors.joining(", "));
        System.out.println("| Guía: " + nombre + " | Clientes asignados: " + clientesNombres+
                " | Recorrido: "+establecerRecorrido()+" |");
    }
}
