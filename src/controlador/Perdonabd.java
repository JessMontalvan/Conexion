
package controlador;

import bdconetar.Conectar;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Persona;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Perdonabd {
      
     public boolean registrarPersona(Persona persona) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql = "INSERT INTO `ejerciciobd`.`persona` (`idpersona`, `cedula`, `nombre`, `apellido`, `direccion`, `correo`, `telefono`) VALUES('" + String.valueOf(persona.getIdpersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombre() + "', '" + persona.getApellidos() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "', '" + persona.getTelefono() + "');";
        try {
            //Es una instancia de la conexion previamente creada.
            Conectar conexion = new Conectar();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }

    public boolean actualizar(Persona persona) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `ejerciciobd`.`persona` SET `cedula` = '" + persona.getCedula() + "', `nombres` = '" + persona.getNombre() + "', `apellidos` = '" + persona.getApellidos() + "', `direccion` = '" + persona.getDireccion() + "', `correo` = '" + persona.getCorreo() + "', `telefono` = '" + persona.getTelefono() + "' WHERE (`idpersona` = '" + persona.getIdpersona() + "');";
        try {
            Conectar con = new Conectar();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }

    public boolean eliminar(Persona persona) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `ejerciciobd`.`persona` WHERE (`idpersona` = '" + String.valueOf(persona.getIdpersona()) + "');";
        try {
            connect = new Conectar().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
    
    public List<Persona> obtenerPersonas (){
       
        Connection con = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejerciciobd.persona;";
        List<Persona> listaPersonas = new ArrayList<Persona>();
        try {
            con = new Conectar().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaPersonas;
    }

}
