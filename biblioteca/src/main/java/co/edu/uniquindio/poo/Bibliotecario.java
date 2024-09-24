package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Bibliotecario extends Persona {
    public String correo;
    public int salario;
    public int añosAntiguedad;
    public LinkedList<Prestamo> prestamosRealizados = new LinkedList<>();

    /**
     * Metodo constructor de Bibliotecario
     * 
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     * @param añosAntiguedad
     */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario,
            int añosAntiguedad) {
        super(nombre, cedula, telefono);
        this.correo = correo;
        this.salario = salario;
        this.añosAntiguedad = añosAntiguedad;
    }

    /**
     * Metodo para agregar prestamos al bibliotecario
     * 
     * @param prestamo
     */
    public void agregarPrestamoBibliotecario(Prestamo prestamo) {
        prestamosRealizados.add(prestamo);
    }

    /**
     * Metodo para obtener la cantidad de libros prestamos por el bibliotecario
     * 
     * @return
     */
    public int librosPrestadosBibliotecario() {
        int total = 0;
        for (Prestamo prestamo : prestamosRealizados) {
            total += prestamo.getCantidadLibros();
        }
        return total;
    }

    /**
     * Metodo para obtener el salario del bibliotecario
     * 
     * @return
     */
    public int getSalario() {
        return salario;
    }

    /**
     * Metodo para cambiar el salario del bibliotecario
     * 
     * @param salario
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * Metodo para obtener los anios de antiguedad del bibliotecario
     * 
     * @return
     */
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    /**
     * Metodo para cambiar los anios de antiguedad del bibliotecario
     * 
     * @param añosAntiguedad
     */
    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    /**
     * Metodo para obtener el correo del bibliotecario
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para cambiar el correo del bibliotecario
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}