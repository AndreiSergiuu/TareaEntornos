package es.medac;

public class Personas {

    private int id;
    private String nombre;
    private int edad;
    private String profesor;

    public Personas(int id, String nombre, int edad, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
