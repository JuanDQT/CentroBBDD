package demo.model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * Created by Juan Daniel on 19/06/2015.
 */

@Entity
@Table(name="ALUMNOS")
public class Alumno {

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

    public Alumno() {}

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
        return "Alumno{" +
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

        Alumno alumno = (Alumno) o;

        if (alumCod != null ? !alumCod.equals(alumno.alumCod) : alumno.alumCod != null) return false;
        if (nombre != null ? !nombre.equals(alumno.nombre) : alumno.nombre != null) return false;
        if (apellido != null ? !apellido.equals(alumno.apellido) : alumno.apellido != null) return false;
        return especialidad == alumno.especialidad;

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
