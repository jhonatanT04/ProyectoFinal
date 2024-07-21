/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Facturas.Crear;

import Controlador.ControladorDetalleFactura;
import Controlador.ControladorProducto;
import Modelo.Factura.DetalleFactura;
import Modelo.Personas.Persona.Cliente;
import Modelo.Personas.Persona.Empleado;
import Modelo.Producto.Producto;
import Vista.Cliente.BuscarCliente;
import Vista.Facturas.BuscarClienteFactura;
import Vista.Proovedoores.ComprarProveedores_1;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author venot
 */
public class CrearFactura extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Cliente clienteFactura;
    private Empleado empleado;
    private BuscarClienteFactura buscarCliente;
    private javax.swing.JDesktopPane desktopPane;
    private ControladorDetalleFactura controladorDetalleFactura;
    private DetalleFactura detalleFactura;

    /**
     * Creates new form CrearFactura
     */
    public CrearFactura(ControladorProducto controladorProducto, javax.swing.JDesktopPane p, Empleado emp, ControladorDetalleFactura controladorDetalleFactura) {
        initComponents();
        this.controladorProducto = controladorProducto;
        this.controladorDetalleFactura = controladorDetalleFactura;
        desktopPane = p;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());
        txtFecha.setText(currentDate);
        empleado = emp;
        txtNombreEmpleado.setText(emp.getNombre() + " " + emp.getApellido());
        txtIVA.setText(String.valueOf(12.0));
        limpiarTabla();
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

        buttonGroupCorreo = new javax.swing.ButtonGroup();
        txtNombreEmpleado = new javax.swing.JTextField();
        btnAgregarProductos = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFacturar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        txtNombreEmpleado.setEditable(false);
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        btnAgregarProductos.setText("Agregar Producto");
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jLabel15.setText("Nombres:");

        txtCorreo.setEditable(false);

        jLabel16.setText("Cedula de cliente:");

        jLabel6.setText("Valor Total Iva");

        txtFecha.setEditable(false);

        jLabel18.setText("Realizada por :");

        txtTelefono.setEditable(false);

        txtIVA.setEditable(false);
        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha:");

        txtCedula.setEditable(false);

        jLabel22.setText("Apellidos:");

        jLabel7.setText("Valor total Factura:");

        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        jLabel19.setText("Buscar cliente :");

        txtSubtotal.setEditable(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel20.setText("Direccion:");

        jLabel21.setText("Correo Electronico:");

        txtDireccion.setEditable(false);

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);

        jLabel5.setText("Subtotal:");

        jLabel23.setText("Telefono:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Subtotal", "Valor IVA", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enviar Correo :");

        jRadioButton1.setText("Si");

        jRadioButton2.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel19))
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(bntBuscar)
                                                    .addGap(80, 80, 80)
                                                    .addComponent(jLabel18))
                                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(309, 309, 309)
                                        .addComponent(jLabel20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(20, 20, 20)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarProducto)
                        .addComponent(btnAgregarProductos, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel1))))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel22)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntBuscar)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFacturar)
                            .addComponent(jButton5))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        // Obtén el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Recorre las filas de la tabla para obtener los datos
        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                String nombreProducto = (String) model.getValueAt(i, 0); // Nombre del producto
                int cantidad = (int) model.getValueAt(i, 1); // Cantidad
                double precioUnitario = (double) model.getValueAt(i, 2); // Precio sin IVA
                double subtotal = (double) model.getValueAt(i, 3); // Subtotal
                double iva = (double) model.getValueAt(i, 4); // IVA
                double total = (double) model.getValueAt(i, 5); // Total

                // Busca el código del producto basado en el nombre
                int codigop = controladorProducto.buscarProducto(nombreProducto).getCodigo();

                // Crea un nuevo objeto DetalleFactura con los datos de la fila
                detalleFactura = new DetalleFactura(i, cantidad, precioUnitario, subtotal, iva, total, 2, codigop);

                // Inserta el detalle de la factura usando el controlador
                controladorDetalleFactura.ingresardetalle(detalleFactura);

            } catch (SQLException ex) {
                Logger.getLogger(CrearFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Mensaje de éxito después de procesar todos los detalles
        JOptionPane.showMessageDialog(this, "Factura creada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
        String nombreProducto = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto:", "Buscar Producto", JOptionPane.PLAIN_MESSAGE);

        if (nombreProducto != null && !nombreProducto.trim().isEmpty()) {
            try {
                List<Producto> productosEncontrados = controladorProducto.buscarProductoMismoNombre(nombreProducto);

                if (productosEncontrados != null && !productosEncontrados.isEmpty()) {
                    if (productosEncontrados.size() == 1) {
                        Producto productoEncontrado = productosEncontrados.get(0);
                        int cantidadDeseada = obtenerCantidadDeseada(productoEncontrado);

                        // Verifica si la cantidad deseada es válida y hay suficiente stock
                        while (cantidadDeseada > productoEncontrado.getStock()) {
                            JOptionPane.showMessageDialog(this, "No hay suficiente stock para el producto: " + nombreProducto, "Error", JOptionPane.ERROR_MESSAGE);
                            cantidadDeseada = obtenerCantidadDeseada(productoEncontrado);
                        }

                        if (cantidadDeseada > 0) {
                            agregarProductoATabla(productoEncontrado, cantidadDeseada);
                            actualizarTotales();
                        }
                    } else {
                        JFrame frameSeleccion = new JFrame("Seleccionar Producto");
                        frameSeleccion.setSize(500, 400);
                        frameSeleccion.setLocationRelativeTo(this);

                        DefaultTableModel model = new DefaultTableModel();
                        model.addColumn("Nombre");
                        model.addColumn("Precio");
                        model.addColumn("IVA");
                        model.addColumn("Stock");

                        for (Producto producto : productosEncontrados) {
                            model.addRow(new Object[]{
                                producto.getNombre(),
                                producto.getPrecio(),
                                producto.getIva(),
                                producto.getStock()
                            });
                        }

                        JTable table = new JTable(model);
                        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                        JButton btnSeleccionar = new JButton("Seleccionar");
                        btnSeleccionar.addActionListener(e -> {
                            int selectedRow = table.getSelectedRow();
                            if (selectedRow >= 0) {
                                Producto productoSeleccionado = productosEncontrados.get(selectedRow);
                                int cantidadDeseada = obtenerCantidadDeseada(productoSeleccionado);

                                // Verifica si la cantidad deseada es válida y hay suficiente stock
                                while (cantidadDeseada > productoSeleccionado.getStock()) {
                                    JOptionPane.showMessageDialog(frameSeleccion, "No hay suficiente stock para el producto seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                                    cantidadDeseada = obtenerCantidadDeseada(productoSeleccionado);
                                }

                                if (cantidadDeseada > 0) {
                                    agregarProductoATabla(productoSeleccionado, cantidadDeseada);
                                    frameSeleccion.dispose();
                                    actualizarTotales();
                                }
                            } else {
                                JOptionPane.showMessageDialog(frameSeleccion, "Debe seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        });

                        frameSeleccion.setLayout(new BorderLayout());
                        frameSeleccion.add(new JScrollPane(table), BorderLayout.CENTER);
                        frameSeleccion.add(btnSeleccionar, BorderLayout.SOUTH);

                        frameSeleccion.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró el producto con el nombre: " + nombreProducto, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearFactura.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Error al buscar el producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del producto no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        desplegarCedula();

    }//GEN-LAST:event_bntBuscarActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed

    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed

    }//GEN-LAST:event_txtIVAActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Obtén la fila seleccionada
        int selectedRow = jTable1.getSelectedRow();

        // Verifica si se ha seleccionado una fila
        if (selectedRow >= 0) {
            // Confirmar la eliminación del producto
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Estás seguro de que deseas eliminar este producto?",
                    "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Actualiza el stock del producto
                    String nombreProducto = (String) model.getValueAt(selectedRow, 0); // Nombre del producto
                    int cantidad = (int) model.getValueAt(selectedRow, 1); // Cantidad del producto

                    // Busca el producto en la lista original (o en el controlador si se guarda allí)
                    Producto producto = controladorProducto.buscarProducto(nombreProducto);
                    if (producto != null) {
                        // Devuelve la cantidad eliminada al stock
                        producto.setStock(producto.getStock() + cantidad);
                    }

                    // Elimina la fila seleccionada
                    model.removeRow(selectedRow);

                    // Actualiza los totales
                    actualizarTotales();

                    JOptionPane.showMessageDialog(this, "Producto eliminado de la tabla.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(CrearFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private int obtenerCantidadDeseada(Producto producto) {
        String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la cantidad deseada para el producto: " + producto.getNombre(), "Cantidad", JOptionPane.PLAIN_MESSAGE);
        try {
            int cantidad = Integer.parseInt(cantidadStr.trim());
            if (cantidad > 0) {
                return cantidad;
            } else {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida. Debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    private void agregarProductoATabla(Producto producto, int cantidad) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        double precioSinIVA = producto.getPrecio();
        double subtotal = precioSinIVA * cantidad;
        double iva = subtotal * (producto.getIva() / 100.0);
        double total = subtotal + iva;

        model.addRow(new Object[]{
            producto.getNombre(),
            cantidad,
            precioSinIVA,
            subtotal,
            iva,
            total
        });

        producto.setStock(producto.getStock() - cantidad);

        JOptionPane.showMessageDialog(this, "Producto agregado a la tabla.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void actualizarTotales() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        double subtotalTotal = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            subtotalTotal += (double) model.getValueAt(i, 5); // Columna de Total
        }

        double totalGeneral = subtotalTotal + (subtotalTotal * 0.12);
        txtSubtotal.setText(String.format("%.2f", subtotalTotal));
        txtTotal.setText(String.format("%.2f", totalGeneral));
    }

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    private void desplegarCedula() {
        if (buscarCliente == null) {
            buscarCliente = new BuscarClienteFactura(clienteFactura, txtNombre, txtApellido, txtCedula, txtCorreo, txtDireccion, txtTelefono);
            desktopPane.add(buscarCliente);
        }

        buscarCliente.setVisible(true);
        clienteFactura = buscarCliente.devolverCliente();
    }

    public void limpiarCampos() {
        txtCedula.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnFacturar;
    private javax.swing.ButtonGroup buttonGroupCorreo;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
