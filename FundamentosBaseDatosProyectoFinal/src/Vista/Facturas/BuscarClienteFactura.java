/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Facturas;

import Controlador.ControladorCliente;
import Controlador.ControladorPersona;
import Modelo.Personas.Persona.Cliente;
import Modelo.Personas.Persona.Persona;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author venot
 */
public class BuscarClienteFactura extends javax.swing.JInternalFrame {
    private Cliente cliente;
    private ControladorPersona controladorPersona;
    private ControladorCliente controladorCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    /**
     * Creates new form BuscarCliente
     */
    public BuscarClienteFactura(Cliente cliente,JTextField nombre,JTextField apellido, JTextField cedula, 
            JTextField correo, JTextField direccion,JTextField telefono) {
        initComponents();
        this.cliente= cliente;
        controladorPersona = new ControladorPersona();
        controladorCliente = new ControladorCliente();
        txtNombre = nombre;
        txtApellido = apellido;
        txtCorreo = correo;
        txtDireccion = direccion;
        txtTelefono = telefono;
        txtCedula2 = cedula;
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
        txtCedula = new javax.swing.JTextField();
        jBntCancelar = new javax.swing.JButton();
        jBntBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jBntCancelar.setText("Cancelar");
        jBntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntCancelarActionPerformed(evt);
            }
        });

        jBntBuscar.setText("Buscar");
        jBntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula del Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(jBntBuscar)
                .addGap(23, 23, 23)
                .addComponent(jBntCancelar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBntBuscar)
                    .addComponent(jBntCancelar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void jBntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.txtCedula.setText("");
    }//GEN-LAST:event_jBntCancelarActionPerformed
    
    private void jBntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntBuscarActionPerformed
        // TODO add your handling code here:

        if (txtCedula.getText().trim().isEmpty()==false) {
            if(txtCedula.getText().trim().length()>10||txtCedula.getText().trim().length()<10){
                JOptionPane.showInternalMessageDialog(rootPane, "El campo cedula lleva 10 digitos");
            }else{
                
                try {
                    System.out.println("AAAAAAAA");
                    Persona per =controladorPersona.buscarPersonaCliente(txtCedula.getText().trim());
                    if (per!=null) {
                        Cliente cli = controladorCliente.buscarCliente(per);
                        System.out.println(cli+" sdadasdasadasssssss");
                        if (cli!=null) {
                            char visu = cli.getVisualizacion();
                            if (visu=='A') {

                                //cliente = cli;
                                txtCedula2.setText(cli.getCedula());
                                txtNombre.setText(cli.getNombre());
                                txtApellido.setText(cli.getApellido());
                                txtTelefono.setText(cli.getTelefono());
                                txtDireccion.setText(cli.getDireccion());
                                txtCorreo.setText(cli.getCorreo());
                                this.setVisible(false);
                                this.txtCedula.setText("");

                            }else{
                                cliente = null;
                                JOptionPane.showInternalMessageDialog(rootPane, "El cliente esta desactivado.");
                            }
                        }else{

                            JOptionPane.showInternalMessageDialog(rootPane, "El cliente no existe en la base de datos.");

                        }
                    }else{
                        JOptionPane.showInternalMessageDialog(rootPane, "La persona no existe en la base de datos");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BuscarClienteFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }else{
            JOptionPane.showInternalMessageDialog(rootPane, "Se debe llenar el campo cedula");
        }
    }//GEN-LAST:event_jBntBuscarActionPerformed
    
    
    public Cliente devolverCliente(){
        return cliente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntBuscar;
    private javax.swing.JButton jBntCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
