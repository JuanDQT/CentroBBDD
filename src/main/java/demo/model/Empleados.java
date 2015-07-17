package demo.model;

import javax.persistence.*;

/**
 * Created by Juan Daniel on 19/06/2015.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String  nombre;

    @Column
    private String apellido;

    public Empleados() {
    }

    public Empleados(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleados empleados = (Empleados) o;

        if (id != null ? !id.equals(empleados.id) : empleados.id != null) return false;
        if (nombre != null ? !nombre.equals(empleados.nombre) : empleados.nombre != null) return false;
        return !(apellido != null ? !apellido.equals(empleados.apellido) : empleados.apellido != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
