package DTO;

public class DTODatos {

    private String Nombre;
    private String ApeP;
    private String ApeM;
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String pass;
    private String passconf;

    public DTODatos() {

    }

    public DTODatos(String ApeP, String ApeM, String Nombre, String Matricula, String Modelo) {
        this.ApeP = ApeP;
        this.ApeM = ApeM;
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Modelo = Modelo;
    }

    public DTODatos(String Nombre, String Matricula) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApeP() {
        return ApeP;
    }

    public void setApeP(String ApeP) {
        this.ApeP = ApeP;
    }

    public String getApeM() {
        return ApeM;
    }

    public void setApeM(String ApeM) {
        this.ApeM = ApeM;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPassconf() {
        return passconf;
    }

    public void setPassconf(String passconf) {
        this.passconf = passconf;
    }

}
