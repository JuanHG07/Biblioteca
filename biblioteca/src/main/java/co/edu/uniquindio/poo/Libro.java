package co.edu.uniquindio.poo;

public class Libro {
    public String codigo;
    public String isbn;
    public String nombre;
    public String autor;
    public String editorial;
    public String fecha;
    public int unidadesDisponibles;
    public Estado estado;

    /**
     * Metodo constructor de libro
     * @param nombre
     * @param codigo
     * @param isbn
     * @param autor
     * @param editorial
     * @param fecha
     * @param unidadesDisponibles
     */
    public Libro(String nombre, String codigo, String isbn, String autor, String editorial, String fecha,
            int unidadesDisponibles) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /**
     * Metodo para cambiar el estado de disponibilidad del libro
     */
    public void cambiarEstado() {
        if (unidadesDisponibles != 0) {
            this.estado = Estado.DISPONIBLE;
        } else {
            this.estado = Estado.AGOTADO;
        }
    }

    /**
     * Metodo para obtener el codigo del libro
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para cambiar el codigo del libro
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el Isbn del libro
     * @return
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Metodo para cambiar el Isbn del libro
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Metodo para obtener el autor del libro
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Metodo para cambiar el autor del libro
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo para obtener la editorial del libro
     * @return
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Metodo para cambiar la editorial del libro
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Metodo para obtener la fecha del libro
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo para cambiar la fecha del libro
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo para obtener la cantidad de unidades disponibles del libro
     * @return
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    /**
     * Metodo para cambiar la cantidad de unidades disponibles del libro
     * @param unidadesDisponibles
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /**
     * Metodo para obtener el nombre del libro
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre del libro
     * @param nombre
     */
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
