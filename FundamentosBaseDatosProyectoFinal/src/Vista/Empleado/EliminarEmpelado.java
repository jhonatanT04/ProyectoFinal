/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Empleado;

import Controlador.ControladorEmpleado;
import Controlador.ControladorPersona;
import DAO.DAOCabeceraFactura;
import Modelo.Personas.Persona.Empleado;
import Modelo.Personas.Persona.Persona;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EliminarEmpelado extends javax.swing.JInternalFrame {
    private ControladorPersona controladorPersona;
    private ControladorEmpleado controladorEmpleado;
    private DAOCabeceraFactura daoCabeceraFactura;
    /**
     * Creates new form EliminarEmpelado
     */
    public EliminarEmpelado() {
        initComponents();
        controladorEmpleado = new ControladorEmpleado();
        controladorPersona = new ControladorPersona();
        daoCabeceraFactura = new DAOCabeceraFactura();
        buttonGroupSeleccion.add(jRadioButtonAdministrador);
        buttonGroupSeleccion.add(jRadioButtonGeneral);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSeleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonGeneral = new javax.swing.JRadioButton();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jRadioButtonAdministrador = new javax.swing.JRadioButton();
        txtCedula = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jRadioButtonGeneral.setText("General");

        txtDireccion.setEditable(false);

        txtCorreo.setEditable(false);

        jLabel7.setText("Nombres:");

        jLabel12.setText("Cedula:");

        jLabel8.setText("Apellidos:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Direccion:");

        jLabel10.setText("Telefono:");

        jLabel11.setText("Correo Electronico:");

        jLabel1.setText("Contraseña:");

        txtNombre.setEditable(false);

        txtContrasenia.setEditable(false);

        txtTelefono.setEditable(false);

        jLabel13.setText("Permisos:");

        txtApellido.setEditable(false);

        jRadioButtonAdministrador.setText("Administrativo");
        jRadioButtonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdministradorActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(69, 69, 69)
                                .addComponent(jRadioButtonAdministrador)
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButtonGeneral)))
                        .addGap(207, 303, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(119, 119, 119)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel12))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addGap(12, 12, 12))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jRadioButtonAdministrador)
                            .addComponent(jRadioButtonGeneral)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnEliminar))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtCedula.getText().trim().isEmpty()==false) {
            if(txtCedula.getText().trim().length()>10||txtCedula.getText().trim().length()<10){
                JOptionPane.showInternalMessageDialog(rootPane, "El campo cedula lleva 10 digitos");
            }else{

                try {
                    Persona per =controladorPersona.buscarPersonaCliente(txtCedula.getText().trim());
                    if (per!=null) {
                        Empleado emp = controladorEmpleado.buscarEmpleado(per);
                        if (emp!=null) {
                            if (emp.getVisualizacion()=='A') {
                                txtApellido.setText(emp.getApellido());
                                txtNombre.setText(emp.getNombre());
                                txtCorreo.setText(emp.getCorreo());
                                txtDireccion.setText(emp.getDireccion());
                                txtTelefono.setText(emp.getTelefono());
                                txtContrasenia.setText(emp.getContrasenia());
                                if (emp.getPermiso()=='A') {
                                    jRadioButtonAdministrador.setSelected(true);
                                }else{
                                    jRadioButtonGeneral.setSelected(true);
                                }
                                
                                //empleado = emp;
                                //primeraCedula =txtCedula.getText().trim();
                                habilitarCampos(true);
                                //System.out.println("Primera cedula "+ primeraCedula);

                            }else{
                                //habilitarCampos(false);
                                //JOptionPane.showInternalMessageDialog(rootPane, "El cliente esta desactivado.");
                                JOptionPane.showInternalMessageDialog(rootPane, "El empleado con numero de cedula "+per.getCedula()+" se encuentra desactivado.");
                                

                            }
                        }else{
                            //habilitarCampos(false);
                            JOptionPane.showInternalMessageDialog(rootPane, "El empleado no existe en la base de datos.");

                        }
                    }else{
                        //habilitarCampos(false);
                        JOptionPane.showInternalMessageDialog(rootPane, "La persona no existe en la base de datos");
                    }
                } catch (SQLException ex) {
                    //Logger.getLogger(ActualizarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Error "+ ex);
                }

            }
        }else{
            JOptionPane.showInternalMessageDialog(rootPane, "Se debe llenar el campo cedula");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jRadioButtonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdministradorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.habilitarCampos(false);
        this.limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (validarCampos()) {
            try {
                Persona per =controladorPersona.buscarPersonaCliente(txtCedula.getText().trim());
                boolean val= daoCabeceraFactura.buscarEmpleado(per.getCodigo());
                Empleado emp = controladorEmpleado.buscarEmpleado(per);
                if (val) {
                    int opc = JOptionPane.showInternalConfirmDialog(rootPane, "Esta seguro que quiere eliminar el empleado.");
                    if (opc==0) {
                        controladorEmpleado.eliminarEmpleado(emp.getEmpleadoCodigo());
                        controladorPersona.eliminarPersona(per.getCodigo());
                        habilitarCampos(false);
                        this.limpiarCampos();
                    }
                }else{
                    int opc = JOptionPane.showInternalConfirmDialog(rootPane, "Esta seguro que quiere eliminar el empleado.");
                    if (opc==0) {
                        
                        emp.setVisualizacion('C');
                        controladorEmpleado.actualizarEmpleado(emp);
                        JOptionPane.showInternalMessageDialog(rootPane, "El empleado se ha eliminado exitosamente.");
                        habilitarCampos(false);
                        this.limpiarCampos();
                    }
                    
                }

            } catch (SQLException ex) {
                //Logger.getLogger(actualizarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showInternalMessageDialog(rootPane, "ERROR " + ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private boolean validarCampos() {
        if (txtApellido.getText().trim().isEmpty()||txtNombre.getText().trim().isEmpty()||txtDireccion.getText().trim().isEmpty()||txtTelefono.getText().trim().isEmpty()||txtCorreo.getText().trim().isEmpty()) {
            JOptionPane.showInternalMessageDialog(rootPane, "Se deben llenar Todos los campos");
            return false;
        }else if ((txtApellido.getText().trim().length()>100)||txtNombre.getText().trim().length()>100||txtDireccion.getText().trim().length()>100||txtCorreo.getText().trim().length()>100){
            JOptionPane.showInternalMessageDialog(rootPane, "Los campos deben de llenarse con menos de 100 caracteres");
            return false;
        }else if (txtTelefono.getText().trim().length()>10||txtTelefono.getText().trim().length()<10){
            JOptionPane.showInternalMessageDialog(rootPane, "El campo de Telefono de deve tener 10 numeros ");
            //System.out.println(txtDireccion.getText().trim().length());
            return false;
        }else if (txtCedula.getText().trim().length() >10||txtCedula.getText().trim().length()<10){
            JOptionPane.showInternalMessageDialog(rootPane, "El campo de Cedula se deve tener 10 numeros ");
            return false;
        }
        else{
            return true;
        }
    }
    
    private void habilitarCampos(boolean opc){
        this.btnEliminar.setEnabled(opc);
        this.btnBuscar.setEnabled(!opc);
        this.txtCedula.setEditable(!opc);
    }
    public void limpiarCampos(){
        txtCedula.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtContrasenia.setText("");
        
        buttonGroupSeleccion.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroupSeleccion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAdministrador;
    private javax.swing.JRadioButton jRadioButtonGeneral;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
