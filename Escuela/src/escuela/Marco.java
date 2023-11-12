/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import static java.awt.Color.ORANGE;
import static java.awt.Color.blue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


/**
 *
 * @author netXMM
 */
public class Marco extends JFrame implements ActionListener{
    
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, menu4, menu5,menu6;
    private JMenuItem menuItem21, menuItem22, menuItem31, menuItem32;
    private JCheckBoxMenuItem SalonDeportes, SalonZoom;
    private JRadioButtonMenuItem cocina, banio, kiosco;
    
    public Marco(){
 /* Creamos el JMenuBar y lo asociamos con el JFrame */
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        menu1=new JMenu("Menú");
        menuBar.add(menu1);

        /* Creamos el segundo y tercer objetos de la clase JMenu y los asociamos con el primer JMenu creado */
        menu2=new JMenu("Aula 1 ");
        menu1.add(menu2);
        menu3=new JMenu("Aula 2 ");
        menu1.add(menu3);
        menu4= new JMenu( "Aula 3");
        menu1.add(menu4);
        menu5=new JMenu("Aula 4");
        menu1.add(menu5);
        menu6= new JMenu("Aula 5");
        menu1.add(menu6);

        /* Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el segundo JMenu */
        menuItem21=new JMenuItem("640*480");
        menu2.add(menuItem21);
        menuItem21.addActionListener(this);
        menuItem22=new JMenuItem("1024*768");
        menu2.add(menuItem22);
        menuItem22.addActionListener(this);

        /* Creamos los otros dos objetos de la clase JMenuItem y los  asociamos con el tercer JMenu */
        menuItem31=new JMenuItem("Rojo");
        menu3.add(menuItem31);
        menuItem31.addActionListener(this);
        menuItem32=new JMenuItem("Verde");
        menu3.add(menuItem32);
        menuItem32.addActionListener(this);

        /* desactivar menu items*/
        menu5.setEnabled(false);
        menu6.setEnabled(false);
        
        
        SalonDeportes= new JCheckBoxMenuItem("Salón Deportes");
        SalonDeportes.setMnemonic(KeyEvent.VK_S); 
        SalonDeportes.setSelected(true);

        //Setting the accelerator:
        SalonDeportes.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menu1.add(SalonDeportes);

        SalonZoom= new JCheckBoxMenuItem("Salón Zoom");
        SalonZoom.setMnemonic(KeyEvent.VK_S); 
        SalonZoom.setSelected(true);
        //Setting the accelerator:
        SalonZoom.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menu1.add(SalonZoom);
        menu1.addSeparator();

        cocina = new JRadioButtonMenuItem("Cocina");
        cocina.setMnemonic(KeyEvent.VK_T);
        cocina.setSelected(true);
        //Setting the accelerator:
        cocina.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        menu1.add(cocina);
        
        banio = new JRadioButtonMenuItem("Baño");
        banio.setMnemonic(KeyEvent.VK_T);

        //Setting the accelerator:
        banio.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        menu1.add(banio);
        
        kiosco = new JRadioButtonMenuItem("Kiosco");
        kiosco.setMnemonic(KeyEvent.VK_T);

        //Setting the accelerator:
        kiosco.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        menu1.add(kiosco);
        
        
//COnfigurar y mostrar JFrame
        initPantalla();
    }
    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Escuela N° 374"); //Título del JFrame
        setSize(600, 400); //Dimensiones del JFrame
        setIconImage(new ImageIcon(getClass().getResource
        ("/Resources/escuela.png")).getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }
    @Override
    public void actionPerformed(ActionEvent e) {
 if (e.getSource()==menuItem21) {
            setSize(640,480);
        }
        if (e.getSource()==menuItem22) {
            setSize(1024,768);
        }
        if (e.getSource()==menuItem31) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==menuItem32) {
            getContentPane().setBackground(new Color(0,255,0));
        }    }
  /* private JButton boton1;
   private JButton boton2;
   private JButton boton3;
   
    public void inicializar(){
        setSize(400,400);
        setTitle("Bienvenidos a la escuela N° 350");
        
       // setLayout(new FlowLayout());
        setLayout(new GridLayout(3,1));
        
        boton1 = new JButton("Haz clic aqui por favor");
        boton2 = new JButton("Aceptar");
        boton3 = new JButton("Cancelar");
        
        boton1.setBackground(ORANGE);
        boton2.setBackground(GREEN);
        boton3.setBackground(BLUE);
        
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        
        pack();
        setIconImage(new ImageIcon(getClass().getResource
        ("/Resources/escuela.png")).getImage());
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/
   
    
}
