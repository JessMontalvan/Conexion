
package bdconetar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {
    //Usuario de workbeanch
    private final String user="root";
    //contraseña de Workbeanch
    private final String password="jssnoe02";
    private final String url="jdbc:mysql://Localhost:3306/bdconexion? useUnicode=true&use"
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetmeCode=false&serverTimezone=UTC";
    
    public Connection con(){
        Connection conectar = null;
        
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url,user,password);
            //Mensaje que demuestra que se reaizó la conexion
            JOptionPane.showMessageDialog(null, "Conexion Establecida Exitosamente");
            } catch (ClassNotFoundException error){
                //Mensaje en caso de que no se realice la conexion, ademas nos dice el error
                JOptionPane.showMessageDialog(null, "Error al Conectar con la Base de Datos "+error);
            }catch (SQLException error){
                
            }return conectar;
    }
    
}
