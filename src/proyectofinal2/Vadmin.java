
package proyectofinal2;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Vadmin extends javax.swing.JFrame {

    public Vadmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_usuario = new javax.swing.JTextField();
        campo_contraseña = new javax.swing.JPasswordField();
        campo_perfil = new javax.swing.JComboBox<>();
        b_crearusuario = new javax.swing.JButton();
        b_eliminarusu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        b_mostrarusu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        campo_nombreasis = new javax.swing.JTextField();
        campo_apellidoasis = new javax.swing.JTextField();
        campo_telefono = new javax.swing.JTextField();
        campo_sexo = new javax.swing.JComboBox<>();
        b_crearasistente = new javax.swing.JButton();
        b_eliminarasis = new javax.swing.JButton();
        b_modsaistente = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_asistentes = new javax.swing.JTable();
        b_mostrarasistentes = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        campo_nombreobra = new javax.swing.JTextField();
        campo_fechaobra = new javax.swing.JTextField();
        campo_ubicacionobra = new javax.swing.JTextField();
        b_crearobra = new javax.swing.JButton();
        b_eliminarobra = new javax.swing.JButton();
        b_modobra = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_obras = new javax.swing.JTable();
        b_mostrarobra = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        campo_tipoobra = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_asistencias = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        campo_idobra = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_totalasistencias = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        campo_idobra1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_topasistencias = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabla_porcentaje1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        campo_sexo2 = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabla_topasistenciassexo = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabla_topdias = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_obracajero = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_asis1 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        c_email = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        c_obradia = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabla_obradia = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla_obrasprox1 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        campo_idobra5 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tabla_presentes = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        tabla_ausentes = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO USUARIO");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("USUARIO");

        jLabel5.setText("CONTRASEÑA");

        jLabel6.setText("PERFIL");

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAJERO", "ADMINISTRADOR" }));

        b_crearusuario.setText("CREAR USUARIO");
        b_crearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearusuarioActionPerformed(evt);
            }
        });

        b_eliminarusu.setText("ELIMINAR USUARIO");
        b_eliminarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarusuActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR USUARIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "USUARIO", "CONTRASEÑA", "NOMBRE", "APELLIDO", "PERFIL"
            }
        ));
        jScrollPane1.setViewportView(tabla_usuarios);

        b_mostrarusu.setText("MOSTRAR TODOS LOS USUARIOS");
        b_mostrarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarusuActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono crear.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono mod_usuario.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono delete_user.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono lista.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_nombre)
                    .addComponent(campo_apellido)
                    .addComponent(campo_usuario)
                    .addComponent(campo_contraseña)
                    .addComponent(campo_perfil, 0, 190, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_mostrarusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_eliminarusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_crearusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(campo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(campo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(campo_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campo_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_crearusuario)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_eliminarusu)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_mostrarusu)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADMINISTRADOR DE USUARIOS", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("FORMULARIO  ASISTENTE");

        jLabel16.setText("NOMBRE");

        jLabel17.setText("APELLIDO");

        jLabel18.setText("TELEFONO");

        jLabel19.setText("DIRECCIÓN");

        jLabel20.setText("SEXO");

        campo_nombreasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreasisActionPerformed(evt);
            }
        });

        campo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));

        b_crearasistente.setText("CREAR ASISTENTE");
        b_crearasistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearasistenteActionPerformed(evt);
            }
        });

        b_eliminarasis.setText("ELIMINAR ASISTENTE");
        b_eliminarasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarasisActionPerformed(evt);
            }
        });

        b_modsaistente.setText("MODIFICAR ASISTENTE");
        b_modsaistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modsaistenteActionPerformed(evt);
            }
        });

        tabla_asistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "DIRECCION", "SEXO", "EMAIL", "TELEFONO"
            }
        ));
        jScrollPane2.setViewportView(tabla_asistentes);
        if (tabla_asistentes.getColumnModel().getColumnCount() > 0) {
            tabla_asistentes.getColumnModel().getColumn(5).setHeaderValue("EMAIL");
            tabla_asistentes.getColumnModel().getColumn(6).setHeaderValue("TELEFONO");
        }

        b_mostrarasistentes.setText("MOSTRAR TODOS LOS ASISTENTES");
        b_mostrarasistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarasistentesActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono crear.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono mod_usuario.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono delete_user.png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono lista.png"))); // NOI18N

        jLabel29.setText("EMAIL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(campo_nombreasis)
                    .addComponent(campo_apellidoasis)
                    .addComponent(campo_telefono)
                    .addComponent(campo_sexo, 0, 190, Short.MAX_VALUE)
                    .addComponent(campo_email))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_mostrarasistentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_modsaistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_eliminarasis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_crearasistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(campo_nombreasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(campo_apellidoasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_crearasistente)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_modsaistente)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_eliminarasis)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_mostrarasistentes)
                            .addComponent(jLabel28))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADMINISTRADOR DE ASISTENTES", jPanel3);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("FORMULARIO  OBRA");

        jLabel60.setText("NOMBRE");

        jLabel61.setText("FECHA   AÑO-MES-DÍA");

        jLabel62.setText("UBICACIÓN");

        jLabel63.setText("TIPO");

        campo_nombreobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreobraActionPerformed(evt);
            }
        });

        b_crearobra.setText("CREAR OBRA");
        b_crearobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearobraActionPerformed(evt);
            }
        });

        b_eliminarobra.setText("ELIMINAR OBRA");
        b_eliminarobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarobraActionPerformed(evt);
            }
        });

        b_modobra.setText("MODIFICAR OBRA");
        b_modobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modobraActionPerformed(evt);
            }
        });

        tabla_obras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "FECHA (AÑO/MES/DÍA)", "UBICACIÓN", "TIPO"
            }
        ));
        jScrollPane5.setViewportView(tabla_obras);

        b_mostrarobra.setText("MOSTRAR TODAS LAS OBRAS");
        b_mostrarobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarobraActionPerformed(evt);
            }
        });

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono obra.png"))); // NOI18N

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono mod_usuario.png"))); // NOI18N

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono cancelar.png"))); // NOI18N

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono lista.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_tipoobra, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(campo_nombreobra)
                    .addComponent(campo_fechaobra)
                    .addComponent(campo_ubicacionobra))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_mostrarobra, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(b_modobra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_eliminarobra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_crearobra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(campo_nombreobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel61)
                                .addComponent(campo_fechaobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(campo_ubicacionobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel67))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel63)
                                    .addComponent(campo_tipoobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_crearobra)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_modobra)
                            .addComponent(jLabel70))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_eliminarobra)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_mostrarobra)
                            .addComponent(jLabel72))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADMINISTRADOR DE OBRAS", jPanel5);

        jButton1.setText("AGREGAR ASISTENTE A OBRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR ASISTENTE DE OBRA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("VER ASISTENTES DE UNA OBRA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tabla_asistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_EVENTO", "ID_OBRA", "ID_ASISTENTE", "Nombre_Asistente", "Apellido_Asistente", "Nombre_Obra"
            }
        ));
        jScrollPane6.setViewportView(tabla_asistencias);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono agregar user.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono delete_user.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono lista2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel30)
                    .addComponent(jButton4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel31))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jButton5))
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MANTENIMIENTO ASISTENCIAS", jPanel6);

        jLabel33.setText("INTRODUZCA EL ID DE LA OBRA");

        tabla_totalasistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_OBRA", "NOMBRE", "TOTAL ASISTENCIAS"
            }
        ));
        jScrollPane7.setViewportView(tabla_totalasistencias);

        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("PORCECNTAJE DE PERSONAS EN LISTA QUE ASISTIERON");

        jLabel35.setText("INTRODUZCA EL ID DE LA OBRA");

        jButton7.setText("CALCULAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tabla_topasistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_OBRA", "NOMBRE", "TOTAL ASISTENCIAS"
            }
        ));
        jScrollPane8.setViewportView(tabla_topasistencias);
        if (tabla_topasistencias.getColumnModel().getColumnCount() > 0) {
            tabla_topasistencias.getColumnModel().getColumn(2).setHeaderValue("TOTAL ASISTENTES");
        }

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("OBRAS DE TEATRO CON MAYOR ASISTENCIAS");

        tabla_porcentaje1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_OBRA", "NOMBRE", "PORCENTAJE"
            }
        ));
        jScrollPane9.setViewportView(tabla_porcentaje1);

        jButton8.setText("VER LISTA");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("OBRAS MÁS VISITADAS POR ");

        campo_sexo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOMBRES", "MUJERES" }));

        tabla_topasistenciassexo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID_OBRA", "NOMBRE", "TOTAL ASISTENTES"
            }
        ));
        jScrollPane10.setViewportView(tabla_topasistenciassexo);
        if (tabla_topasistenciassexo.getColumnModel().getColumnCount() > 0) {
            tabla_topasistenciassexo.getColumnModel().getColumn(2).setHeaderValue("TOTAL ASISTENTES");
        }

        jButton9.setText("BUSCAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("DÍAS DE LA SEMANA CON MÁS OBRAS PRESENTADAS");

        jButton10.setText("VER LISTA");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tabla_topdias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DÍA", "CANTIDAD DE OBRAS"
            }
        ));
        jScrollPane11.setViewportView(tabla_topdias);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("CANTIDAD DE ASISTENCIAS A UNA OBRA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_idobra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_idobra1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(42, 42, 42)
                        .addComponent(jButton8))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_sexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(campo_idobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(campo_idobra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(campo_sexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("CANTIDAD DE ASISTENCIAS", jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("REPORTES", jPanel7);

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
        jScrollPane3.setViewportView(tabla_obracajero);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("LISTA DE OBRAS", jPanel9);

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
        jScrollPane4.setViewportView(tabla_asis1);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("BUSCAR EMAIL");

        c_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emailActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("MOSTRAR LISTA DE ASISTENTE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("BUSCAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(56, 56, 56))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("BUSCAR ASISTENTE", jPanel10);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("BUSCAR OBRA");

        c_obradia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_obradiaActionPerformed(evt);
            }
        });

        jButton13.setText("BUSCAR");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setText("MOSTRAR OBRAS DEL DIA EN CURSO");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
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
        jScrollPane12.setViewportView(tabla_obradia);

        jButton15.setText("MOSTRAS OBRAS PRÓXIMAS");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
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
                "ID OBRA", "NOMBRE", "FECHA", "UBICACIÓN", "TIPO"
            }
        ));
        jScrollPane13.setViewportView(tabla_obrasprox1);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_obradia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(56, 56, 56))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(c_obradia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane3.addTab("OBRA DEL DÌA", jPanel12);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ID OBRA");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("PRESENTES");

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
        jScrollPane14.setViewportView(tabla_presentes);

        jButton16.setText("BUSCAR");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
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
        jScrollPane15.setViewportView(tabla_ausentes);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("AUSENTES");

        jButton17.setText("AGREGAR ASISTENCIA");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("ACTUALIZAR LISTAS");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel43))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_idobra5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel44))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                            .addComponent(jScrollPane15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(campo_idobra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("LISTADO ASISTENCIAS", jPanel13);

        jTabbedPane1.addTab("FUNCIONES CAJERO", jTabbedPane3);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono logout.png"))); // NOI18N
        jButton3.setText("CERRAR SESION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed

    
    
    
    /*CON ESTE METODO AL MOMENTO DE PRESIONAR EL BOTON DE CREAR USUARIO
    SE ALMACENAN LOS DATOS DE LOS DIFERENTES CAMPOS EN DISTINTAS VARIABLES,
    Y LUEGO SE HACE UN INSERT EN LA BASE DE DATOS CON LAS DIFERENTES VARIABLES */
    private void b_crearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearusuarioActionPerformed
        // TODO add your handling code here:
        
        String nombre=campo_nombre.getText();
        String apellido=campo_apellido.getText();
        String usuario=campo_usuario.getText();
        String contraseña=campo_contraseña.getText(); 
        String perfil=(String)campo_perfil.getSelectedItem();
        
        if(usuario.equals("") | contraseña.equals("")){
            JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA VACIOS");
        }else{ 
        Conexion con= new Conexion();
        con.crearusuario(nombre, apellido, usuario, contraseña, perfil);
        //Usuario usuarion= new Usuario(usuario,contraseña,nombre,apellido,perfil);
        
        }
            
    }//GEN-LAST:event_b_crearusuarioActionPerformed

    
    
    /*CON ESTE METODO, AL MOMENTO DE CERRAR SESION SE CREA UNA VENTANA NUEVA DE TIPO
    LOGIN Y SE CIERRA LA ACTUAL*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login1 log= new Login1();
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    /*CON ESTE METODO SE HACE UN SELECT EN LA BASE DE DATOS, QUE LUEGO SE MUESTRA
    EN LA TABLA DE USUARIOS DE LA VENTANA*/
    private void b_mostrarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarusuActionPerformed
        // TODO add your handling code here:
        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM usuario");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_usuarios.getModel();
        modelo.setRowCount(0);
        
        try{
            /*EN ESTA PARTE TODAS LAS INFORMACIONES CONTENIDAS EN EL RESULTSET DATOS
            SE VAN GUARDANDO EN UN VECTOR LLAMADO INFO*/
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));
            info.add(datos.getString(4));
            info.add(datos.getString(5));
            info.add(datos.getString(6));
            modelo.addRow(info);
            tabla_usuarios.setModel(modelo);//LUEGO SE PASAN LAS INFORMACIONES AL MODELO DE TABLA
            }           
        }catch(SQLException e){
        
        }
        
    }//GEN-LAST:event_b_mostrarusuActionPerformed

    
    /*AL MOMENTO DE PRESIONAR EL BOTON DE ELIMNAR USUARIO 
    SE TOMARÁ EL CONTENIDO DEL USUARIO Y SU CONTRASEÑA Y SE HARÁ
    UN DELETE EN LA BASE DE DATOS AL REGITRO DEL USUSARIO*/
    private void b_eliminarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarusuActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        
        String usuario= campo_usuario.getText();
        String contraseña= campo_contraseña.getText();
        
        if(usuario.equalsIgnoreCase("")|contraseña.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "USUARIO DEL USUARIO REQUERIDO");
        }else{
        con.eliminarusu(usuario, contraseña);
        }
                   
    }//GEN-LAST:event_b_eliminarusuActionPerformed

    
    
    
    /*CON ESTE METODO AL MOMENTO DE PRESIONAR EL BOTON DE MODIFICAR USUARIO
    SE VERIFICA PRIMERO QUE EL USUARIO EXISTA Y LUEGO SI EXISTE SE CREA UNA VENTANA
    DE TIPO ModDatos EN LA CUAL SE PRESENTA TODA LA INFORMACIÒN DEL USUARIO INTRODUCIDO
    DISPONIBLE PARA CAMBIAR LAS INFORMACIONES  NECESARIAS*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String usuario= campo_usuario.getText();
        String contraseña= campo_contraseña.getText();
        Conexion con= new Conexion();
        
        if(usuario.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "DEBE INTRODUCIR EL USUARIO QUE DESEA MODIFICAR");
        }else{
        
            /*LA INFORMACION DEL USUARIO SE ALMACENA EN UN ARRAYLIST
            Y LUEGO SE DECLARAN LAS DIFERENTES INFORMACIONES CONTENIDAS 
            EN EL ARRAYLIST EN DIFERENTES VARIABLES PARA LUEGO INTRODUCIRLAS
            COMO PARAMETRO EN EL CONSTRUCTOR DE ModDatos*/
        ArrayList<String> info=con.getinfo(usuario);
        
        String contra= info.get(0);
        String nom= info.get(1);
        String apell= info.get(2);
        //String perf= info.get(3);
        
        ModDatos nueva_info= new ModDatos(contra,nom,apell,usuario);
        
        nueva_info.setVisible(true);  
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campo_nombreasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreasisActionPerformed

    
    
    /*EL SIGUIENTE METODO CREA UN NUEVO ASISTENTE CON LAS INFORMACIONES CONTENIDAS
    EN LOS DIFERENTES CAMPOS DEL FORMULARIO*/
    private void b_crearasistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearasistenteActionPerformed
        // TODO add your handling code here:
        
        if(campo_nombreasis.getText().equalsIgnoreCase("") | campo_apellidoasis.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "NOMBRE Y APELLIDO DEL ASISTENTE REQUERIDOS");
        }else{
  
        String nombre= campo_nombreasis.getText();
        String apellido= campo_apellidoasis.getText();
        String direccion= campo_direccion.getText();
        String sexo= (String)campo_sexo.getSelectedItem();
        String email= campo_email.getText();
        String telefono= campo_telefono.getText();
        
        
        /*CON LA INFORMACION YA GUARDADA EN DIFERENTES VARIABLES, ESTAS PASAN COMO
        PARAMETROS AL METODO CREARASISTENTE DE LA CLASE CONEXION*/
        Conexion con= new Conexion();
        con.crearasistente(nombre, apellido, direccion, sexo, email, telefono);

        }
        
    }//GEN-LAST:event_b_crearasistenteActionPerformed

    
    
    
    /*EL SIGUIENTE METODO RECIBE UN ID DE ASISTENTE PARA ELIMINARLO DE LA BASE DE DATOS*/
    private void b_eliminarasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarasisActionPerformed
        // TODO add your handling code here:
        Conexion con= new Conexion();
        Integer id=null;
        
        try{
        id=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE QUE DESEA ELIMINAR"));
        }catch(NumberFormatException e){
            
        }
        
        if(id!=null){
        int id2= (int)id;
        //EL ID INTRODUCIDO PASA COMO PARAMETRO EN EL METODO ELIMINARASIS DE LA CLASE CONEXION
        //LA CUAL SE ENCARGA DE ELIMINAR EL ASISTENTE CON DICHO ID DE LA BASE DE DATOS
        con.eliminarasis(id);
        }
    }//GEN-LAST:event_b_eliminarasisActionPerformed

    
    /*EL SIGUIENTE METODO PIDE UN ID DE UN ASISTENTE PARA PODER MODIFICAR SU INFORMACION*/
    private void b_modsaistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modsaistenteActionPerformed
        // TODO add your handling code here:
        
         Integer id=null;
         Boolean bien=false;
         Conexion con= new Conexion();
         
         //EL ID EN INTRODUCIDO POR EL USUARIO MEDIANTE UN JOPTIONPANE
        try{
            
        id=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE QUE DESEA MODIFICAR"));
        }catch(NumberFormatException e){//SI EL USUARIO NO INTRODUCE NINGUN NUMERO SE ATRAPA EL ERROR DE TIPO NUMBERFORMATEXCEPTION
            
        }
        
        
        /*EL ID INTRODUCIDO SE VALIDA EN LA BASE DE DATOS MEDIANTE EL METODO VALIDASISTENTE
        DE LA CLASE CONEXION*/
        if(id!=null){
        int id2= (int)(id);//SE CONVIERTE EL ID DE INTEGER A INT
        Boolean confirm= con.validasistente(id);//SE PASA EL ID AL METODO VALIDASISTENTE
        
        
        /*SI EL ID DEL ASISTENTE EXISTE SE PROCEDE A GUARDAR LA INFORMACION RETORNADA
        POR EL METODO GETINFOASISTENTE DE LA CLASE CONEXION, Y SE ALMACENA EN UN ARRAYLIST
        LLAMADO INFO*/
        if(confirm){
   
        ArrayList<String> info= con.getinfoasistente(id2);
        
        /*LUEGO SE DECLARAN VARIAS VARIABLES GUARDANDO LA INFORMACION CONTENIDA
        EN CADA UNO DE LOS ESPACIOS DEL ARRAYLIST*/
        String nombre=(String)info.get(0);
        String apellido=(String)info.get(1);
        String direccion=(String)info.get(2);
        String sexo=(String)info.get(3);
        String email=(String)info.get(4);
        String telefono=(String)info.get(5);
       
        
        /*LUEGO ESTAS VARIABLES PASAN COMO PARAMETROS EN EL CONSTRUCTOR DEL OBJETO TIPO
        ModDatosAisS*/
        ModDatosAsis nueva_info= new ModDatosAsis(id,nombre,apellido,direccion,sexo,email,telefono);
        
        }
        }
   
    }//GEN-LAST:event_b_modsaistenteActionPerformed

    
    
    
    /*EL SIGUIENTE METODO PRESENTA EN TABLA TODOS LOS REGISTROS DE ASISTENTES EXISTENTES
    EN LA BASE DE DATOS*/
    private void b_mostrarasistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarasistentesActionPerformed
        // TODO add your handling code here:
        Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM asistente");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_asistentes.getModel();
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
            tabla_asistentes.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
        
        
    }//GEN-LAST:event_b_mostrarasistentesActionPerformed

    private void campo_nombreobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreobraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreobraActionPerformed

    private void b_crearobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearobraActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        
        String nombre= campo_nombreobra.getText();
        String fecha= campo_fechaobra.getText();
        String ubicacion= campo_ubicacionobra.getText();
        String tipo= campo_tipoobra.getText();
        
        
        if(nombre.equalsIgnoreCase("") | fecha.equalsIgnoreCase("") | ubicacion.equalsIgnoreCase("") | tipo.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON NECESARIOS PARA CREAR LA OBRA");
        }else{
        con.crearobra(nombre, fecha, ubicacion, tipo);
        }
    }//GEN-LAST:event_b_crearobraActionPerformed

    private void b_eliminarobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarobraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_eliminarobraActionPerformed

    private void b_modobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modobraActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        Integer id=null;
        
        try{
            
        id=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DE LA OBRA QUE DESEA MODIFICAR"));
        
        }catch(NumberFormatException e){//SI EL USUARIO NO INTRODUCE NINGUN NUMERO SE ATRAPA EL ERROR DE TIPO NUMBERFORMATEXCEPTION
            
        }
        
        
        /*EL ID INTRODUCIDO SE VALIDA EN LA BASE DE DATOS MEDIANTE EL METODO VALIDASISTENTE
        DE LA CLASE CONEXION*/
        if(id!=null){
        int id2= (int)(id);//SE CONVIERTE EL ID DE INTEGER A INT
        
        Boolean confirmar= con.validobra(id2);
        
        if(confirmar){
        
        ArrayList<String> info= con.getinfoobra(id2);
        
        String nombre= info.get(0);
        String fecha= info.get(1);
        String ubicacion= info.get(2);
        String tipo= info.get(3);
        
        ModDatosObra mod_info= new ModDatosObra(id2,nombre,fecha,ubicacion,tipo);
        
      
        }
        
        
        }
        
        
    }//GEN-LAST:event_b_modobraActionPerformed

    private void b_mostrarobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarobraActionPerformed
        // TODO add your handling code here:
                Conexion con= new Conexion();
        con.conectar();
        ResultSet datos= con.consultatabla("SELECT*FROM obra");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_obras.getModel();
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
            tabla_obras.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
  
    }//GEN-LAST:event_b_mostrarobraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Conexion con= new Conexion(); 
       Integer id_obra=null;
       Integer id_asistente=null;
       
       try{ 
       id_obra=Integer.parseInt( JOptionPane.showInputDialog("INTRODUZCA EL ID DE LA OBRA"));
        
       id_asistente=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE"));
       }catch(NumberFormatException e){
           
       }
       
       if(id_obra!=null && id_asistente!=null){
       
           int id_obra2= (int)id_obra;
           int id_asistente2= (int)id_asistente;
           
           con.AgregarAsistenteObra(id_obra2, id_asistente2);
       }
       
       
       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

       Conexion con= new Conexion(); 
       Integer id_obra=null;
       Integer id_asistente=null;
       
       try{ 
       id_obra=Integer.parseInt( JOptionPane.showInputDialog("INTRODUZCA EL ID DE LA OBRA"));
        
       id_asistente=Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE"));
       }catch(NumberFormatException e){
           
       }
       
       if(id_obra!=null && id_asistente!=null){
       
           int id_obra2= (int)id_obra;
           int id_asistente2= (int)id_asistente;
           
          con.EliminarAsistenciaObra(id_obra2, id_asistente2);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        con.conectar();
        
        String query="SELECT id_evento, evento.id_obra,evento.id_asistente,asistente.nombre as Nombre_ASistente, "
                + "asistente.apellido as Apellido_Asistente, obra.nombre as Nombre_Obra,evento.estatus from evento,asistente,obra "
                + "where asistente.id_asistente=evento.id_asistente and obra.id_obra=evento.id_obra and obra.nombre=?";
        
        
        String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("SELECT id_evento, evento.id_obra,evento.id_asistente,asistente.nombre as Nombre_ASistente, asistente.apellido as Apellido_Asistente, obra.nombre as Nombre_Obra,evento.estatus from evento,asistente,obra where asistente.id_asistente=evento.id_asistente and obra.id_obra=evento.id_obra and obra.nombre='"+nombre_obra+"'");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_asistencias.getModel();
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
            tabla_asistencias.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        int id_obra=0;
        try{
        id_obra= Integer.parseInt(campo_idobra.getText());
        }catch(NumberFormatException e){ 
            JOptionPane.showMessageDialog(null, "ID INCORRECTO");  
            campo_idobra1.setText("");
        }
        
          
        Conexion con= new Conexion();
        con.conectar();
        
       String sql="SELECT evento.id_obra,nombre as Nombre,COUNT(id_asistente) as Total_Asistencias from evento,obra \n" +
        "where obra.id_obra=evento.id_obra \n" +
        "and evento.id_obra=? and estatus='PRESENTE' \n" +
        "group by evento.id_obra,obra.nombre";
        
        
       // String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("SELECT evento.id_obra,nombre as Nombre,COUNT(id_asistente) as Total_Asistencias from evento,obra \n" +
            "where obra.id_obra=evento.id_obra \n" +
            "and evento.id_obra="+id_obra+" and estatus='PRESENTE' \n" +
            "group by evento.id_obra,obra.nombre");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_totalasistencias.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));

            modelo.addRow(info);
            tabla_totalasistencias.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        Conexion con= new Conexion();
        con.conectar();
        
        //int id_obra= Integer.parseInt(campo_idobra1.getText());
        
        int id_obra=0;
        try{
        id_obra= Integer.parseInt(campo_idobra1.getText());
        
        
        }catch(NumberFormatException e){ 
            JOptionPane.showMessageDialog(null, "ID INCORRECTO");
            campo_idobra1.setText("");
        }
        
       String sql="DECLARE @resultado int\n" +
        "DECLARE @obra int\n" +
        "SET @obra=" +id_obra+
        "EXECUTE Porcentaje_asistencia @obra, @resultado output\n" +
        "select id_obra, nombre,@resultado as porcentaje from obra where obra.id_obra=@obra";
        
       // String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("DECLARE @resultado int\n" +
        "DECLARE @obra int\n" +
        "SET @obra=" +id_obra+
        " EXECUTE Porcentaje_asistencia @obra, @resultado output\n" +
        "select id_obra, nombre,@resultado as porcentaje from obra where obra.id_obra=@obra");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_porcentaje1.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));

            modelo.addRow(info);
            tabla_porcentaje1.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        Conexion con= new Conexion();
        con.conectar();

       // String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("select top 5 evento.id_obra,nombre,COUNT(id_asistente) as Total_Asistentes from evento,obra \n" +
        "where obra.id_obra=evento.id_obra and evento.estatus='PRESENTE' group by evento.id_obra,obra.nombre \n" +
        "order by Total_Asistentes desc ");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_topasistencias.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));

            modelo.addRow(info);
            tabla_topasistencias.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Conexion con= new Conexion();
        con.conectar();
        
        String sexo1= (String)campo_sexo2.getSelectedItem();
        
        String sexo2="";
        
        if(sexo1.equalsIgnoreCase("hombres")){
            sexo2="MASCULINO";
        }else if(sexo1.equalsIgnoreCase("mujeres")){
            sexo2="FEMENINO";
        }
        
       // String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("select evento.id_obra, obra.nombre ,count(asistente.sexo)\n" +
            " as total_hombres from evento,asistente,obra where asistente.id_asistente=evento.id_asistente\n" +
            "  and obra.id_obra=evento.id_obra \n" +
            "  and sexo='"+sexo2+"' group by evento.id_obra, obra.nombre");

        DefaultTableModel modelo= (DefaultTableModel)tabla_topasistenciassexo.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getInt(1));
            info.add(datos.getString(2));
            info.add(datos.getString(3));

            modelo.addRow(info);
            tabla_topasistenciassexo.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

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
    
    
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        Conexion con= new Conexion();
        con.conectar();

       // String nombre_obra= (String)JOptionPane.showInputDialog("ESCRIBA EL NOMBRE DE LA OBRA QUE DESEA CONSULTAR");
        //PreparedStatement orden= con.prepareStatement(query);
        
        ResultSet datos= con.consultatabla("SET LANGUAGE Spanish\n" +
        "select datename(dw,fecha)as dia ,count(datename(dw,fecha)) as cantidad  \n" +
        "from obra group by datename(dw,fecha) order by cantidad desc");
        
        DefaultTableModel modelo= (DefaultTableModel)tabla_topdias.getModel();
        modelo.setRowCount(0);
        
        try{
            while(datos.next()){
            Vector info= new Vector();    
            info.add(datos.getString(1));
            info.add(datos.getInt(2));

            modelo.addRow(info);
            tabla_topdias.setModel(modelo);
            }           
        }catch(SQLException e){
        
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

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
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
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
    }//GEN-LAST:event_jButton12ActionPerformed

    private void c_obradiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_obradiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_obradiaActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
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
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
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
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
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
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
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
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        int id_asistente= Integer.parseInt(JOptionPane.showInputDialog("INTRODUZCA EL ID DEL ASISTENTE"));
        int id_obra=Integer.parseInt(campo_idobra5.getText());

        Conexion con= new Conexion();

        con.agregarasis(id_asistente, id_obra);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
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
    }//GEN-LAST:event_jButton18ActionPerformed

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
            java.util.logging.Logger.getLogger(Vadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crearasistente;
    private javax.swing.JButton b_crearobra;
    private javax.swing.JButton b_crearusuario;
    private javax.swing.JButton b_eliminarasis;
    private javax.swing.JButton b_eliminarobra;
    private javax.swing.JButton b_eliminarusu;
    private javax.swing.JButton b_modobra;
    private javax.swing.JButton b_modsaistente;
    private javax.swing.JButton b_mostrarasistentes;
    private javax.swing.JButton b_mostrarobra;
    private javax.swing.JButton b_mostrarusu;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_obradia;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_apellidoasis;
    private javax.swing.JPasswordField campo_contraseña;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_fechaobra;
    private javax.swing.JTextField campo_idobra;
    private javax.swing.JTextField campo_idobra1;
    private javax.swing.JTextField campo_idobra5;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nombreasis;
    private javax.swing.JTextField campo_nombreobra;
    private javax.swing.JComboBox<String> campo_perfil;
    private javax.swing.JComboBox<String> campo_sexo;
    private javax.swing.JComboBox<String> campo_sexo2;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JTextField campo_tipoobra;
    private javax.swing.JTextField campo_ubicacionobra;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tabla_asis1;
    private javax.swing.JTable tabla_asistencias;
    private javax.swing.JTable tabla_asistentes;
    private javax.swing.JTable tabla_ausentes;
    private javax.swing.JTable tabla_obracajero;
    private javax.swing.JTable tabla_obradia;
    private javax.swing.JTable tabla_obras;
    private javax.swing.JTable tabla_obrasprox1;
    private javax.swing.JTable tabla_porcentaje1;
    private javax.swing.JTable tabla_presentes;
    private javax.swing.JTable tabla_topasistencias;
    private javax.swing.JTable tabla_topasistenciassexo;
    private javax.swing.JTable tabla_topdias;
    private javax.swing.JTable tabla_totalasistencias;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
