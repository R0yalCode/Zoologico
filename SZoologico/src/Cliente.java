import java.time.LocalDate;
public class Cliente extends Persona {
    //Asociacion
    private Boleto boleto;
    private Guia guia;
    //Constructores:
    public Cliente(String nombre, LocalDate fechaNacimiento, String cedula) {
        super(nombre, fechaNacimiento, cedula);
        this.boleto=new Boleto(this);
    }
    //Getter:
    public Boleto getBoleto() {
        return boleto;
    }
    //Metodos:
    public void comprarBoleto(){
        System.out.println(nombre+" realizo la compra del boleto numero: "+boleto.getNumero());
    }
    public void listaInformacion(){
        comprarBoleto();
        System.out.println("| Cliente: "+getNombre()+" | Cedula: "+getCedula()+" | Edad: "+getEdad()+
                " | Boleto: "+boleto.getNumero()+" |");
    }
}
