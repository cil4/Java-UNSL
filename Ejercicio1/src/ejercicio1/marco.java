/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author netXMM
 */
public class marco extends JFrame{
   private JLabel etiqueta;
   
    public void inicializar(){
        setSize(400,400);
        setTitle("mi primer ventana");
        
        etiqueta = new JLabel();
        etiqueta.setText("Hola mundo desarrolladores de java");
        etiqueta.setVerticalAlignment((int)CENTER_ALIGNMENT);
        etiqueta.setHorizontalAlignment((int)CENTER_ALIGNMENT);
        this.add(etiqueta);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
