/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author baubyte
 */
public class FormAgenda extends javax.swing.JFrame {

    /**
     * Creates new form FomAgenda
     */
    public FormAgenda() {
        initComponents();
    }
    /**
     * ****************** Vectores a Utilizar************************
     */
    int[] vectorDni = new int[10];
    String[] vectorNombre = new String[10];
    String[] vectorApellido = new String[10];
    String[] vectorDireccion = new String[10];
    int[] vectorTelefono = new int[10];
    String[] vectorFechaNac = new String[10];
    int indice = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblFnac = new javax.swing.JLabel();
        txtFnac = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnAnt = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        lblIndice = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Electrónica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 153, 51));
        lblTitulo.setText("Agenda Electrónica");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(258, 258, 258))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblDni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 153, 51));
        lblDni.setText("DNI: ");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 153, 51));
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 153, 51));
        lblApellido.setText("Apellido:");

        txtNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 153, 51));

        txtApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 153, 51));

        txtDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 153, 51));

        lblDireccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 153, 51));
        lblDireccion.setText("Dirección: ");

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 153, 51));

        lblTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 153, 51));
        lblTelefono.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 153, 51));

        lblFnac.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFnac.setForeground(new java.awt.Color(0, 153, 51));
        lblFnac.setText("F. Nac:");

        txtFnac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtFnac.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblApellido)
                    .addComponent(lblDni)
                    .addComponent(lblNombre))
                .addGap(37, 37, 37)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFnac)
                    .addComponent(lblDireccion)
                    .addComponent(lblTelefono))
                .addGap(37, 37, 37)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFnac, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFnac)
                            .addComponent(txtFnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btnAnt.setForeground(new java.awt.Color(0, 153, 51));
        btnAnt.setText("<<");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        btnSig.setForeground(new java.awt.Color(0, 153, 51));
        btnSig.setText(">>");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        btnAgendar.setForeground(new java.awt.Color(0, 153, 51));
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        lblIndice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblIndice.setForeground(new java.awt.Color(0, 153, 51));
        lblIndice.setText("Indice:");

        txtIndice.setEditable(false);
        txtIndice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(0, 153, 51));
        txtIndice.setText("0");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(lblIndice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116)
                .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIndice))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        //Capturamos el valor del indice actual y lo parseamos a int
        indice = Integer.parseInt(txtIndice.getText());
        int dni = Integer.parseInt(txtDni.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String direccion = txtDireccion.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String fechaNac = txtFnac.getText();
        /**
         * Gardamos los datos en su vector correspodiente
         */
        vectorDni[indice] = dni;
        vectorNombre[indice] = nombre;
        vectorApellido[indice] = apellido;
        vectorDireccion[indice] = direccion;
        vectorTelefono[indice] = telefono;
        vectorFechaNac[indice] = fechaNac;
        //Comprobamos que no sea mayor a 9 y le sumamos 1
        if (indice < 9) {
            indice = indice + 1;
            txtIndice.setText(String.valueOf(indice));
        }

    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        //Capturamos el valor del indice actual y lo parseamos a int
        indice = Integer.parseInt(txtIndice.getText());
        if (indice > 0) {
            indice = indice - 1;
            txtIndice.setText(String.valueOf(indice));
        }
        /**
         * Asignamos los valores a los textField correspondientes
         */
        txtDni.setText(String.valueOf(vectorDni[indice]));
        txtNombre.setText(vectorNombre[indice]);
        txtApellido.setText(vectorApellido[indice]);
        txtDireccion.setText(vectorDireccion[indice]);
        txtTelefono.setText(String.valueOf(vectorTelefono[indice]));
        txtFnac.setText(vectorFechaNac[indice]);
    }//GEN-LAST:event_btnAntActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        //Capturamos el valor del indice actual y lo parseamos a int
        indice = Integer.parseInt(txtIndice.getText());
        if (indice < 9) {
            indice = indice + 1;
            txtIndice.setText(String.valueOf(indice));
        }
        /**
         * Asignamos los valores a los textField correspondientes
         */
        txtDni.setText(String.valueOf(vectorDni[indice]));
        txtNombre.setText(vectorNombre[indice]);
        txtApellido.setText(vectorApellido[indice]);
        txtDireccion.setText(vectorDireccion[indice]);
        txtTelefono.setText(String.valueOf(vectorTelefono[indice]));
        txtFnac.setText(vectorFechaNac[indice]);
    }//GEN-LAST:event_btnSigActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFnac;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFnac;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
