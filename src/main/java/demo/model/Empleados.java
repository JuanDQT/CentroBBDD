package demo.model;

import javax.persistence.*;

/**
 * Created by Juan Daniel on 19/06/2015.
 */

@Entity
@Table(name="EMPLEADOS")
@Inheritance(strategy = InheritanceType.JOINED)
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cod_emp")
    protected Long codEmp;

    @Column
    private String  nombre;

    @Column
    private String apellido;

    public Empleados() {
    }

    public Empleados(Long codEmp, String nombre, String apellido) {
        this.codEmp = codEmp;
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

        if (codEmp != null ? !codEmp.equals(empleados.codEmp) : empleados.codEmp != null) return false;
        if (nombre != null ? !nombre.equals(empleados.nombre) : empleados.nombre != null) return false;
        return !(apellido != null ? !apellido.equals(empleados.apellido) : empleados.apellido != null);

    }

    @Override
    public int hashCode() {
        int result = codEmp != null ? codEmp.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "codEmp=" + codEmp +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
