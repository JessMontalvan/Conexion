
package controlador;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Persona;
import bdconetar.Conectar;


public class Perdonabd {
    
    public boolean crearPersona(Persona persona) {
        boolean registrar = false;
        
        Connection con = null;
       

        String sql = "INSERT INTO persona (idpersona, cedula, nombres, apellidos, direccion, correo, telefono) VALUES('" + String.valueOf(persona.getIdpersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombre() + "', '" + persona.getApellidos() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "','" + persona.getTelefono() + "')";
        try {
            Conectar conexion = new Conectar();
            Connection bas = conexion.con();
            
            registrar = true;
            
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            e.printStackTrace();
        }
        return registrar;
    }
    
   public boolean actualizarPersona(Persona persona) {
        boolean registrar = false;

        
        Connection conectar = null;
        

        String sql = "UPDATE persona SET cedula = '" + persona.getCedula() + "', nombres = '" + persona.getNombre() + "',apellidos = '" + persona.getApellidos() + "', direccion= '" + persona.getDireccion() + "', correo = '" + persona.getCorreo() + "', telefono = '" + persona.getTelefono() + "'WHERE idpersona =" +String.valueOf(persona.getIdpersona());
        try {
            Conectar conexion = new Conectar();
            Connection bas = conexion.con();
            
            registrar = true;
            
            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            e.printStackTrace();
        }
        return registrar;
    }
        public boolean eliminarPersona(Persona persona) {
        boolean registrar = false;

        Connection conectar = null;
        

        String sql = "DELETE FROM persona WHERE idpersona="+ String.valueOf(persona.getIdpersona());
        try {
            Conectar conexion = new Conectar();
            Connection bas = conexion.con();
            
            registrar = true;
            
            conectar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            e.printStackTrace();
        }
        return registrar;
    }

}
