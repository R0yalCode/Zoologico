import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Animal extends SerVivo {
    //Atributos:
    private static int contador;
    private int edad;
    private String nombreCientifico;
    private float peso;
    //Enumerador:
    private Estado estado;
    private TipoCuerpo tipoCuerpo;
    private TipoDieta tipoDieta;
    private Zona zona;
    private List <TipoAlimento> tipoAlimentos;
    //Asociacion:
    private List <HistorialMedico> historialMedicoList;
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
        this.historialMedicoList=new ArrayList<>();
        this.tipoAlimentos=new ArrayList<>();
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
    public void indicarDiagnostico(Estado estado, Veterinario veterinario) {
        String estadoActual = estado.toString();
        historialMedicoList.add(new HistorialMedico(this, estadoActual));
        for (HistorialMedico historial : historialMedicoList) {
            historial.registroClinico(veterinario);
        }
    }
    public String sugerirAlimento(){
        tipoAlimentos.clear();
        if(getTipoDieta()==TipoDieta.CARNIVORO){
            tipoAlimentos.add(TipoAlimento.CARNE);
            tipoAlimentos.add(TipoAlimento.PESCADO);
        }else if(getTipoDieta()==TipoDieta.HERVIBORO){
            tipoAlimentos.add(TipoAlimento.HIERBA);
            tipoAlimentos.add(TipoAlimento.FRUTA);
        }else if(getTipoDieta()==TipoDieta.OMNIVORO){
            tipoAlimentos.add(TipoAlimento.CARNE);
            tipoAlimentos.add(TipoAlimento.HIERBA);
            tipoAlimentos.add(TipoAlimento.FRUTA);
        }
        if (!tipoAlimentos.isEmpty()) {
            Random random = new Random();
            TipoAlimento alimentoSeleccionado = tipoAlimentos.get(random.nextInt(tipoAlimentos.size()));
            return alimentoSeleccionado.toString();
        } else{
            return null;
        }
    }
}
