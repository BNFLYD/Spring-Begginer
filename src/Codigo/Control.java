package Codigo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Control extends Interfaz {
    protected static List<Usuario> sesiones = new ArrayList<>();
    protected static List <Nota> nota = new ArrayList<>();
    protected static List <NotaPrivada> nota_p = new ArrayList<>();
    protected static List<Clave> claves = new ArrayList<>();
    protected static List <Recordatorio> rec = new ArrayList<>();
    protected static int i = 0;
    protected static boolean bol = false;
    protected static int us = 0;
    protected static int s = -1;
    protected static int n_s = -1;
    protected static String nombre_usuario;
    protected static String clave_usuario;
    protected static int serial_usuario;
    protected static int serial_general;

    //funciones
    protected static void crear_usuario(){
        if (s >= 0){
            serial_usuario = s;
            nombre_usuario = Interfaz.n;
            clave_usuario = Interfaz.c;
            sesiones.add(new Usuario(serial_usuario,nombre_usuario,clave_usuario));
            System.out.println("nuevo usuario registrado: " + sesiones.get(serial_usuario).toString());
        }
    }
    protected static void verificar_usuario(){
        for (i = 0; i < sesiones.size(); i++){
            Interfaz.uc = sesiones.get(i).getClave();
            Interfaz.un = sesiones.get(i).getNombre();
            if (Objects.equals(Interfaz.uc, Interfaz.c) & Objects.equals(Interfaz.un, Interfaz.n)){
                buscar_serial();
                bol = true;
            }
        }
    }
    protected static void verificar_claves(){
        for (i = 0; i < sesiones.size(); i++){
            Interfaz.uc = sesiones.get(i).getClave();
            Interfaz.un = sesiones.get(i).getNombre();
            if (Objects.equals(Interfaz.uc, Interfaz.c) & Objects.equals(Interfaz.un, Interfaz.n)){
                bol = true;
            }
        }
    }
    protected static void verificar_notas_p(){
        for (i = 0; i < sesiones.size(); i++){
            Interfaz.uc = sesiones.get(i).getClave();
            Interfaz.un = sesiones.get(i).getNombre();
            if (Objects.equals(Interfaz.uc, Interfaz.c) & Objects.equals(Interfaz.un, Interfaz.n)){
                bol = true;
            }
        }
    }
    protected static void buscar_serial(){
        for (i = 0; i < sesiones.size(); i++){
            Interfaz.uc = sesiones.get(i).getClave();
            Interfaz.un = sesiones.get(i).getNombre();
            if ((Objects.equals(Interfaz.uc, Interfaz.c)) && (Objects.equals(Interfaz.un, Interfaz.n))){
                serial_general = sesiones.get(i).getSesion().getSerial();
            }
        }
        System.out.println("serial del usuario " + serial_general);
    }
    protected static void crear_nota(){
        n_s = nota.size();
        System.out.println(n_s);
        nota.add(new Nota(n_s,Interfaz.titulo_de_nota,Interfaz.texto_de_nota,new JButton(Interfaz.titulo_de_nota),serial_general));
        System.out.println("nueva nota guardada: " + nota.get(n_s).toString());
    }
    protected static void mostrar_notas(){
        Interfaz.lista.removeAll();
        for (Nota nu:nota){
            if(nu.getSerial() == serial_general){
                Interfaz.lista.add(nu.getBoton());
            }
        }
    }
    protected static void crear_nota_p(){
        n_s = nota_p.size();
        System.out.println(n_s);
        nota_p.add(new NotaPrivada(n_s,Interfaz.titulo_de_nota,Interfaz.texto_de_nota,new JButton(Interfaz.titulo_de_nota),serial_general));
        System.out.println("nueva nota privada guardada: " + nota_p.get(n_s).toString());
    }
    protected static void mostrar_notas_p(){
        Interfaz.lista.removeAll();
        for (NotaPrivada nu:nota_p){
            if(nu.getSerial() == serial_general){
                Interfaz.lista.add(nu.getBoton());
            }
        }
    }
    protected static void crear_clave(){
        n_s = claves.size();
        System.out.println(n_s);
        claves.add(new Clave(n_s,Interfaz.titulo_de_nota,Interfaz.texto_de_nota,new JButton(Interfaz.titulo_de_nota),serial_general));
        System.out.println("nueva clave guardada: " + claves.get(n_s).toString());
    }
    protected static void mostrar_claves(){
        Interfaz.lista.removeAll();
        for (Clave nu:claves){
            if(nu.getSerial() == serial_general){
                Interfaz.lista.add(nu.getBoton());
            }
        }
    }
    protected static void crear_rec(){
        n_s = rec.size();
        System.out.println(n_s);
        rec.add(new Recordatorio(n_s,Interfaz.titulo_de_nota,Interfaz.texto_de_nota,new JButton(Interfaz.titulo_de_nota),serial_general));
        System.out.println("nuevo recordatorio guardado: " + rec.get(n_s).toString());
    }
    protected static void mostrar_recs(){
        Interfaz.lista.removeAll();
        for (Recordatorio nu:rec){
            if(nu.getSerial() == serial_general){
                Interfaz.lista.add(nu.getBoton());
            }
        }
    }
}
