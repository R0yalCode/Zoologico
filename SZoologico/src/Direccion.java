public class Direccion {
    //Atributos:
    public String callePrincipal;
    public String calleSecundaria;
    public String referencia;
    //Constructor:
    public Direccion(String callePrincipal, String calleSecundaria, String referencia) {
        this.callePrincipal=callePrincipal;
        this.calleSecundaria=calleSecundaria;
        this.referencia=referencia;
    }
    //Getter:
    public String getCallePrincipal() {
        return callePrincipal;
    }
    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public String getReferencia() {
        return referencia;
    }
    //Metodos:
    public String mostrarUbicacion() {
        return "Direccion: "+getCallePrincipal()+" y "+getCalleSecundaria()+" | "+getReferencia();
    }
}
