package Codigo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    //panel
    protected static JLayeredPane panel = new JLayeredPane();
    protected JPanel base = new JPanel();
    //botones
    protected JButton inicio = new JButton("Iniciar Sesion");
    protected JButton registro = new JButton("Registrarse");
    protected JButton buscar = new JButton("Iniciar Sesion");
    protected JButton verificar_clave = new JButton("Verificar");
    protected JButton verificar_nota_p = new JButton("Verificar");
    protected JButton crear = new JButton("Registrarse");
    protected JButton volver = new JButton();
    protected static JButton notas = new JButton();
    protected static JButton notas_p = new JButton();
    protected static JButton notas_p_v = new JButton();
    protected static JButton llaves = new JButton();
    protected static JButton llaves_v = new JButton();
    protected static JButton recs = new JButton();
    protected JButton atras = new JButton("<-");
    protected static JButton guardar_nueva_nota = new JButton();
    protected static JButton guardar_nueva_nota_p = new JButton();
    protected static JButton guardar_nueva_clave = new JButton();
    protected static JButton guardar_nuevo_rec = new JButton();
    protected static JButton guardar_nota = new JButton();
    protected static JButton guardar_nota_p = new JButton();
    protected static JButton guardar_clave = new JButton();
    protected static JButton guardar_rec = new JButton();
    protected JButton agregar_nota= new JButton("+");
    protected JButton agregar_nota_p = new JButton("+");
    protected JButton agregar_clave = new JButton("+");
    protected JButton agregar_rec = new JButton("+");
    //etiquetas
    protected JLabel bienvenida = new JLabel("Bienvenido a NoteMe",SwingConstants.CENTER);
    protected JLabel nuevo = new JLabel("¿Eres Nuev@?",SwingConstants.CENTER);
    protected JLabel actual = new JLabel("¿Ya tenes una cuenta?",SwingConstants.CENTER);
    protected JLabel img = new JLabel();
    protected static JLabel lista = new JLabel();
    protected JLabel mensaje = new JLabel();
    protected JLabel clave_de_usuario = new JLabel();
    protected JLabel confirmacion_de_clave = new JLabel();
    protected JLabel nombre_de_usuario = new JLabel();
    //campos de texto
    protected JTextField nomb = new JTextField();
    protected JPasswordField confirmacion = new JPasswordField();
    protected JPasswordField clave = new JPasswordField();
    protected static JTextArea contenido = new JTextArea();
    protected static JTextField titulo = new JTextField();
    protected static JTextField contenido_rec_y_claves = new JTextField();

    //variables globales
    public static String n;
    public static String un;
    public static String c;
    public static String c1;
    public static String uc;
    public static String titulo_de_nota;
    public static String texto_de_nota;

    //constructor
    protected Interfaz(){
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("NoteMe");
        Componentes();
    }
    protected void Componentes(){
        panel_princiapal();
        etiquetas();
        botones();
        campos();
        eventos();
    }
    protected void etiquetas(){
        ImageIcon logo = new ImageIcon("logo.jpg");
        img.setBounds(40,100,300,300);
        img.setIcon(new ImageIcon(logo.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
        bienvenida.setBounds(425,100,150,20);
        bienvenida.setForeground(Color.WHITE);
        bienvenida.setOpaque(false);
        nuevo.setBounds(425,220,150,20);
        nuevo.setForeground(Color.WHITE);
        nuevo.setOpaque(false);
        actual.setBounds(425,140,150,20);
        actual.setForeground(Color.WHITE);
        actual.setOpaque(false);
        mensaje.setForeground(Color.WHITE);
        mensaje.setOpaque(false);
        nombre_de_usuario.setForeground(Color.WHITE);
        nombre_de_usuario.setOpaque(false);
        clave_de_usuario.setForeground(Color.WHITE);
        clave_de_usuario.setOpaque(false);
        confirmacion_de_clave.setForeground(Color.WHITE);
        confirmacion_de_clave.setOpaque(false);
        lista.setOpaque(true);
        lista.setBackground(Color.darkGray);
        lista.setBounds(80,110,840,600);
        lista.setLayout(new GridLayout(0,1));
    }
    protected void botones(){
        inicio.setBounds(400,180,200,30);
        inicio.setForeground(Color.WHITE);
        inicio.setOpaque(true);
        inicio.setBackground(Color.DARK_GRAY);

        registro.setBounds(400,250,200,30);
        registro.setForeground(Color.WHITE);
        registro.setBackground(Color.DARK_GRAY);
        registro.setOpaque(true);

        buscar.setBounds(270,500,200,30);
        buscar.setForeground(Color.WHITE);
        buscar.setBackground(Color.DARK_GRAY);
        buscar.setOpaque(true);

        verificar_clave.setBounds(270,500,200,30);
        verificar_clave.setForeground(Color.WHITE);
        verificar_clave.setBackground(Color.DARK_GRAY);
        verificar_clave.setOpaque(true);

        verificar_nota_p.setBounds(270,500,200,30);
        verificar_nota_p.setForeground(Color.WHITE);
        verificar_nota_p.setBackground(Color.DARK_GRAY);
        verificar_nota_p.setOpaque(true);

        crear.setBounds(270,500,200,30);
        crear.setForeground(Color.WHITE);
        crear.setBackground(Color.DARK_GRAY);
        crear.setOpaque(true);

        volver.setForeground(Color.WHITE);
        volver.setBackground(Color.DARK_GRAY);
        volver.setOpaque(true);

        atras.setBounds(820,30,50,50);
        atras.setForeground(Color.WHITE);
        atras.setBackground(Color.DARK_GRAY);
        atras.setOpaque(true);

        agregar_nota.setBounds(900,30,50,50);
        agregar_nota.setForeground(Color.WHITE);
        agregar_nota.setBackground(Color.DARK_GRAY);
        agregar_nota.setOpaque(true);

        agregar_nota_p.setBounds(900,30,50,50);
        agregar_nota_p.setForeground(Color.WHITE);
        agregar_nota_p.setBackground(Color.DARK_GRAY);
        agregar_nota_p.setOpaque(true);

        agregar_clave.setBounds(900,30,50,50);
        agregar_clave.setForeground(Color.WHITE);
        agregar_clave.setBackground(Color.DARK_GRAY);
        agregar_clave.setOpaque(true);

        agregar_rec.setBounds(900,30,50,50);
        agregar_rec.setForeground(Color.WHITE);
        agregar_rec.setBackground(Color.DARK_GRAY);
        agregar_rec.setOpaque(true);
    }
    protected void campos(){
        nomb.setBounds(50,50,200,30);
        nomb.setForeground(Color.WHITE);
        nomb.setBackground(Color.DARK_GRAY);
        nomb.setText("");
        nomb.setOpaque(true);
        clave.setBounds(50,80,200,30);
        clave.setForeground(Color.WHITE);
        clave.setBackground(Color.DARK_GRAY);
        clave.setText("");
        clave.setOpaque(true);
        confirmacion.setBounds(50,110,200,30);
        confirmacion.setForeground(Color.WHITE);
        confirmacion.setBackground(Color.DARK_GRAY);
        confirmacion.setText("");
        confirmacion.setOpaque(true);
        titulo.setBounds(75,5,850,40);
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(Color.DARK_GRAY);
        titulo.setText("");
        titulo.setOpaque(true);
        contenido.setBounds(75,55,850,600);
        contenido.setForeground(Color.WHITE);
        contenido.setBackground(Color.DARK_GRAY);
        contenido.setText("");
        contenido.setOpaque(true);
    }

    protected void eventos(){
        //panel inicial
        ActionListener seleccionar_inicio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio_de_sesion();
            }
        };
        inicio.addActionListener(seleccionar_inicio);
        ActionListener seleccionar_registro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro_de_usuario();
            }
        };
        registro.addActionListener(seleccionar_registro);
        ActionListener seleccionar_volver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_princiapal();
            }
        };
        volver.addActionListener(seleccionar_volver);

        //controles
        ActionListener registrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = clave.getText();
                c1 = confirmacion.getText();
                n = nomb.getText();
                uc = c;
                un = n;
                if(c.equals(c1)){
                    Control.s += 1;
                    Control.crear_usuario();
                    Control.buscar_serial();
                    panel_de_menu();
                }
                else{
                    mensaje.setText("Las claves no coinsiden");
                    refrescar_panel();
                }
            }
        };
        crear.addActionListener(registrar);
        ActionListener verificar_usuario = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = clave.getText();
                n = nomb.getText();
                Control.verificar_usuario();
                if(!Control.bol){
                    mensaje.setText("usuario y/o clave incorrectos");
                    refrescar_panel();
                }
                else {
                    Control.buscar_serial();
                    panel_de_menu();
                    Control.bol = false;
                }
            }
        };
        buscar.addActionListener(verificar_usuario);
        ActionListener verificar_claves = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = clave.getText();
                n = nomb.getText();
                Control.verificar_claves();
                if(!Control.bol){
                    mensaje.setText("clave invalida");
                    refrescar_panel();
                }
                else {
                    Control.buscar_serial();
                    panel_de_claves();
                    Control.bol = false;
                }
            }
        };
        verificar_clave.addActionListener(verificar_claves);
        ActionListener ver_notas_p = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = clave.getText();
                n = nomb.getText();
                Control.verificar_notas_p();
                if(!Control.bol){
                    mensaje.setText("clave invalida");
                    refrescar_panel();
                }
                else {
                    Control.buscar_serial();
                    panel_de_notas_p();
                    Control.bol = false;
                }
            }
        };
        verificar_nota_p.addActionListener(ver_notas_p);

        //menu
        ActionListener seleccionar_atras = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_menu();
            }
        };
        atras.addActionListener(seleccionar_atras);

        //notas
        ActionListener seleccionar_nota = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_notas();
            }
        };
        notas.addActionListener(seleccionar_nota);
        ActionListener crear_notas = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_nueva_nota();
            }
        };
        agregar_nota.addActionListener(crear_notas);
        ActionListener guardar_notas = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo_de_nota = titulo.getText();
                texto_de_nota = contenido.getText();
                Control.crear_nota();
                refrescar_panel();
                panel_de_notas();
            }
        };
        guardar_nueva_nota.addActionListener(guardar_notas);

        //notas privadas
        ActionListener seleccionar_nota_p = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desbloqueo_de_notas_p();
            }
        };
        notas_p.addActionListener(seleccionar_nota_p);
        ActionListener seleccionar_nota_p_v = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_notas_p();
            }
        };
        notas_p_v.addActionListener(seleccionar_nota_p_v);
        ActionListener crear_notas_p = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_nueva_nota_p();
            }
        };
        agregar_nota_p.addActionListener(crear_notas_p);
        ActionListener guardar_notas_p = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo_de_nota = titulo.getText();
                texto_de_nota = contenido.getText();
                Control.crear_nota_p();
                refrescar_panel();
                panel_de_notas_p();
            }
        };
        guardar_nueva_nota_p.addActionListener(guardar_notas_p);

        //claves
        ActionListener seleccionar_clave = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desbloqueo_de_claves();
            }
        };
        llaves.addActionListener(seleccionar_clave);
        ActionListener seleccionar_clave_v = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {panel_de_claves();}
        };
        llaves_v.addActionListener(seleccionar_clave_v);
        ActionListener crear_clave = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_nueva_clave();
            }
        };
        agregar_clave.addActionListener(crear_clave);
        ActionListener guardar_clave = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo_de_nota = titulo.getText();
                texto_de_nota = contenido.getText();
                Control.crear_clave();
                refrescar_panel();
                panel_de_claves();
            }
        };
        guardar_nueva_clave.addActionListener(guardar_clave);

        //recordatorios
        ActionListener seleccionar_recs = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {panel_de_recs();}
        };
        recs.addActionListener(seleccionar_recs);

        ActionListener crear_rec = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_de_nuevo_rec();
            }
        };
        agregar_rec.addActionListener(crear_rec);

        ActionListener guardar_rec = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo_de_nota = titulo.getText();
                texto_de_nota = contenido.getText();
                Control.crear_rec();
                refrescar_panel();
                panel_de_recs();
            }
        };
        guardar_nuevo_rec.addActionListener(guardar_rec);
    }

    //paneles
    protected void refrescar_panel(){
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_princiapal() {
        panel.removeAll();
        base.setBackground(Color.black);
        base.setVisible(true);
        this.add(base);
        panel.setBounds(0,0,1000,800);
        panel.setBackground(Color.black);
        panel.setOpaque(true);
        this.add(panel);
        panel.add(inicio);
        panel.add(registro);
        panel.add(img);
        panel.add(bienvenida);
        panel.add(nuevo);
        panel.add(actual);
        panel.revalidate();
        panel.repaint();
    }
    protected void inicio_de_sesion() {
        panel.removeAll();
        nombre_de_usuario.setText("Nombre de Usuario");
        nombre_de_usuario.setBounds(270,50,200,30);
        panel.add(nombre_de_usuario);
        clave_de_usuario.setText("Contraseña");
        clave_de_usuario.setBounds(270,80,200,30);
        panel.add(clave_de_usuario);
        panel.add(buscar);
        volver.setText("Volver");
        volver.setBounds(60,500,200,30);
        panel.add(volver);
        nomb.setText("");
        panel.add(nomb);
        clave.setText("");
        panel.add(clave);
        mensaje.setText("");
        mensaje.setBounds(425,140,150,20);
        panel.add(mensaje);
        panel.revalidate();
        panel.repaint();
    }
    protected void registro_de_usuario(){
        panel.removeAll();
        nombre_de_usuario.setText("Nombre de Usuario");
        nombre_de_usuario.setBounds(270,50,200,30);
        panel.add(nombre_de_usuario);
        clave_de_usuario.setText("Contraseña");
        clave_de_usuario.setBounds(270,80,200,30);
        panel.add(clave_de_usuario);
        confirmacion_de_clave.setText("Comfirmar contraseña");
        confirmacion_de_clave.setBounds(270,110,200,30);
        panel.add(confirmacion_de_clave);
        panel.add(crear);
        volver.setText("Volver");
        volver.setBounds(60,500,200,30);
        panel.add(volver);
        nomb.setText("");
        panel.add(nomb);
        clave.setText("");
        panel.add(clave);
        confirmacion.setText("");
        panel.add(confirmacion);
        mensaje.setText("");
        mensaje.setBounds(425,140,150,20);
        panel.add(mensaje);
        panel.revalidate();
        panel.repaint();
    }

    protected void panel_de_menu(){
        panel.removeAll();
        ImageIcon note = new ImageIcon("note.jpg");
        notas.setBounds(80,100,300,300);
        notas.setIcon(new ImageIcon(note.getImage().getScaledInstance(notas.getWidth(), notas.getHeight(),Image.SCALE_SMOOTH)));
        ImageIcon p_note = new ImageIcon("p-note.jpg");
        notas_p.setBounds(620,100,300,300);
        notas_p.setIcon(new ImageIcon(p_note.getImage().getScaledInstance(notas.getWidth(), notas.getHeight(),Image.SCALE_SMOOTH)));
        ImageIcon key = new ImageIcon("password.jpg");
        llaves.setBounds(80,440,300,300);
        llaves.setIcon(new ImageIcon(key.getImage().getScaledInstance(notas.getWidth(), notas.getHeight(),Image.SCALE_SMOOTH)));
        ImageIcon record = new ImageIcon("recordation.jpg");
        recs.setBounds(620,440,300,300);
        recs.setIcon(new ImageIcon(record.getImage().getScaledInstance(notas.getWidth(), notas.getHeight(),Image.SCALE_SMOOTH)));
        mensaje.setText(n);
        mensaje.setBounds(800,10,150,20);
        panel.add(mensaje);
        volver.setText("Cerrar Sesion");
        volver.setBounds(750,40,200,30);
        panel.add(volver);
        panel.add(notas);
        panel.add(notas_p);
        panel.add(llaves);
        panel.add(recs);
        panel.revalidate();
        panel.repaint();
    }
    //notas
    protected void panel_de_notas(){
        panel.removeAll();
        panel.add(agregar_nota);
        atras.setText("<-");
        atras.setBounds(820,30,50,50);
        panel.add(atras);
        panel.add(lista);
        lista.removeAll();
        Control.mostrar_notas();
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_nueva_nota(){
        panel.removeAll();
        notas.setIcon(null);
        notas.setText("Descartar");
        notas.setForeground(Color.WHITE);
        notas.setBackground(Color.DARK_GRAY);
        notas.setOpaque(true);
        notas.setBounds(75,675,200,30);
        panel.add(notas);
        guardar_nueva_nota.setText("Guardar");
        guardar_nueva_nota.setForeground(Color.WHITE);
        guardar_nueva_nota.setBackground(Color.DARK_GRAY);
        guardar_nueva_nota.setBounds(725,675,200,30);
        panel.add(guardar_nueva_nota);
        contenido.setText("");
        titulo.setText("");
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    protected static void panel_de_nota(){
        panel.removeAll();
        notas.setIcon(null);
        notas.setText("Volver");
        notas.setForeground(Color.WHITE);
        notas.setBackground(Color.DARK_GRAY);
        notas.setOpaque(true);
        notas.setBounds(75,675,200,30);
        panel.add(notas);
        guardar_nota.setText("Guardar");
        guardar_nota.setForeground(Color.WHITE);
        guardar_nota.setBackground(Color.DARK_GRAY);
        guardar_nota.setBounds(725,675,200,30);
        panel.add(guardar_nota);
        contenido.setBounds(75,55,850,600);
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    //notas privadas
    protected void desbloqueo_de_notas_p(){
        panel.removeAll();
        clave_de_usuario.setText("Contraseña");
        clave_de_usuario.setBounds(270,80,200,30);
        panel.add(clave_de_usuario);
        panel.add(verificar_nota_p);
        atras.setText("Volver");
        atras.setBounds(60,500,200,30);
        panel.add(atras);
        nomb.setText(n);
        clave.setText("");
        panel.add(clave);
        mensaje.setText("");
        mensaje.setBounds(425,140,150,20);
        panel.add(mensaje);
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_notas_p(){
        panel.removeAll();
        panel.add(agregar_nota_p);
        atras.setLayout(null);
        atras.setText("<-");
        atras.setBounds(820,30,50,50);
        panel.add(atras);
        panel.add(lista);
        lista.removeAll();
        Control.mostrar_notas_p();
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_nueva_nota_p(){
        panel.removeAll();
        notas_p_v.setIcon(null);
        notas_p_v.setText("Descartar");
        notas_p_v.setForeground(Color.WHITE);
        notas_p_v.setBackground(Color.DARK_GRAY);
        notas_p_v.setOpaque(true);
        notas_p_v.setBounds(75,675,200,30);
        panel.add(notas_p_v);
        guardar_nueva_nota_p.setText("Guardar");
        guardar_nueva_nota_p.setForeground(Color.WHITE);
        guardar_nueva_nota_p.setBackground(Color.DARK_GRAY);
        guardar_nueva_nota_p.setBounds(725,675,200,30);
        panel.add(guardar_nueva_nota_p);
        contenido.setText("");
        titulo.setText("");
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    protected static void panel_de_nota_p(){
        panel.removeAll();
        notas_p_v.setIcon(null);
        notas_p_v.setText("Volver");
        notas_p_v.setForeground(Color.WHITE);
        notas_p_v.setBackground(Color.DARK_GRAY);
        notas_p_v.setOpaque(true);
        notas_p_v.setBounds(75,675,200,30);
        panel.add(notas_p_v);
        guardar_nota_p.setText("Guardar");
        guardar_nota_p.setForeground(Color.WHITE);
        guardar_nota_p.setBackground(Color.DARK_GRAY);
        guardar_nota_p.setBounds(725,675,200,30);
        panel.add(guardar_nota_p);
        contenido.setBounds(75,55,850,600);
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    //claves
    protected void desbloqueo_de_claves(){
        panel.removeAll();
        clave_de_usuario.setText("Contraseña");
        panel.add(clave_de_usuario);
        clave_de_usuario.setBounds(270,80,200,30);
        panel.add(verificar_clave);
        atras.setText("Volver");
        atras.setBounds(60,500,200,30);
        panel.add(atras);
        nomb.setText(n);
        clave.setText("");
        panel.add(clave);
        mensaje.setText("");
        mensaje.setBounds(425,140,150,20);
        panel.add(mensaje);
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_claves(){
        panel.removeAll();
        panel.add(agregar_clave);
        atras.setText("<-");
        atras.setBounds(820,30,50,50);
        panel.add(atras);
        panel.add(lista);
        lista.removeAll();
        Control.mostrar_claves();
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_nueva_clave(){
        panel.removeAll();
        llaves_v.setIcon(null);
        llaves_v.setText("Descartar");
        llaves_v.setForeground(Color.WHITE);
        llaves_v.setBackground(Color.DARK_GRAY);
        llaves_v.setOpaque(true);
        llaves_v.setBounds(75,675,200,30);
        panel.add(llaves_v);
        guardar_nueva_clave.setText("Guardar");
        guardar_nueva_clave.setForeground(Color.WHITE);
        guardar_nueva_clave.setBackground(Color.DARK_GRAY);
        guardar_nueva_clave.setBounds(725,675,200,30);
        panel.add(guardar_nueva_clave);
        contenido.setText("");
        titulo.setText("");
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    protected static void panel_de_clave(){
        panel.removeAll();
        llaves_v.setIcon(null);
        llaves_v.setText("Volver");
        llaves_v.setForeground(Color.WHITE);
        llaves_v.setBackground(Color.DARK_GRAY);
        llaves_v.setOpaque(true);
        llaves_v.setBounds(75,675,200,30);
        panel.add(llaves_v);
        guardar_clave.setText("Guardar");
        guardar_clave.setForeground(Color.WHITE);
        guardar_clave.setBackground(Color.DARK_GRAY);
        guardar_clave.setBounds(725,675,200,30);
        panel.add(guardar_clave);
        contenido.setBounds(75,55,850,600);
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    //recordatorios
    protected void panel_de_recs(){
        panel.removeAll();
        panel.add(agregar_rec);
        atras.setText("<-");
        atras.setBounds(820,30,50,50);
        panel.add(atras);
        panel.add(lista);
        lista.removeAll();
        Control.mostrar_recs();
        panel.revalidate();
        panel.repaint();
    }
    protected void panel_de_nuevo_rec(){
        panel.removeAll();
        recs.setIcon(null);
        recs.setText("Descartar");
        recs.setForeground(Color.WHITE);
        recs.setBackground(Color.DARK_GRAY);
        recs.setOpaque(true);
        recs.setBounds(75,675,200,30);
        panel.add(recs);
        guardar_nuevo_rec.setText("Guardar");
        guardar_nuevo_rec.setForeground(Color.WHITE);
        guardar_nuevo_rec.setBackground(Color.DARK_GRAY);
        guardar_nuevo_rec.setBounds(725,675,200,30);
        panel.add(guardar_nuevo_rec);
        contenido.setText("");
        titulo.setText("");
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
    protected static void panel_de_rec(){
        panel.removeAll();
        recs.setIcon(null);
        recs.setText("Volver");
        recs.setForeground(Color.WHITE);
        recs.setBackground(Color.DARK_GRAY);
        recs.setOpaque(true);
        recs.setBounds(75,675,200,30);
        panel.add(recs);
        guardar_rec.setText("Guardar");
        guardar_rec.setForeground(Color.WHITE);
        guardar_rec.setBackground(Color.DARK_GRAY);
        guardar_rec.setBounds(725,675,200,30);
        panel.add(guardar_rec);
        contenido.setBounds(75,55,850,600);
        panel.add(contenido);
        panel.add(titulo);
        panel.revalidate();
        panel.repaint();
    }
}