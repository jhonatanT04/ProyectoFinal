/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Facturas.ActualizarFactura;

import Controlador.ControladorCabeceraFactura;
import Controlador.ControladorDetalleFactura;
import Controlador.ControladorProducto;
import Modelo.Factura.CabeceraFactura;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author venot
 */
public class ListaDeFacturasPorOpcion extends javax.swing.JInternalFrame {

    private BuscarFacturaCliente buscarFacturaCliente;
    private BuscarFacturaEmpleado buscarFacturaEmpleado;
    private ControladorCabeceraFactura controladorCabeceraFactura;
    private ControladorDetalleFactura controladorDetalleFactura;
    private ControladorProducto controladorProducto;
    private javax.swing.JDesktopPane desktopPane;
    
    /**
     * Creates new form ListaDeFacturasPorOpcion
     */
    public ListaDeFacturasPorOpcion(ControladorCabeceraFactura controladorCabeceraFactura,ControladorDetalleFactura controladorDetalleFactura,ControladorProducto controladorProducto,javax.swing.JDesktopPane desktopPane) {
        initComponents();
        this.controladorCabeceraFactura = controladorCabeceraFactura;
        this.controladorDetalleFactura = controladorDetalleFactura;
        this.controladorProducto = controladorProducto;
        this.desktopPane = desktopPane;
        
        jTable1.setRowSelectionAllowed(true);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        radioCliente = new javax.swing.JRadioButton();
        radioEmpleado = new javax.swing.JRadioButton();
        radioListar = new javax.swing.JRadioButton();

        jLabel1.setText("Lista por      :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cliente", "Empleado", "Sub total", "IVA", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Mostrar Detalles ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        radioCliente.setText("Cliente");

        radioEmpleado.setText("Empleado");

        radioListar.setText("Listar Todo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(radioCliente)
                        .addGap(40, 40, 40)
                        .addComponent(radioEmpleado)
                        .addGap(37, 37, 37)
                        .addComponent(radioListar)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(radioCliente)
                    .addComponent(radioEmpleado)
                    .addComponent(radioListar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (radioListar.isSelected()) {
            actualizarTabla();
        }else if (radioEmpleado.isSelected()) {
            desplegarEmpleado();
        }else if (radioCliente.isSelected()) {
            desplegarCliente();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void desplegarEmpleado(){
        if (buscarFacturaEmpleado == null) {
            buscarFacturaEmpleado = new BuscarFacturaEmpleado(controladorCabeceraFactura, this, jTable1);
            desktopPane.add(buscarFacturaEmpleado);
        }
        buscarFacturaEmpleado.setVisible(true);
    }
    
    private void desplegarCliente(){
        if (buscarFacturaCliente == null) {
            buscarFacturaCliente = new BuscarFacturaCliente(controladorCabeceraFactura, this, jTable1);
            desktopPane.add(buscarFacturaCliente);
        }
        buscarFacturaCliente.setVisible(true);
    }
    
    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 
        List<CabeceraFactura> listaCabeceras = controladorCabeceraFactura.listar();

        // Agregar cada cabecera de factura a la tabla
        for (CabeceraFactura cabecera : listaCabeceras) {
            int codigo = cabecera.getCodigo();
            Timestamp fecha = cabecera.getFecha();
            double subtotal = cabecera.getSubTotal();
            double totalIVA = cabecera.getTotalIVA();
            double valorTotal = cabecera.getValorTotal();
            char estado = cabecera.getEstado();
            int codigoEmpleado = cabecera.getCodigoEmpleado();
            int codigoCliente = cabecera.getCodigoCliente();
            

            Object[] rowData = {codigo, fecha, subtotal, totalIVA, valorTotal, estado, codigoEmpleado, codigoCliente};
            
            modelo.addRow(rowData);
        }
        
        jTable1.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioCliente;
    private javax.swing.JRadioButton radioEmpleado;
    private javax.swing.JRadioButton radioListar;
    // End of variables declaration//GEN-END:variables
}
