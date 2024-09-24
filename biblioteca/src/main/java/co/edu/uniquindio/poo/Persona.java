package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String cedula;
    public String telefono;

    /**
     * Metodo constructor de persona
     * @param nombre
     * @param cedula
     * @param telefono
     */
    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener el nombre de la persona
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre de la persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la cedula de la persona
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para cambiar la cedula de la persona
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el telefono de la persona
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para cambiar el telefono de la persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
