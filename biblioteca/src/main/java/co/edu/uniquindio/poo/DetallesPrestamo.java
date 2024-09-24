package co.edu.uniquindio.poo;

public class DetallesPrestamo {
    public Libro libro;
    public Estudiante estudiante;
    public Bibliotecario bibliotecario;
    public Prestamo prestamo;

    public DetallesPrestamo(Libro libro, Estudiante estudiante, Bibliotecario bibliotecario, Prestamo prestamo) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.prestamo = prestamo;
    }

    public void mostrarDetallesPrestamo() {
        System.out.println("---Detalles Prestamo---");
        System.out.println("Prestamo:" + prestamo.toString());
        System.out.println("Cantidad de libros:" + prestamo.getCantidadLibros());
        System.out.println("Libro:" + libro.toString());
        System.out.println("Estudiante:" + estudiante.toString());
        System.out.println("Bibliotecario:" + bibliotecario.toString());
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
