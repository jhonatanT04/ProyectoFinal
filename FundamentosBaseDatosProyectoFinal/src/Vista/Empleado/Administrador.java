/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Vista.Empleado;

import Controlador.ControladorCategoria;
import Controlador.ControladorCompraPoveedor;
import Controlador.ControladorPorveedor;
import Controlador.ControladorProducto;
import Modelo.Personas.Persona.Empleado;
import Vista.Cliente.NuevoCliente;
import Vista.Cliente.BuscarCliente;
import Vista.Producto.ActualizarProducto;
import Vista.Proovedoores.BuscarCompraProveedores;
import Vista.Proovedoores.ComprarProveedores_1;
import Vista.Proovedoores.EliminarCompraProveedores;
import Vista.Proovedoores.ListarProveedores_1;
import Vista.Cliente.ActualizarDatosClientes;
import Vista.Cliente.EliminarCliente;
import Vista.Cliente.ListarCliente;
import Vista.Empleado.ActualizarEmpleado;

import Vista.Empleado.EliminarEmpelado;
import Vista.Empleado.IngresarEmpleado;
import Vista.Empleado.ListarEmpleado;
import Vista.Facturas.AnularFactura.AnularFacturaFactura;
import Vista.Facturas.Buscar.BuscarFactura;
import Vista.Facturas.Crear.CrearFactura;
import Vista.Producto.AgregarProducto;
import Vista.Producto.BuscarProducto;
import Vista.Producto.EliminarProducto;
import Vista.Producto.ListarProducto;
import Vista.Proovedoores.CrearProveedors_1;
import Vista.Proovedoores.ListarCompraProveedores;





/**
 *
 * @author Usuario
 */
public class Administrador extends javax.swing.JFrame {
    private Empleado empleado = new Empleado(2, 'A', "MoralesAJ", 'A', 22, "0131234331", "Josseline Aracely", "Morales Lituma", "Monay", "0932109876", "gabrielamorales@gmail.com");
    
    
    
    private NuevoCliente ventanaNuevoCliente;
    private BuscarCliente ventanaBuscarCliente;
    private ActualizarDatosClientes veActualizarDatos;
    private EliminarCliente veEliminarCliente;
    private ListarCliente listarCliente;
    private IngresarEmpleado ingresarEmpleado;
    
    private ActualizarEmpleado actualizarEmpleado;
    private EliminarEmpelado eliminarEmpelado;
    private ListarEmpleado listarEmpleado;
    private CrearFactura crearFactura;
    private BuscarFactura buscarFactura;
    private AnularFacturaFactura anularFacturaFactura;
    private AgregarProducto agregarProducto;
    private BuscarProducto buscarProducto;
    private ActualizarProducto actualizarProducto;
    private EliminarProducto eliminarProducto;
    private ListarProducto listarProducto;
    private CrearProveedors_1 crearProveedors_1;
    private ListarProveedores_1 listarProveedores_1;
    private ComprarProveedores_1 comprarProveedores_1;
    private BuscarCompraProveedores buscarCompraProveedores;
    private EliminarCompraProveedores eliminarCompraProveedores;
    private ListarCompraProveedores listarCompraProveedores;
    private ControladorProducto controladorProducto;
    private ControladorCategoria controladorCategoria;
    private ControladorPorveedor controladorProveedor;
    private ControladorCompraPoveedor controladorCompraPoveedor;
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        controladorCategoria = new ControladorCategoria();
        controladorProducto = new ControladorProducto();
        controladorProveedor = new ControladorPorveedor();
        controladorCompraPoveedor = new ControladorCompraPoveedor();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        itemMenuNuevoCliente = new javax.swing.JMenuItem();
        itemMenuBuscarCliente = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Productos");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Ingresar");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Buscar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Actualizar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Eliminar");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuItem7.setText("Listar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem7);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Proveedores");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        jMenuItem15.setText("Ingresar Proveedor");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem15);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Listar Proveedor");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        jMenuItem1.setText("Compra Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuItem2.setText("Buscar Compra Proveedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        jMenuItem14.setText("Eliminar Compra Proveedor");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem14);

        jMenuItem16.setText("Listar Compra Proveedor");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem16);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Clientes");

        itemMenuNuevoCliente.setMnemonic('c');
        itemMenuNuevoCliente.setText("Nuevo Cliente");
        itemMenuNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNuevoClienteActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuNuevoCliente);

        itemMenuBuscarCliente.setMnemonic('a');
        itemMenuBuscarCliente.setText("Buscar Cliente");
        itemMenuBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuBuscarClienteActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuBuscarCliente);

        jMenuItem3.setText("Actualziar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem3);

        jMenuItem4.setText("Eliminar Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem4);

        jMenuItem5.setText("Listar Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem5);

        menuBar.add(helpMenu);

        jMenu1.setText("Empleados");

        jMenuItem6.setText("Crear Empleado");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem8.setText("Actualizar Empleado");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Eliminar Empleado");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Listar Empleado");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        menuBar.add(jMenu1);

        jMenu2.setText("Facturas");

        jMenuItem11.setText("Crear Factura");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Buscar Factura");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Anular Factura");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ingresarEmpleado(Empleado emp){
        empleado = emp;
    }
    
    
    
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        if(eliminarProducto == null){
            eliminarProducto = new EliminarProducto(controladorProducto,controladorCategoria);
            desktopPane.add(eliminarProducto);
        }
        
        eliminarProducto.setVisible(true); 
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        if(agregarProducto == null){
            agregarProducto = new AgregarProducto(controladorProducto,controladorCategoria);
            desktopPane.add(agregarProducto);
        }
        
        agregarProducto.setVisible(true); 
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void itemMenuNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNuevoClienteActionPerformed
        // TODO add your handling code here:
        if(ventanaNuevoCliente == null){
            ventanaNuevoCliente = new NuevoCliente();
            desktopPane.add(ventanaNuevoCliente);
        }
        
        ventanaNuevoCliente.setVisible(true); 
    
    }//GEN-LAST:event_itemMenuNuevoClienteActionPerformed
    
    private void itemMenuBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuBuscarClienteActionPerformed
        // TODO add your handling code here:
        
        if(ventanaBuscarCliente == null){
            ventanaBuscarCliente = new BuscarCliente();
            desktopPane.add(ventanaBuscarCliente);
        }
        
        ventanaBuscarCliente.setVisible(true);
    }//GEN-LAST:event_itemMenuBuscarClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(veActualizarDatos == null){
            veActualizarDatos = new ActualizarDatosClientes();
            desktopPane.add(veActualizarDatos);
        }
        
        veActualizarDatos.setVisible(true); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(veEliminarCliente == null){
            veEliminarCliente = new EliminarCliente();
            desktopPane.add(veEliminarCliente);
        }
        
        veEliminarCliente.setVisible(true); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(listarCliente == null){
            listarCliente = new ListarCliente(desktopPane);
            desktopPane.add(listarCliente);
        }
        
        listarCliente.setVisible(true); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(ingresarEmpleado == null){
            ingresarEmpleado = new IngresarEmpleado();
            desktopPane.add(ingresarEmpleado);
        }
        
        ingresarEmpleado.setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if(actualizarEmpleado == null){
            actualizarEmpleado = new ActualizarEmpleado();
            desktopPane.add(actualizarEmpleado);
        }
        
        actualizarEmpleado.setVisible(true); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(eliminarEmpelado == null){
            eliminarEmpelado = new EliminarEmpelado();
            desktopPane.add(eliminarEmpelado);
        }
        
        eliminarEmpelado.setVisible(true); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if(listarEmpleado == null){
            listarEmpleado = new ListarEmpleado(desktopPane);
            desktopPane.add(listarEmpleado);
        }
        
        listarEmpleado.setVisible(true); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        
        if(crearFactura == null){
            crearFactura = new CrearFactura(controladorProducto,desktopPane,empleado);
            desktopPane.add(crearFactura);
        }
        
        crearFactura.setVisible(true); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if(buscarFactura== null){
            buscarFactura = new BuscarFactura();
            desktopPane.add(buscarFactura);
        }
        
        buscarFactura.setVisible(true); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if(anularFacturaFactura == null){
            anularFacturaFactura = new AnularFacturaFactura();
            desktopPane.add(ventanaNuevoCliente);
        }
        
        anularFacturaFactura.setVisible(true); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        if(buscarProducto == null){
            buscarProducto = new BuscarProducto();
            desktopPane.add(buscarProducto);
        }
        
        buscarProducto.setVisible(true); 
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        if(actualizarProducto == null){
            actualizarProducto = new ActualizarProducto(controladorProducto,controladorCategoria);
            desktopPane.add(actualizarProducto);
        }
        
        actualizarProducto.setVisible(true); 
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(listarProducto == null){
            listarProducto = new ListarProducto(controladorProducto,controladorCategoria,desktopPane);
            desktopPane.add(listarProducto);
        }
        
        listarProducto.setVisible(true); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        if(eliminarCompraProveedores == null){
            eliminarCompraProveedores = new EliminarCompraProveedores(controladorCompraPoveedor,controladorProveedor,controladorProducto);
            desktopPane.add(eliminarCompraProveedores);
        }
        
        eliminarCompraProveedores.setVisible(true); 
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        if(listarProveedores_1 == null){
            listarProveedores_1 = new ListarProveedores_1(controladorProveedor);
            desktopPane.add(listarProveedores_1);
        }
        
        listarProveedores_1.setVisible(true); 
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(comprarProveedores_1 == null){
            comprarProveedores_1 = new ComprarProveedores_1(controladorCompraPoveedor, controladorProveedor, controladorProducto);
            desktopPane.add(comprarProveedores_1); 
        }
        
        comprarProveedores_1.setVisible(true); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(buscarCompraProveedores == null){
            buscarCompraProveedores = new BuscarCompraProveedores(controladorCompraPoveedor, controladorProveedor, controladorProducto);
            desktopPane.add(buscarCompraProveedores); 
        }
        
        buscarCompraProveedores.setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        
    }//GEN-LAST:event_editMenuActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if(listarCompraProveedores == null){
            listarCompraProveedores = new ListarCompraProveedores(controladorCompraPoveedor, controladorProveedor,desktopPane);
            desktopPane.add(listarCompraProveedores);
        }
        
        
        listarCompraProveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        if(crearProveedors_1 == null){
            crearProveedors_1 = new CrearProveedors_1(controladorProveedor);
            desktopPane.add(crearProveedors_1);
        }
        
        crearProveedors_1.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemMenuBuscarCliente;
    private javax.swing.JMenuItem itemMenuNuevoCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
