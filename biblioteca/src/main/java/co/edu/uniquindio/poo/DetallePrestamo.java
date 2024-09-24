package co.edu.uniquindio.poo;

public class DetallePrestamo {
    public Libro libro;
    public Estudiante estudiante;
    public Bibliotecario bibliotecario;
    public Prestamo prestamo;

    /**
     * Metodo constructor de DetallesPrestamo
     * @param libro
     * @param estudiante
     * @param bibliotecario
     * @param prestamo
     */
    public DetallePrestamo(Libro libro, Estudiante estudiante, Bibliotecario bibliotecario, Prestamo prestamo) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.prestamo = prestamo;
    }

    /**
     * Metodo para mostar los detalles de un prestamo
     */
    public void mostrarDetallePrestamo() {
        System.out.println("---Detalles Prestamo---");
        System.out.println("Prestamo:" + prestamo.toString());
        System.out.println("Cantidad de libros:" + prestamo.getCantidadLibros());
        System.out.println("Libro:" + libro.toString());
        System.out.println("Estudiante:" + estudiante.toString());
        System.out.println("Bibliotecario:" + bibliotecario.toString());
    }

    /**
     * Metodo para obtener el libro de detallesPrestamo
     * @return
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Metodo para cambiar el libro de detallesPrestamo
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Metodo para obtener el estudiante de detallesPrestamo
     * @return
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Metodo para cambiar el estudiante de detallesPrestamo
     * @param estudiante
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Metodo para obtener el bibliotecario de detallesPrestamo
     * @return
     */
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    /**
     * Metodo para cambiar el bibliotecario de detallesPrestamo 
     * @param bibliotecario
     */
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    /**
     * Metodo para obtener el prestamo de detallesPrestamo
     * @return
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * Metodo para cambiar el prestamo de detallesPrestamo
     * @param prestamo
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
