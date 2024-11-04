import java.util.List;
import java.util.ArrayList;
public class Jaula {
    //Atributos:
    public int capacidad;
    public static int contador;
    public String numeroJaula;
    public boolean estaLimpio;
    //Asociacion:
    private List <Animal> animales;
    private Zona zona;
    //Constructor:
    public Jaula(int capacidad, Zona zona, boolean estaLimpio) {
        this.capacidad=capacidad;
        this.zona=zona;
        contador++;
        String prefijoJaula;
        if(getZona()==Zona.NORTE){
            prefijoJaula = "14N";
        } else if(getZona()==Zona.SUR){
            prefijoJaula= "14S";
        } else if(getZona()==Zona.ESTE){
            prefijoJaula = "14E";
        } else{
            prefijoJaula = "14O";
        }
        this.numeroJaula = prefijoJaula + String.format("%03d", contador);
        this.estaLimpio=estaLimpio;
        this.animales=new ArrayList<>();
    }
    //Getter:
    public int getCapacidad() {
        return capacidad;
    }
    public Zona getZona() {
        return zona;
    }
    public String getNumeroJaula() {
        return numeroJaula;
    }
    public boolean isEstaLimpio() {
        return estaLimpio;
    }
    public void setEstaLimpio(boolean estaLimpio) {
        this.estaLimpio = estaLimpio;
    }
    //Metodos:
    public void agregarAnimal(Animal... nuevosAnimales) {
        for (Animal animal : nuevosAnimales) {
            if (animales.size() < capacidad) {
                animales.add(animal);
                System.out.println("{ La jaula " + getNumeroJaula() + " ahora contiene un/a " +
                        animal.getNombre()+" }");
            } else {
                System.out.println("-> No se puede agregar el/a " + animal.getNombre() + " a la jaula " + getNumeroJaula() +
                        " porque ha alcanzado su capacidad máxima");
            }
        }
    }
    public void mostrarNumeroJaula(){
        System.out.println(" [ La jaula de "+getCapacidad()+" animales es: "+getNumeroJaula()+" ]");
    }
}
