package demo.model;

import javax.persistence.*;


/**
 * Created by Juan Daniel on 24/06/2015.
 */

@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long codigo;
    private String nombre;
    private Long duracion;

    @OneToOne(mappedBy = "asignatura")
    private Profesor profesor;

    @ManyToOne
    private Especialidad especialidad;

    public Asignatura() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }


    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asignatura that = (Asignatura) o;

        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (duracion != null ? !duracion.equals(that.duracion) : that.duracion != null) return false;
        if (especialidad != that.especialidad) return false;
        return !(profesor != null ? !profesor.equals(that.profesor) : that.profesor != null);

    }

    @Override
    public int hashCode() {
        int result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (duracion != null ? duracion.hashCode() : 0);
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        result = 31 * result + (profesor != null ? profesor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", especialidad=" + especialidad +
                ", profesor=" + profesor +
                '}';
    }
}
