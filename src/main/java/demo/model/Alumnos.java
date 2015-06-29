package demo.model;

import javax.persistence.*;

/**
 * Created by Juan Daniel on 19/06/2015.
 */

@Entity
@Table(name="ALUMNOS")
public class Alumnos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="alum_cod")
    private Long alumCod;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    public Alumnos() {}

    public Long getAlumCod() {
        return alumCod;
    }

    public void setAlumCod(Long alumCod) {
        this.alumCod = alumCod;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "alumCod=" + alumCod +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumnos alumnos = (Alumnos) o;

        if (alumCod != null ? !alumCod.equals(alumnos.alumCod) : alumnos.alumCod != null) return false;
        if (nombre != null ? !nombre.equals(alumnos.nombre) : alumnos.nombre != null) return false;
        if (apellido != null ? !apellido.equals(alumnos.apellido) : alumnos.apellido != null) return false;
        return especialidad == alumnos.especialidad;

    }

    @Override
    public int hashCode() {
        int result = alumCod != null ? alumCod.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        return result;
    }
}
