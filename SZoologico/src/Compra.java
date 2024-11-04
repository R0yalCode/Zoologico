import java.util.ArrayList;
import java.util.List;
public class Compra {
    //Atributos:
    protected static int contador;
    //Asociacion:
    private List <Boleto> boletos;
    //Constructores:
    public Compra(){
        this.boletos=new ArrayList<>();
        contador++;
    }
    //Getter:
    public static int getContador() {
        return contador;
    }
    //Metodos:
    public void agregarCliente(Cliente... clientes){
        for (Cliente cliente : clientes) {
            boletos.add(cliente.getBoleto());
        }
    }
    public float calcularTotal(){
        float total=0;
        for(Boleto boleto:boletos){
            total+=boleto.getPrecio(); //Sumar cada boleto por edad
        }
        return total;
    }
    public void mostrarTotalBoletos() {
        System.out.println("Compra "+getContador()+ ":");
        for (Boleto boleto : boletos) {
            System.out.println("Boleto: " + boleto.getNumero() +
                    " | Precio: " + boleto.getPrecio()+" | Fecha: "+boleto.getFechaVisita());
        }
        System.out.println("--> Precio final: "+calcularTotal());
    }
}
