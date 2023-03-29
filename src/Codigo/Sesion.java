package Codigo;

public class Sesion {
    private int serial;
    public Sesion(int serial){
        this.serial = serial;
    }
    public void setSerial(int n_serie){this.serial = n_serie;}
    public int getSerial(){return serial;}
    @Override
    public String toString() {
        return "sesion{" +
                "sesion = " + getSerial() +
                '}';
    }
}