import java.time.LocalDate;
public class Boleto {
    public LocalDate fechaVisita;
    public String numero;
    public static final float valor = 2.5f;
    public static int contador;
    //Asociacion:
    private Cliente cliente;
    //Constructores:
    public Boleto(Cliente cliente) {
        this.cliente = cliente;
        this.fechaVisita = LocalDate.now();
        contador++;
        this.numero=String.format("%04d", contador);
    }
    //Getter
    public Cliente getCliente() {
        return cliente;
    }
    public LocalDate getFechaVisita() {
        return fechaVisita;
    }
    public String getNumero() {
        return numero;
    }
    public float getPrecio(){
        float precio=valor;
        if(cliente!=null){
            int edad=cliente.calcularEdad();
            if(edad<18||edad>65){
                precio*=0.5; //Cobrar mitad de precio
            }
        }
        return precio;
    }
}
