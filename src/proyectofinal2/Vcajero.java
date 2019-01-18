/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vcajero extends javax.swing.JFrame {

    
    public Vcajero() {
        initComponents();
         this.setLocationRelativeTo(null);//ESTO ES PARA QUE SE ABRA EN EL CENTRO
         this.cargarDatos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_obracajero = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_asis1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        b_mostrarlistasistentes = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        c_obradia = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        b_obrasdia = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_obradia = new javax.swing.JTable();
        b_obrasprox = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_obrasprox1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campo_idobra5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_presentes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_ausentes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        b_agregarasistencia = new javax.swing.JButton();
        b_actualizar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_obracajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA", "UBICACION", "TIPO"
            }
        ));
        jScrollPane1.setViewportView(tabla_obracajero);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTA DE OBRAS", jPanel1);

        tabla_asis1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRRE", "APELLIDO", "DIRECCION", "SEXO", "EMAIL", "TELEFONO"
            }
        ));
        jScrollPane2.setViewportView(tabla_asis1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("BUSCAR EMAIL");

        c_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emailActionPerformed(evt);
            }
        });

        b_mostrarlistasistentes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_mostrarlistasistentes.setText("MOSTRAR LISTA DE ASISTENTE");
        b_mostrarlistasistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarlistasistentesActionPerformed(evt);
            }
        });

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(b_mostrarlistasistentes)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mostrarlistasistentes)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BUSCAR ASISTENTE", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("BUSCAR OBRA");

        c_obradia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_obradiaActionPerformed(evt);
            }
        });

        jButton5.setText("BUSCAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        b_obrasdia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_obrasdia.setText("MOSTRAR OBRAS DEL DIA EN CURSO");
        b_obrasdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_obrasdiaActionPerformed(evt);
            }
        });

        tabla_obradia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRRE", "FECHA", "UBICACION", "TIPO"
            }
        ));
        jScrollPane3.setViewportView(tabla_obradia);

        b_obrasprox.setText("MOSTRAS OBRAS PRÓXIMAS");
        b_obrasprox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_obrasproxActionPerformed(evt);
            }
        });

        tabla_obrasprox1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE OBRA", "ID_ASISTENTE", "NOMBRE", "EMAIL", "ESTATUS"
            }
        ));
        jScrollPane8.setViewportView(tabla_obrasprox1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_obradia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(b_obrasdia)
                .addGap(56, 56, 56))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(b_obrasprox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_obradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_obrasdia)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(b_obrasprox)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("OBRA DEL DÌA", jPanel3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID OBRA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PRESENTES");

        tabla_presentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE OBRA", "ID_ASISTENTE", "NOMBRE", "EMAIL", "ESTATUS"
            }
        ));
        jScrollPane5.setViewportView(tabla_presentes);

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla_ausentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE OBRA", "ID_ASISTENTE", "NOMBRE", "EMAIL", "ESTATUS"
            }
        ));
        jScrollPane6.setViewportView(tabla_ausentes);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AUSENTES");

        b_agregarasistencia.setText("AGREGAR ASISTENCIA");
        b_agregarasistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarasistenciaActionPerformed(evt);
            }
        });

        b_actualizar.setText("ACTUALIZAR LISTAS");
        b_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_idobra5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_agregarasistencia)
                            .addComponent(b_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                            .addComponent(jScrollPane6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_idobra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(b_agregarasistencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(b_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTADO ASISTENCIAS", jPanel5);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono logout.png"))); // NOI18N
        jButton4.setText("CERRAR SESION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(710, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jTabbedPane1)
                    .addGap(7, 7, 7)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(0, 532, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarDatos(){
        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM obra");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_obracajero.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));
            info.add(datos.getString(4));
            info.add(datos.getString(5));
           
            modelo.addRow(info);
            tabla_obracajero.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login2 log= new Login2();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void b_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actualizarActionPerformed
        // TODO add your handling code here:

        int id_obra=Integer.parseInt(campo_idobra5.getText());

        Conexion con= new Conexion();
        con.conectar();

        ResultSet datos= con.consultatabla("select obra.nombre as Nombre_Obra,evento.id_asistente,"
            + "asistente.nombre as Nombre_Asistente,asistente.email,evento.estatus\n" +
            "from obra,asistente,evento \n" +
            "where obra.id_obra=evento.id_obra and asistente.id_asistente=evento.id_asistente\n" +
            "and evento.estatus='PRESENTE' and evento.id_obra="+id_obra);

        ResultSet datos2= con.consultatabla("select obra.nombre as Nombre_Obra,evento.id_asistente,"
            + "asistente.nombre as Nombre_Asistente,asistente.email,evento.estatus\n" +
            "from obra,asistente,evento \n" +
            "where obra.id_obra=evento.id_obra and asistente.id_asistente=evento.id_asistente\n" +
            "and evento.estatus='AUSENTE' and evento.id_obra="+id_obra);

        DefaultTableModel modelo= (DefaultTableModel)tabla_presentes.getModel();
        modelo.setRowCount(0);

        DefaultTableModel modelo2= (DefaultTableModel)tabla_ausentes.getModel();
        modelo2.setRowCount(0);

        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getString(1));
                info.add(datos.getInt(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                modelo.addRow(info);
                tabla_presentes.setModel(modelo);
            }

            while(datos2.next()){
                Vector info2= new Vector();
                info2.add(datos2.getString(1));
                info2.add(datos2.getInt(2));
                info2.add(datos2.getString(3));
                info2.add(datos2.getString(4));
                info2.add(datos2.getString(5));
                modelo2.addRow(info2);
                tabla_ausentes.setModel(modelo2);
            }
        }catch(SQLException e){
        }
    }//GEN-LAST:event_b_actualizarActionPerformed

    private void b_agregarasistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarasistenciaActionPerformed
        // TODO add your handling code here:
        int id_asistente= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE"));
        int id_obra=Integer.parseInt(campo_idobra5.getText());

        Conexion con= new Conexion();

        con.agregarasis(id_asistente, id_obra);

    }//GEN-LAST:event_b_agregarasistenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id_obra=Integer.parseInt(campo_idobra5.getText());

        Conexion con= new Conexion();
        con.conectar();

        ResultSet datos= con.consultatabla("select obra.nombre as Nombre_Obra,evento.id_asistente,"
            + "asistente.nombre as Nombre_Asistente,asistente.email,evento.estatus\n" +
            "from obra,asistente,evento \n" +
            "where obra.id_obra=evento.id_obra and asistente.id_asistente=evento.id_asistente\n" +
            "and evento.estatus='PRESENTE' and evento.id_obra="+id_obra);

        ResultSet datos2= con.consultatabla("select obra.nombre as Nombre_Obra,evento.id_asistente,"
            + "asistente.nombre as Nombre_Asistente,asistente.email,evento.estatus\n" +
            "from obra,asistente,evento \n" +
            "where obra.id_obra=evento.id_obra and asistente.id_asistente=evento.id_asistente\n" +
            "and evento.estatus='AUSENTE' and evento.id_obra="+id_obra);

        DefaultTableModel modelo= (DefaultTableModel)tabla_presentes.getModel();
        modelo.setRowCount(0);

        DefaultTableModel modelo2= (DefaultTableModel)tabla_ausentes.getModel();
        modelo2.setRowCount(0);

        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getString(1));
                info.add(datos.getInt(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                modelo.addRow(info);
                tabla_presentes.setModel(modelo);
            }

            while(datos2.next()){
                Vector info2= new Vector();
                info2.add(datos2.getString(1));
                info2.add(datos2.getInt(2));
                info2.add(datos2.getString(3));
                info2.add(datos2.getString(4));
                info2.add(datos2.getString(5));
                modelo2.addRow(info2);
                tabla_ausentes.setModel(modelo2);
            }
        }catch(SQLException e){
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_obrasdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_obrasdiaActionPerformed
        // TODO add your handling code here:

        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("select*from obra where fecha=CONVERT (date, SYSDATETIME()) ");

        DefaultTableModel modelo= (DefaultTableModel)tabla_obradia.getModel();
        modelo.setRowCount(0);
        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                modelo.addRow(info);
                tabla_obradia.setModel(modelo);
            }
        }catch(SQLException e){
        }
    }//GEN-LAST:event_b_obrasdiaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Conexion con= new Conexion();
        con.conectar();
        String obra= c_obradia.getText();
        ResultSet datos= con.consultatabla("select*from obra where nombre='"+obra+"'");

        DefaultTableModel modelo= (DefaultTableModel)tabla_obradia.getModel();
        modelo.setRowCount(0);
        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                modelo.addRow(info);
                tabla_obradia.setModel(modelo);
            }
        }catch(SQLException e){
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void c_obradiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_obradiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_obradiaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String email=(String)(c_email.getText());
        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM asistente WHERE email='"+ email + "'");

        DefaultTableModel modelo= (DefaultTableModel)tabla_asis1.getModel();
        modelo.setRowCount(0);

        try{
            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                info.add(datos.getString(6));
                info.add(datos.getString(7));
                modelo.addRow(info);
                tabla_asis1.setModel(modelo);
            }
        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b_mostrarlistasistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarlistasistentesActionPerformed

        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM asistente");

        DefaultTableModel modelo= (DefaultTableModel)tabla_asis1.getModel();
        modelo.setRowCount(0);
        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                info.add(datos.getString(6));
                info.add(datos.getString(7));
                modelo.addRow(info);
                tabla_asis1.setModel(modelo);
            }
        }catch(SQLException e){
        }
    }//GEN-LAST:event_b_mostrarlistasistentesActionPerformed

    private void c_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_emailActionPerformed
        // TODO add your handling code here:
        String sql= "SELECT*FROM asistentes WHERE email=?";

        Conexion conect = new Conexion();
        conect.consultatabla(sql);
        ResultSet datos = conect.consultatabla(sql);

        DefaultTableModel modelo= (DefaultTableModel)tabla_asis1.getModel();
        modelo.setRowCount(0);

        try{
            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                info.add(datos.getString(6));

                modelo.addRow(info);
                tabla_asis1.setModel(modelo);
            }
        }catch(SQLException e){

        }
    }//GEN-LAST:event_c_emailActionPerformed

    private void b_obrasproxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_obrasproxActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        con.conectar();

        ResultSet datos= con.consultatabla("select*from obra where fecha=DATEADD(day, 1, CONVERT (date, SYSDATETIME()))\n" +
            "union\n" +
            "select*from obra where fecha=DATEADD(day, 2, CONVERT (date, SYSDATETIME()))\n" +
            "union\n" +
            "select*from obra where fecha=DATEADD(day, 3, CONVERT (date, SYSDATETIME()))\n" +
            "union\n" +
            "select*from obra where fecha=DATEADD(day, 4, CONVERT (date, SYSDATETIME()))\n" +
            "union \n" +
            "select*from obra where fecha=DATEADD(day, 5, CONVERT (date, SYSDATETIME()))\n" +
            "union \n" +
            "select*from obra where fecha=DATEADD(day, 6, CONVERT (date, SYSDATETIME())) \n" +
            "union\n" +
            "select*from obra where fecha=DATEADD(day, 7, CONVERT (date, SYSDATETIME()))");

        DefaultTableModel modelo= (DefaultTableModel)tabla_obrasprox1.getModel();
        modelo.setRowCount(0);
        try{

            while(datos.next()){
                Vector info= new Vector();
                info.add(datos.getInt(1));
                info.add(datos.getString(2));
                info.add(datos.getString(3));
                info.add(datos.getString(4));
                info.add(datos.getString(5));
                modelo.addRow(info);
                tabla_obrasprox1.setModel(modelo);
            }
        }catch(SQLException e){
        }
    }//GEN-LAST:event_b_obrasproxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vcajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vcajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vcajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vcajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vcajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actualizar;
    private javax.swing.JButton b_agregarasistencia;
    private javax.swing.JButton b_mostrarlistasistentes;
    private javax.swing.JButton b_obrasdia;
    private javax.swing.JButton b_obrasprox;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_obradia;
    private javax.swing.JTextField campo_idobra5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_asis1;
    private javax.swing.JTable tabla_ausentes;
    private javax.swing.JTable tabla_obracajero;
    private javax.swing.JTable tabla_obradia;
    private javax.swing.JTable tabla_obrasprox1;
    private javax.swing.JTable tabla_presentes;
    // End of variables declaration//GEN-END:variables
}
