import java.time.LocalDate;
abstract class Empleado extends Persona {
    //Atributos:
    protected static int contador;
    protected String identificacion;
    protected float salario;
    //Enumerador:
    protected Zona zona;
    //Constructor:
    public Empleado(String nombre, LocalDate fechaNacimiento, String cedula, float salario, Zona zona) {
        super(nombre, fechaNacimiento, cedula);
        contador++;
        this.salario=salario;
        this.zona=zona;
        String prefijoZona;
        if(getZona()==Zona.NORTE){
            prefijoZona = "11N";
        } else if(getZona()==Zona.SUR){
            prefijoZona= "11S";
        } else if(getZona()==Zona.ESTE){
            prefijoZona = "11E";
        } else{
            prefijoZona = "11O";
        }
        this.identificacion = prefijoZona + String.format("%03d", contador);
        //mostrarIdentificacion();
    }
    //Getter:
    public String getIdentificacion() {
        return identificacion;
    }
    public float getSalario() {
        return salario;
    }
    public Zona getZona() {
        return zona;
    }
    public static int getContador() {
        return contador;
    }
    //Metodos:
    public void mostrarIdentificacion(){
        System.out.println(" [ Empleado: "+getNombre()+" | identificacion: "+getIdentificacion()+" ]");
    }
}
