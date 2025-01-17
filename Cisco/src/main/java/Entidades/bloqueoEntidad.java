/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author filor
 */
@Entity
@Table(name="Bloqueo")
public class BloqueoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="idBloqueo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "fechaDeBloqueo", nullable = false)
    private LocalDateTime fechaBloqueo;
    
    @Column(name="motivo",length=40,nullable=true)
    private String motivo;
    
    @ManyToOne(targetEntity = AlumnoEntidad.class)
    @JoinColumn(name = "idAlumno", nullable = false)
    private AlumnoEntidad bloqueoAlumno;
    

    /**
     * 
     */
    public BloqueoEntidad() {
    }

    public BloqueoEntidad(Long id, LocalDateTime fechaBloqueo, String motivo, AlumnoEntidad bloqueoAlumno) {
        this.id = id;
        this.fechaBloqueo = fechaBloqueo;
        this.motivo = motivo;
        this.bloqueoAlumno = bloqueoAlumno;
    }

    public BloqueoEntidad(LocalDateTime fechaBloqueo, String motivo) {
        this.fechaBloqueo = fechaBloqueo;
        this.motivo = motivo;
    }

    public LocalDateTime getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(LocalDateTime fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public AlumnoEntidad getBloqueoAlumno() {
        return bloqueoAlumno;
    }

    public void setBloqueoAlumno(AlumnoEntidad bloqueoAlumno) {
        this.bloqueoAlumno = bloqueoAlumno;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BloqueoEntidad)) {
            return false;
        }
        BloqueoEntidad other = (BloqueoEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.bloqueoEntidad[ id=" + id + " ]";
    }
    
}
