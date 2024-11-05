import java.time.LocalDate;
public class HistorialMedico {
    //Atributos:
    private String diagnostico;
    private LocalDate fecha;
    //Asociacion:
    private Animal animal;
    // Constructor:
    public HistorialMedico(Animal animal, String diagnostico) {
        this.animal = animal;
        this.diagnostico = diagnostico;
        this.fecha = LocalDate.now();
    }
    // Getter:
    public String getDiagnostico() {
        return diagnostico;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    //Metodos:
    public void registroClinico(Veterinario veterinario){
        System.out.println("| Animal: "+animal.getNombreCientifico()+" | Edad: "+animal.getEdad()+
                " | Peso: "+animal.getPeso()+"kg | Diagnostico: "+getDiagnostico()+
                " | Veterinario: "+veterinario.getNombre()+" | Fecha: "+getFecha()+" |");
    }
}
