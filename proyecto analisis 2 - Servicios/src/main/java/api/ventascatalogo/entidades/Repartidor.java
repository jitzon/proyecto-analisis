/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.ventascatalogo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author gerar
 */
@Entity
@Table(name = "repartidor")
@NamedQueries({
    @NamedQuery(name = "Repartidor.findAll", query = "SELECT r FROM Repartidor r")
    , @NamedQuery(name = "Repartidor.findByIdRepartidor", query = "SELECT r FROM Repartidor r WHERE r.idRepartidor = :idRepartidor")
    , @NamedQuery(name = "Repartidor.findByNombreCompleto", query = "SELECT r FROM Repartidor r WHERE r.nombreCompleto = :nombreCompleto")
    , @NamedQuery(name = "Repartidor.findByDpi", query = "SELECT r FROM Repartidor r WHERE r.dpi = :dpi")
    , @NamedQuery(name = "Repartidor.findByDireccion", query = "SELECT r FROM Repartidor r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Repartidor.findByCelular", query = "SELECT r FROM Repartidor r WHERE r.celular = :celular")
    , @NamedQuery(name = "Repartidor.findByIdVehiculo", query = "SELECT r FROM Repartidor r WHERE r.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Repartidor.findByNoLicencia", query = "SELECT r FROM Repartidor r WHERE r.noLicencia = :noLicencia")
    , @NamedQuery(name = "Repartidor.findByPassword", query = "SELECT r FROM Repartidor r WHERE r.password = :password")
    , @NamedQuery(name = "Repartidor.findByCorreo", query = "SELECT r FROM Repartidor r WHERE r.correo = :correo")})
public class Repartidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_repartidor")
    private Integer idRepartidor;
    @Basic(optional = false)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Basic(optional = false)
    @Column(name = "dpi")
    private int dpi;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "celular")
    private int celular;
    @Basic(optional = false)
    @Column(name = "id_vehiculo")
    private int idVehiculo;
    @Basic(optional = false)
    @Column(name = "no_licencia")
    private int noLicencia;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;

    public Repartidor() {
    }

    public Repartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public Repartidor(Integer idRepartidor, String nombreCompleto, int dpi, String direccion, int celular, int idVehiculo, int noLicencia, String password, String correo) {
        this.idRepartidor = idRepartidor;
        this.nombreCompleto = nombreCompleto;
        this.dpi = dpi;
        this.direccion = direccion;
        this.celular = celular;
        this.idVehiculo = idVehiculo;
        this.noLicencia = noLicencia;
        this.password = password;
        this.correo = correo;
    }

    public Integer getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(int noLicencia) {
        this.noLicencia = noLicencia;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRepartidor != null ? idRepartidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Repartidor)) {
            return false;
        }
        Repartidor other = (Repartidor) object;
        if ((this.idRepartidor == null && other.idRepartidor != null) || (this.idRepartidor != null && !this.idRepartidor.equals(other.idRepartidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.Repartidor[ idRepartidor=" + idRepartidor + " ]";
    }
    
}
