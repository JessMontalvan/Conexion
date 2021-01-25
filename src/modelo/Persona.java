
package modelo;

public class Persona {
    
    private int idpersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String correo;
    private String telefono;

    public Persona(int idpersona, String nombre, String apellido, String cedula, String direccion, String correo, String telefono) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

 public Persona() {
    }

    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idpersona + ", cedula=" + cedula + ", nombres=" + nombre + ", apellidos=" + apellido + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
