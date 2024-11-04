import java.time.LocalDate;
public class Cliente extends Persona {
    //Asociacion
    private Boleto boleto;
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
    private void comprarBoleto(){
        System.out.println(getNombre()+" realizo la compra del boleto numero: "+boleto.getNumero());
    }
    public void listaInformacion(){
        comprarBoleto();
        System.out.println("| Cliente: "+getNombre()+" | Cedula: "+getCedula()+" | Edad: "+getEdad()+
                " | Boleto: "+boleto.getNumero()+" |");
    }
}
