package co.edu.uniquindio.poo;

public class Libro {
    public String nombre;
    public String codigo;
    public String isbn;
    public String autor;
    public String editorial;
    public String fecha;
    public int unidadesDisponibles;
    public Estado estado;

    public Libro(String nombre, String codigo, String isbn, String autor, String editorial, String fecha,
            int unidadesDisponibles) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public void cambiarEstado() {
        if (unidadesDisponibles != 0) {
            this.estado = Estado.DISPONIBLE;
        } else {
            this.estado = Estado.AGOTADO;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", editorial="
                + editorial + ", fecha=" + fecha + ", unidadesDisponibles=" + unidadesDisponibles + ", estado=" + estado
                + "]";
    }

}
