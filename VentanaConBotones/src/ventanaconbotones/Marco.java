
package ventanaconbotones;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import static java.awt.Color.ORANGE;
import static java.awt.Color.blue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Marco extends JFrame{
   private JButton boton1;
   private JButton boton2;
   private JButton boton3;
   
    public void inicializar(){
        setSize(400,400);
        setTitle("mi primer ventana");
        
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
        ("/Resources/pngtree-vector-open-book-icon-png-image_781382.jpg")).getImage());
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
