/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author filor
 */
@Entity
@Table(name="Computadora")
public class ComputadoraEntidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="idComputadora")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="numeroMaquina",nullable=false)
    private int numeroMaquina;
    
    @Column(name="nombreAlumno",length=100,nullable=true)
    private String nombreAlumno;
    
    @Column(name="estatus",length=100,nullable=false)
    private String estatus;
    
    @Column(name="ip",length=20,nullable=false)
    private String IP;
    
    @ManyToOne(targetEntity = CentroDeComputoEntidad.class)
    @JoinColumn(name = "idCentroDeComputo", nullable = false)
    private CentroDeComputoEntidad centroComputadora;
    
    @OneToMany(mappedBy = "reservaCompu")
    private List<ReservaEntidad> reservaCompu;
    
    @OneToMany(mappedBy = "computadora")
    private List<ComputadoraSoftwareEntidad> computadora;
    
    
    /**
     * 
     */
    public ComputadoraEntidad() {
    }

    public ComputadoraEntidad(Long id, int numeroMaquina, String nombreAlumno, String estatus, String IP, CentroDeComputoEntidad centroComputadora, List<ReservaEntidad> reservaCompu, List<ComputadoraSoftwareEntidad> computadora) {
        this.id = id;
        this.numeroMaquina = numeroMaquina;
        this.nombreAlumno = nombreAlumno;
        this.estatus = estatus;
        this.IP = IP;
        this.centroComputadora = centroComputadora;
        this.reservaCompu = reservaCompu;
        this.computadora = computadora;
    }

    public ComputadoraEntidad(int numeroMaquina, String nombreAlumno, String estatus, String IP) {
        this.numeroMaquina = numeroMaquina;
        this.nombreAlumno = nombreAlumno;
        this.estatus = estatus;
        this.IP = IP;
    }

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public CentroDeComputoEntidad getCentroComputadora() {
        return centroComputadora;
    }

    public void setCentroComputadora(CentroDeComputoEntidad centroComputadora) {
        this.centroComputadora = centroComputadora;
    }

    public List<ReservaEntidad> getReservaCompu() {
        return reservaCompu;
    }

    public void setReservaCompu(List<ReservaEntidad> reservaCompu) {
        this.reservaCompu = reservaCompu;
    }

    public List<ComputadoraSoftwareEntidad> getComputadora() {
        return computadora;
    }

    public void setComputadora(List<ComputadoraSoftwareEntidad> computadora) {
        this.computadora = computadora;
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
        if (!(object instanceof ComputadoraEntidad)) {
            return false;
        }
        ComputadoraEntidad other = (ComputadoraEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.computadoraEntidad[ id=" + id + " ]";
    }
    
}
