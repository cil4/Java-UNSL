package ventanas;


import ConexionBD.BD;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Estudiante;


public class HomeEstudLogin extends javax.swing.JFrame {

       Icon message= new ImageIcon(getClass().getResource("/Resources/message.png"));
           Icon icon = new ImageIcon(getClass().getResource("/Resources/error.png"));
    Connection c = null;

          BD con;
    ResultSet result;
        
	
	
    public HomeEstudLogin(Map<String, String> data) {
        initComponents();
           con= new BD();
        con.Conectar();

     String pass= data.get("Key");
     try{
     result= con.ConsultaEstud(pass);
     while(result.next()){
         usuarioL.setText(result.getString("U_Nbre"));
         NombreL.setText(result.getString("E_Nbre"));
        ApellidoL.setText(result.getString("E_Apell"));
        dniL.setText(result.getString("E_DNI"));
        telefonoL.setText(result.getString("E_Tel"));
        emailL.setText(result.getString("E_Email"));
        imagePath.setText(result.getString("E_Foto"));
        comboBoxCursoL.setSelectedItem(result.getString("E_Curso"));
        tutorNL.setText(result.getString("E_NbreTutor"));
        tutorAL.setText(result.getString("E_ApellTutor"));
        passwordL.setText(result.getString("U_Key"));
     }
     }catch(SQLException ex){
         System.out.println(ex);
     }
     imagePath.setVisible(false);
     String imgpath= imagePath.getText();
        setFoto(imgpath);
        setLocationRelativeTo(null);
        
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        usuarioL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordL = new javax.swing.JTextField();
        mostrarNombre = new javax.swing.JLabel();
        mostrarApellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreL = new javax.swing.JTextField();
        ApellidoL = new javax.swing.JTextField();
        dniL = new javax.swing.JTextField();
        emailL = new javax.swing.JTextField();
        telefonoL = new javax.swing.JTextField();
        tutorNL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboBoxCursoL = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tutorAL = new javax.swing.JTextField();
        labelImage = new javax.swing.JLabel();
        imagePath = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInstitucional = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escuela N ° 178 ");
        setIconImage(new ImageIcon(getClass().getResource("/Resources/e1.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre de usuario: ");

        usuarioL.setEditable(false);
        usuarioL.setBackground(new java.awt.Color(255, 255, 255));
        usuarioL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        usuarioL.setForeground(new java.awt.Color(20, 107, 109));
        usuarioL.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Contraseña");

        passwordL.setEditable(false);
        passwordL.setBackground(new java.awt.Color(255, 255, 255));
        passwordL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        passwordL.setForeground(new java.awt.Color(20, 107, 109));
        passwordL.setBorder(null);

        mostrarNombre.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        mostrarNombre.setForeground(new java.awt.Color(102, 102, 102));
        mostrarNombre.setText("Nombre :");

        mostrarApellido.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        mostrarApellido.setForeground(new java.awt.Color(102, 102, 102));
        mostrarApellido.setText("Apellido:");
        mostrarApellido.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("D.N.I:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Correo electrónico:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Teléfono de contacto:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Curso:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nombre del Tutor:");

        NombreL.setEditable(false);
        NombreL.setBackground(new java.awt.Color(255, 255, 255));
        NombreL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        NombreL.setForeground(new java.awt.Color(20, 107, 109));
        NombreL.setBorder(null);

        ApellidoL.setEditable(false);
        ApellidoL.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ApellidoL.setForeground(new java.awt.Color(20, 107, 109));
        ApellidoL.setBorder(null);

        dniL.setEditable(false);
        dniL.setBackground(new java.awt.Color(255, 255, 255));
        dniL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        dniL.setForeground(new java.awt.Color(20, 107, 109));
        dniL.setBorder(null);
        dniL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniLActionPerformed(evt);
            }
        });

        emailL.setEditable(false);
        emailL.setBackground(new java.awt.Color(255, 255, 255));
        emailL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        emailL.setForeground(new java.awt.Color(20, 107, 109));
        emailL.setBorder(null);

        telefonoL.setEditable(false);
        telefonoL.setBackground(new java.awt.Color(255, 255, 255));
        telefonoL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        telefonoL.setForeground(new java.awt.Color(20, 107, 109));
        telefonoL.setBorder(null);

        tutorNL.setEditable(false);
        tutorNL.setBackground(new java.awt.Color(255, 255, 255));
        tutorNL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tutorNL.setForeground(new java.awt.Color(20, 107, 109));
        tutorNL.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Datos Personales del Estudiante");

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cap-studente.png"))); // NOI18N

        comboBoxCursoL.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCursoL.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        comboBoxCursoL.setForeground(new java.awt.Color(20, 107, 109));
        comboBoxCursoL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "201", "202", "203" }));
        comboBoxCursoL.setBorder(null);
        comboBoxCursoL.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Apellido del Tutor:");

        tutorAL.setEditable(false);
        tutorAL.setBackground(new java.awt.Color(255, 255, 255));
        tutorAL.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tutorAL.setForeground(new java.awt.Color(20, 107, 109));
        tutorAL.setBorder(null);

        labelImage.setBackground(new java.awt.Color(204, 204, 0));
        labelImage.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        labelImage.setForeground(new java.awt.Color(102, 102, 102));
        labelImage.setText("Foto");
        labelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 63, 65));
        jLabel11.setText("Desarrollado por Marianela Cilene Gamarra - Argentina Programa & UNSL - 2023");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGap(0, 98, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(mostrarApellido)
                    .addComponent(mostrarNombre)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioL)
                    .addComponent(passwordL)
                    .addComponent(NombreL)
                    .addComponent(ApellidoL)
                    .addComponent(dniL, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(telefonoL)
                    .addComponent(emailL)
                    .addComponent(comboBoxCursoL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tutorNL)
                    .addComponent(tutorAL))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(usuarioL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarNombre)
                            .addComponent(NombreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarApellido)
                            .addComponent(ApellidoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dniL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefonoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxCursoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tutorNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tutorAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        jPanel3.setBackground(new java.awt.Color(229, 241, 241));

        jButton1.setBackground(new java.awt.Color(102, 175, 175));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/estud.png"))); // NOI18N
        jButton1.setText("Perfil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(229, 241, 241));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/edit.png"))); // NOI18N
        jButton2.setText("Modificar perfil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(229, 241, 241));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lupa.png"))); // NOI18N
        jButton3.setText("Consultas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 175, 175));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/salir.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnInstitucional.setBackground(new java.awt.Color(229, 241, 241));
        btnInstitucional.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnInstitucional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/esc1.png"))); // NOI18N
        btnInstitucional.setText("Institucional");
        btnInstitucional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitucionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInstitucional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniLActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          JOptionPane.showMessageDialog(null, "Has cerrado sesión.",
                    "¡Éxito!", JOptionPane.INFORMATION_MESSAGE, message);
        VentanaInicio vi = new VentanaInicio();
        vi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  String e_contrasenia =passwordL.getText();
        String e_curso= (String) comboBoxCursoL.getSelectedItem();
        String e_dni= dniL.getText();
   
        Map<String, String> dataC= new HashMap<>();
                   dataC.put("Key", e_contrasenia); 
                   dataC.put("e_curso", e_curso);
                   dataC.put("dni", e_dni);
        
        ConsultasEstudiante ce= new ConsultasEstudiante(dataC);
        ce.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             String ctr =passwordL.getText();
   
        Map<String, String> dataE= new HashMap<>();
                   dataE.put("Key", ctr); 

       EditEstudiante et= new EditEstudiante(dataE);
        et.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInstitucionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitucionalActionPerformed
        String c= passwordL.getText();
        Map<String, String> dataI= new HashMap<>();
        dataI.put("Key", c);
        InstitucionalEstudiante ie= new InstitucionalEstudiante(dataI);
       ie.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_btnInstitucionalActionPerformed

 
public void setNombre(String n){
    NombreL.setText(n);
}
public void setApellido(String a){
    ApellidoL.setText(a);
}
public void setNombreUsuario(String user){
            usuarioL.setText(user);
        }
      public void setPassword(String pass){
            passwordL.setText(pass);
        }
//     
       public void setDni(int d){
            dniL.setText(Integer.toString(d));
        }
        public void setTelef(String tel){
            telefonoL.setText(tel);
        }
        public void setEmail(String correo){
            emailL.setText(correo);
        }
        public void setFoto(String imgPath){
//          
            imagePath.setText(imgPath);
            ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(labelImage.getWidth(), labelImage.getHeight(),Image.SCALE_SMOOTH);
        labelImage.setIcon(new ImageIcon(newImage));
        labelImage.setText("");
        }
////  
//      
       public void setCurso(String c){
            comboBoxCursoL.setSelectedItem(c);
        }
        public void setTutorNbre(String t_n){
            tutorNL.setText(t_n);
        }
        public void setTutorAp(String t_a){
            tutorAL.setText(t_a);
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoL;
    private javax.swing.JTextField NombreL;
    private javax.swing.JButton btnInstitucional;
    private javax.swing.JComboBox<String> comboBoxCursoL;
    private javax.swing.JTextField dniL;
    private javax.swing.JTextField emailL;
    private javax.swing.JTextField imagePath;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel mostrarApellido;
    private javax.swing.JLabel mostrarNombre;
    private javax.swing.JTextField passwordL;
    private javax.swing.JTextField telefonoL;
    private javax.swing.JTextField tutorAL;
    private javax.swing.JTextField tutorNL;
    private javax.swing.JTextField usuarioL;
    // End of variables declaration//GEN-END:variables
 
}
