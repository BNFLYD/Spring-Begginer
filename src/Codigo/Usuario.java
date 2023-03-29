package Codigo;

public class Usuario {
    private Sesion sesion;
    private String nombre;
    private String clave;

    public Usuario(int serial, String nombre, String clave){
        this.sesion = new Sesion(serial);
        this.nombre = nombre;
        this.clave = clave;
    }
    public void setSesion(Sesion sesion){this.sesion = sesion; }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public Sesion getSesion(){return sesion;}
    public String getNombre(){
        return nombre;
    }
    public String getClave(){
        return clave;
    }
    @Override
    public String toString() {
        return "usuario{" +
                "sesion = " + getSesion().getSerial() +
                ", nombre = " + nombre +
                '}';
    }
}