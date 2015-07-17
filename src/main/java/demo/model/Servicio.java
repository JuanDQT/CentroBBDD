package demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Juan Daniel on 29/06/2015.
 */

@Entity
@PrimaryKeyJoinColumn(name="id")//Junta las tablas por la primary key, para relizar el joing
public class Servicio extends Empleados{
    @Enumerated(EnumType.STRING)
    private Turno turno;

    @JsonIgnore
    @ManyToMany(mappedBy = "servicios")
    private Set<Aula> aulas = new HashSet<>();


    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(Set<Aula> aulas) {
        this.aulas = aulas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Servicio servicio = (Servicio) o;

        if (turno != servicio.turno) return false;
        return !(aulas != null ? !aulas.equals(servicio.aulas) : servicio.aulas != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (turno != null ? turno.hashCode() : 0);
        result = 31 * result + (aulas != null ? aulas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "turno=" + turno +
                ", aulas=" + aulas +
                '}';
    }
}
