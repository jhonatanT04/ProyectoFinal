/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Personas.Persona.Cliente;
import Modelo.Personas.Persona.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author venot
 */
public class DAOCliente {
    private DAOPersona daoPersona= new DAOPersona();
    public boolean insertarCliente(Cliente cliente) throws SQLException {
        Conexion conexion = new Conexion();
        Connection conn = conexion.conectar();
        //String insertPersonaSQL = "INSERT INTO super_personas (per_codigo, per_cedula, per_nombre, per_apellido, per_direccion, per_telefono, per_correo_electronico) VALUES (seq_super_personas.NEXTVAL, ?, ?, ?, ?, ?, ?)";
        String insertClienteSQL = "INSERT INTO super_clientes (cli_codigo, cli_visualizar, super_personas_per_codigo) VALUES (seq_super_clientes.NEXTVAL, ?, seq_super_personas.CURRVAL)";
        daoPersona = new DAOPersona();
        if (daoPersona.validarSiexistePersona(cliente.getCedula())) {
            
        }
        try (PreparedStatement psCliente = conn.prepareStatement(insertClienteSQL)) {
            daoPersona.insertarPersona(cliente);
            psCliente.setString(1, String.valueOf(cliente.getVisualizacion()));
            psCliente.executeUpdate();
            return true;
        }
    }
    
    
    
    public Cliente buscarClientePorCedula( String cedula) throws SQLException {        
        daoPersona = new DAOPersona();
        Persona per = daoPersona.buscarPersona(cedula);
        if (per != null) {
            String clienteSQL = "SELECT cli_codigo, cli_visualizar FROM super_clientes WHERE super_personas_per_codigo = ?";
            Conexion conexion = new Conexion();
            Connection conn = conexion.conectar();
            try (PreparedStatement psCliente = conn.prepareStatement(clienteSQL)) {
                psCliente.setInt(1, per.getCodigo());
                ResultSet rsCliente = psCliente.executeQuery();
                if (rsCliente.next()) {
                    int cliCodigo = rsCliente.getInt("cli_codigo");
                    String visualizar = rsCliente.getString("cli_visualizar");
                    System.out.println("Cliente encontrado:");
                    System.out.println("Código de cliente: " + cliCodigo);
                    System.out.println("Visualizar: " + visualizar);
                    return new Cliente(cliCodigo,visualizar.charAt(0) , per.getCodigo(), per.getCedula(),per.getNombre(),per.getApellido() ,per.getDireccion(),per.getTelefono(), per.getCorreo());
                } else {
                    System.out.println("Cliente no encontrado para la cédula: " + cedula);
                    return null;
                }
            }
        }else{
            return null;
        }
        
    }
    
    
    
}
