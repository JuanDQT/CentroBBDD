package demo.model;

import javax.persistence.*;

/**
 * Created by Juan Daniel on 24/06/2015.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")//Junta las tablas por la primary key, para relizar el join
public class Profesor extends Empleados {

    @OneToOne
    private Asignatura asignatura;

    private Long salario;

    public Profesor() {
    }

    public Profesor(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "asignatura=" + asignatura +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Profesor profesor = (Profesor) o;

        if (asignatura != null ? !asignatura.equals(profesor.asignatura) : profesor.asignatura != null) return false;
        return !(salario != null ? !salario.equals(profesor.salario) : profesor.salario != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (asignatura != null ? asignatura.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        return result;
    }
}
