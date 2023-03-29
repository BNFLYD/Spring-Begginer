package Codigo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recordatorio extends Sesion{
    private int n_serie;
    private String titulo,contenido;
    private JButton boton;

    public Recordatorio(int n_serie, String titulo, String contenido,JButton boton,int serial){
        super(serial);
        this.n_serie = n_serie;
        this.titulo = titulo;
        this.contenido = contenido;
        this.boton = boton;
    }

    public void config(){
        boton.setForeground(Color.white);
        boton.setBackground(Color.darkGray);
        ActionListener mostrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Interfaz.titulo.setText(titulo);
                Interfaz.contenido.setText(contenido);
                Interfaz.panel_de_rec();
            }
        };
        boton.addActionListener(mostrar);
    }

    public void setN_serie(int n_serie){
        this.n_serie = n_serie;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public int getN_serie(){
        return n_serie;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getContenido(){
        return contenido;
    }
    public JButton getBoton(){
        config();
        return boton;
    }
    @Override
    public String toString() {
        return "recordatorio{" +
                "numero de serie =" + n_serie +
                ", titulo =" + titulo +
                '}';
    }
}
