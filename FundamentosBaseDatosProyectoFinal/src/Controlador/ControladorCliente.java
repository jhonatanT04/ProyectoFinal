/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOCliente;
import Modelo.Personas.Persona.Cliente;
import Modelo.Personas.Persona.Persona;
import java.sql.SQLException;
import javax.swing.JRootPane;
import java.util.List;


/**
 *
 * @author venot
 */
public class ControladorCliente {
    private DAOCliente daoCliente;
    
    public ControladorCliente() {
        daoCliente= new DAOCliente();
    }
    
    
    public boolean crearCliente(Cliente cliente) throws SQLException{
        return daoCliente.insertarCliente(cliente);
    }
    public Cliente buscarCliente(Persona per) throws SQLException{
        return daoCliente.buscarClientePorCedula(per);
    }
    
    public boolean actualizarCliente(Cliente cliente) throws SQLException{
        return daoCliente.modificarCliente( cliente);
    }
    public List<Cliente> buscarPorNombreCliente(List<Persona> persns) throws SQLException{
        return daoCliente.buscarPersonaPorNombre(persns);
    }
    public void eliminarCliente(int codigoCli) throws SQLException{
        daoCliente.eliminarCliente(codigoCli);
    }
    public Cliente buscarClientePorCodigo(int codigoCli) throws SQLException{
        return daoCliente.buscarClientePorCodigo(codigoCli);
    }
}
