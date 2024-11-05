import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle 101", "Calle 240",
                "Sector Buenavista");
        Zoologico zoologico=Zoologico.getInstance("Reino Animalon","0982297532",15, direccion1);
        zoologico.indicarInformacion();
        //Empleados:
        ArrayList <Guia> guias = new ArrayList<>();
        ArrayList <PersonalAdministrativo> personalAdministrativoList = new ArrayList<>();
        ArrayList <PersonalLimpieza> personalLimpiezaList = new ArrayList<>();
        ArrayList <Veterinario> veterinarios = new ArrayList<>();
        ArrayList <Cuidador> cuidadores = new ArrayList<>();
        guias.add(new Guia("Carlos",LocalDate.of(1985,4,12),"1102345678",
                550,Zona.NORTE));
        guias.add(new Guia("Sofia",LocalDate.of(1983,7,19),"1107890123",
                550,Zona.ESTE));
        veterinarios.add(new Veterinario("Luis",LocalDate.of(1979,2,15),
                "1104567580", 800,Zona.ESTE,"Vertebrado"));
        veterinarios.add(new Veterinario("Jorge",LocalDate.of(1990,5,27),
                "1106789012", 800,Zona.NORTE,"Vertebrado"));
        veterinarios.add(new Veterinario("Gabriela",LocalDate.of(1995,3,21),
                "1104567580", 900,Zona.SUR,"Invertebrado"));
        personalLimpiezaList.add(new PersonalLimpieza("Cristina",LocalDate.of(2000,6,7),
                "1099390870",450,Zona.OESTE));
        personalLimpiezaList.add(new PersonalLimpieza("Laura",LocalDate.of(1993,7,5),
                "1109934650",450,Zona.ESTE));
        cuidadores.add(new Cuidador("Daniel",LocalDate.of(1986,9,17),
                "1100674860",650,Zona.NORTE));
        cuidadores.add(new Cuidador("Ana",LocalDate.of(1988,11,3),
                "1105978910",650,Zona.ESTE));
        cuidadores.add(new Cuidador("Pedro",LocalDate.of(1995,10,19),
                "1108492860",650,Zona.SUR));
        zoologico.calcularEmpleados();
        //Jaulas:
        ArrayList <Jaula> jaulas = new ArrayList<>();
        jaulas.add(new Jaula(2,Zona.NORTE,true));
        jaulas.add(new Jaula(3,Zona.ESTE,false));
        jaulas.add(new Jaula(3,Zona.SUR,true));
        jaulas.add(new Jaula(2,Zona.OESTE,false));
        //for (Jaula jaula : jaulas) {jaula.mostrarNumeroJaula();}
        System.out.println("Numero de jaulas: "+jaulas.size());
        personalLimpiezaList.get(0).limpiarJaula(jaulas.get(0), jaulas.get(1));
        personalLimpiezaList.get(1).limpiarJaula(jaulas.get(2), jaulas.get(3));
        //Animales:
        ArrayList <Animal> animales = new ArrayList<>();
        animales.add(new Animal("Leon", LocalDate.of(2010,6,1),Zona.NORTE,
                "Panthera leo", 190.5f, TipoCuerpo.VERTEBRADO, TipoDieta.CARNIVORO, Estado.ESTRESADO));
        animales.add(new Animal("Tigre",LocalDate.of(2013,4,15),Zona.NORTE,
                "Panthera Tigris", 220.4f, TipoCuerpo.VERTEBRADO, TipoDieta.CARNIVORO, Estado.HAMBRIENTO));
        animales.add(new Animal("Cebra", LocalDate.of(2018,5,24),Zona.ESTE,
                "Equus quagga", 300, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.HAMBRIENTO));
        animales.add(new Animal("Iguana", LocalDate.of(2019,9,25),Zona.ESTE,
                "Iguana iguana", 5.2f, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.DESCANSANDO));
        animales.add(new Animal("Jirafa", LocalDate.of(2019,2,18),Zona.ESTE,
                "Giraffa camelopardalis", 800, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.HERIDO));
        animales.add(new Animal("Flamenco", LocalDate.of(2021,1,21),Zona.SUR,
                "Phoenicopterus roseus", 3, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.HAMBRIENTO));
        animales.add(new Animal("Tortuga", LocalDate.of(1998,3,8),Zona.SUR,
                "Chelenoidis nigra", 200, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.ENFERMO));
        animales.add(new Animal("Guacamayo Azul", LocalDate.of(2021,7,29),Zona.SUR,
                "Ara ararauna", 1.3f, TipoCuerpo.VERTEBRADO, TipoDieta.HERVIBORO, Estado.HAMBRIENTO));
        animales.add(new Animal("Pulpo", LocalDate.of(2019,4,21),Zona.OESTE,
                "Octopus vulgaris", 10, TipoCuerpo.INVERTEBRADO, TipoDieta.OMNIVORO, Estado.ESTRESADO));
        animales.add(new Animal("Estrella de Mar", LocalDate.of(2018,6,17),Zona.OESTE,
                "Echinaster sepositus", 0.2f, TipoCuerpo.INVERTEBRADO, TipoDieta.HERVIBORO, Estado.HERIDO));
        //for (Animal animal: animales) {animal.mostrarNombre();}
        zoologico.calcularAnimales();
        for (Animal animal : animales) {zoologico.agregarAnimal(animal);}
        veterinarios.get(0).realizarDiagnostico(animales.get(0),animales.get(1),animales.get(2),animales.get(3));
        veterinarios.get(1).realizarDiagnostico(animales.get(4),animales.get(5),animales.get(6),animales.get(7));
        veterinarios.get(2).realizarDiagnostico(animales.get(8),animales.get(9));
        jaulas.get(0).agregarAnimal(animales.get(0),animales.get(1));
        jaulas.get(1).agregarAnimal(animales.get(2),animales.get(3),animales.get(4));
        jaulas.get(2).agregarAnimal(animales.get(5),animales.get(6),animales.get(7));
        jaulas.get(3).agregarAnimal(animales.get(8),animales.get(9));
        cuidadores.get(0).cuidarAnimal(animales.get(0),animales.get(1));
        cuidadores.get(1).cuidarAnimal(animales.get(2),animales.get(3),animales.get(4),animales.get(5));
        cuidadores.get(2).cuidarAnimal(animales.get(6),animales.get(7),animales.get(8),animales.get(9));
        //Clientes:
        ArrayList <Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Marco", LocalDate.of(1982, 9, 26),
                "1109875670"));
        clientes.add(new Cliente("Juan", LocalDate.of(1990, 7, 8),
                "1107893650"));
        clientes.add(new Cliente("Jose", LocalDate.of(1952, 7, 14),
                "1105673880"));
        clientes.add(new Cliente("Elena", LocalDate.of(2010, 8, 5),
                "1107983640"));
        clientes.add(new Cliente("Roberto", LocalDate.of(2018, 11, 20),
                "1103347980"));
        clientes.add(new Cliente("Maria", LocalDate.of(2000, 12, 29),
                "1107679230"));
        clientes.add(new Cliente("Lucia", LocalDate.of(1960, 8, 5),
                "1106459900"));
        clientes.add(new Cliente("Roberto", LocalDate.of(2007, 4, 17),
                "1100784340"));
        //for (Cliente cliente: clientes) {cliente.listaInformacion();}
        System.out.println("Numero de clientes: "+ clientes.size());
        Compra compra1 = new Compra();
        compra1.agregarCliente(clientes.get(0),clientes.get(1));
        compra1.mostrarTotalBoletos();
        Compra compra2 = new Compra();
        compra2.agregarCliente(clientes.get(2),clientes.get(3));
        compra2.mostrarTotalBoletos();
        Compra compra3 = new Compra();
        compra3.agregarCliente(clientes.get(4),clientes.get(5),clientes.get(6),clientes.get(7));
        compra3.mostrarTotalBoletos();
        guias.get(0).agregarCliente(clientes.get(0),clientes.get(1));
        guias.get(1).agregarCliente(clientes.get(2),clientes.get(3),clientes.get(4),clientes.get(5),clientes.get(6),clientes.get(7));
        for (Guia guia: guias) {guia.mostrarCliente();}
    }
}