import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle 101", "Calle 240",
                "Sector Buenavista");
        Zoologico zoologico=Zoologico.getInstance("Zoo Norte","0982297532",4, direccion1);
        zoologico.indicarInformacion();
        //Empleados:
        ArrayList <Guia> guias = new ArrayList<>();
        ArrayList <PersonalAdministrativo> personalAdministrativoList = new ArrayList<>();
        ArrayList <PersonalLimpieza> personalLimpiezaList = new ArrayList<>();
        ArrayList <Veterinario> veterinarios = new ArrayList<>();
        ArrayList <Cuidador> cuidadores = new ArrayList<>();
        guias.add(new Guia("Jose",LocalDate.of(2000,9,16),"1872910832",
                455,Zona.NORTE));
        guias.add(new Guia("Juan",LocalDate.of(2003,8,30),"1897653980",
                455,Zona.ESTE));
        veterinarios.add(new Veterinario("Pablo",LocalDate.of(1995,5,30),
                "1156983950", 600,Zona.SUR,"Animales"));
        personalLimpiezaList.add(new PersonalLimpieza("Cristina",LocalDate.of(2000,6,7),
                "1099390870",450,Zona.OESTE));
        cuidadores.add(new Cuidador("Daniel",LocalDate.of(2002,10,29),
                "1209303870",550,Zona.ESTE));
        zoologico.calcularEmpleados();
        //Jaulas:
        ArrayList <Jaula> jaulas = new ArrayList<>();
        jaulas.add(new Jaula(2,Zona.NORTE,true));
        jaulas.add(new Jaula(3,Zona.ESTE,false));
        jaulas.add(new Jaula(5,Zona.SUR,true));
        //for (Jaula jaula : jaulas) {jaula.mostrarNumeroJaula();}
        System.out.println("Numero de jaulas: "+jaulas.size());
        personalLimpiezaList.get(0).limpiarJaula(jaulas.get(0), jaulas.get(1),jaulas.get(2));
        //Animales:
        ArrayList <Animal> animales = new ArrayList<>();
        animales.add(new Animal("Leon", LocalDate.of(1980,5,4),Zona.ESTE,
                "Pantera leo", 65, TipoCuerpo.VERTEBRADO, TipoDieta.CARNIVORO, Estado.ESTRESADO));
        animales.add(new Animal("Tigre",LocalDate.of(2005,4,25),Zona.SUR,
                "Tigueru", 80, TipoCuerpo.VERTEBRADO, TipoDieta.CARNIVORO, Estado.NORMAL));
        animales.add(new Animal("Tortuga", LocalDate.of(1930,8,15),Zona.NORTE,
                "Turtuae", 100, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.HAMBRIENTO));
        //for (Animal animal: animales) {animal.mostrarNombre();}
        System.out.println("Numero de animales: "+animales.size());
        zoologico.agregarAnimal(animales.get(0),animales.get(1),animales.get(2));
        veterinarios.get(0).realizarDiagnostico(animales.get(0),animales.get(1),animales.get(2));
        jaulas.get(0).agregarAnimal(animales.get(0),animales.get(1));
        jaulas.get(1).agregarAnimal(animales.get(2));
        cuidadores.get(0).cuidarAnimal(animales.get(0),animales.get(1),animales.get(2));
        //Clientes:
        ArrayList <Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Marco", LocalDate.of(1972, 5, 26),
                "1102832860"));
        clientes.add(new Cliente("Maria", LocalDate.of(1980, 6, 28),
                "1105583686"));
        clientes.add(new Cliente("Jose", LocalDate.of(1952, 7, 14),
                "1105673886"));
        clientes.add(new Cliente("Luis", LocalDate.of(2010, 8, 5),
                "1107983645"));
        //for (Cliente cliente: clientes) {cliente.listaInformacion();}
        System.out.println("Numero de clientes: "+ clientes.size());
        Compra compra1 = new Compra();
        compra1.agregarCliente(clientes.get(0),clientes.get(1));
        compra1.mostrarTotalBoletos();
        Compra compra2 = new Compra();
        compra2.agregarCliente(clientes.get(2),clientes.get(3));
        compra2.mostrarTotalBoletos();
        guias.get(0).agregarCliente(clientes.get(0),clientes.get(1));
        guias.get(1).agregarCliente(clientes.get(2),clientes.get(3));
        for (Guia guia: guias) {guia.mostrarCliente();}
    }
}