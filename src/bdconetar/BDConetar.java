
package bdconetar;

import controlador.Perdonabd;
import java.sql.Connection;
import modelo.Persona;
import vistas.PersonaFormulario;
public class BDConetar {

    public static void main(String[] args) {
        // TODO code application logic here
        Perdonabd perdonabd = new Perdonabd();
        Persona persona = new Persona();
        persona.setIdpersona(1);
        /*persona.setNombre("Jessica");
        persona.setApellidos("");
        persona.setCedula("");
        persona.setDireccion("");
        persona.setCorreo("");
        persona.setTelefono("");*/
        PersonaFormulario personaformulario = new PersonaFormulario();
        
        
    }
    
}
