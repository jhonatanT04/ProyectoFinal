/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Facturas.ActualizarFactura;

import Controlador.ControladorCabeceraFactura;
import Controlador.ControladorEmpleado;
import Controlador.ControladorPersona;
import Modelo.Factura.CabeceraFactura;
import Modelo.Personas.Persona.Empleado;
import java.sql.SQLException;
import Modelo.Personas.Persona.Persona;
import Vista.Proovedoores.BuscarProveedorNombre;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class BuscarFacturaEmpleado extends javax.swing.JInternalFrame {

    private ControladorCabeceraFactura controladorCabeceraFactura;
    private CabeceraFactura cabeceraFactura;
    private JTable jTable;
    private ListaDeFacturasPorOpcion listaDeFacturasPorOpcion;

    /**
     * Creates new form BuscarFacturaEmpleado
     */
    public BuscarFacturaEmpleado(ControladorCabeceraFactura controladorCabeceraFactura, ListaDeFacturasPorOpcion listaDeFacturasPorOpcion, JTable jTable) {
        initComponents();
        this.controladorCabeceraFactura = controladorCabeceraFactura;
        this.listaDeFacturasPorOpcion = listaDeFacturasPorOpcion;
        this.jTable = jTable;
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
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jLabel1.setText("Ingrese la cedula del empleado:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnBuscar)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnBuscar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String nombre = txtNombre.getText().trim();

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese el nombre del empleado a buscar.");
                return;
            }

            DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
            modelo.setRowCount(0);

            // Obtener el empleado
            ControladorPersona cp = new ControladorPersona();
            ControladorEmpleado ce = new ControladorEmpleado();
            Persona persona = cp.buscarPersonaEmpleado(nombre);

            if (persona == null) {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna persona con el nombre ingresado.");
                return;
            }

            int codigoEmpleado = ce.buscarEmpleado(persona).getEmpleadoCodigo();
            List<CabeceraFactura> cabeceraFacturas = controladorCabeceraFactura.buscarPorEmpleado(codigoEmpleado); 

            if (cabeceraFacturas != null && !cabeceraFacturas.isEmpty()) {
                for (CabeceraFactura cabecera : cabeceraFacturas) {
                    Object[] rowData = {
                        cabecera.getCodigo(),
                        cabecera.getFecha(),
                        cabecera.getSubTotal(),
                        cabecera.getTotalIVA(),
                        cabecera.getValorTotal(),
                        cabecera.getEstado(),
                        cabecera.getCodigoCliente()
                    };
                    modelo.addRow(rowData);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron facturas para el empleado con el nombre ingresado.");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BuscarProveedorNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
