import java.time.LocalDate;
public class Animal extends SerVivo {
    //Atributos:
    private int edad;
    private String nombreCientifico;
    private float peso;
    private static int contador;
    //Enumerador:
    private Estado estado;
    private TipoCuerpo tipoCuerpo;
    private TipoDieta tipoDieta;
    private Zona zona;
    //Constructor:
    public Animal(String nombre, LocalDate fechaNacimiento, Zona zona, String nombreCientifico,
                  float peso, TipoCuerpo tipoCuerpo, TipoDieta tipoDieta, Estado estado) {
        super(nombre, fechaNacimiento); //Constructor de clase SerVivo
        this.nombreCientifico=nombreCientifico;
        this.peso=peso;
        this.edad=calcularEdad();
        this.tipoCuerpo=tipoCuerpo;
        this.tipoDieta=tipoDieta;
        this.zona=zona;
        this.estado=estado;
        contador++;
    }
    //Getter:
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public float getPeso() {
        return peso;
    }
    public int getEdad() {
        return edad;
    }
    public TipoCuerpo getTipoCuerpo() {
        return tipoCuerpo;
    }
    public TipoDieta getTipoDieta() {
        return tipoDieta;
    }
    public Zona getZona() {
        return zona;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public static int getContador() {
        return contador;
    }
    //Metodos:
    public void mostrarNombre(){
        System.out.println(" [ Existe el animal: "+getNombreCientifico()+" ]");
    }
}
