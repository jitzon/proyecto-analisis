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
@Table(name = "vehiculo_repartidor")
@NamedQueries({
    @NamedQuery(name = "VehiculoRepartidor.findAll", query = "SELECT v FROM VehiculoRepartidor v")
    , @NamedQuery(name = "VehiculoRepartidor.findByIdVehiculo", query = "SELECT v FROM VehiculoRepartidor v WHERE v.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "VehiculoRepartidor.findByIdRepartidor", query = "SELECT v FROM VehiculoRepartidor v WHERE v.idRepartidor = :idRepartidor")
    , @NamedQuery(name = "VehiculoRepartidor.findByTipoVehiculo", query = "SELECT v FROM VehiculoRepartidor v WHERE v.tipoVehiculo = :tipoVehiculo")
    , @NamedQuery(name = "VehiculoRepartidor.findByPlaca", query = "SELECT v FROM VehiculoRepartidor v WHERE v.placa = :placa")})
public class VehiculoRepartidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;
    @Basic(optional = false)
    @Column(name = "id_repartidor")
    private int idRepartidor;
    @Basic(optional = false)
    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;

    public VehiculoRepartidor() {
    }

    public VehiculoRepartidor(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public VehiculoRepartidor(Integer idVehiculo, int idRepartidor, String tipoVehiculo, String placa) {
        this.idVehiculo = idVehiculo;
        this.idRepartidor = idRepartidor;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculoRepartidor)) {
            return false;
        }
        VehiculoRepartidor other = (VehiculoRepartidor) object;
        if ((this.idVehiculo == null && other.idVehiculo != null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.VehiculoRepartidor[ idVehiculo=" + idVehiculo + " ]";
    }
    
}
