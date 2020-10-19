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
@Table(name = "direcciones_tienda_vendedor")
@NamedQueries({
    @NamedQuery(name = "DireccionesTiendaVendedor.findAll", query = "SELECT d FROM DireccionesTiendaVendedor d")
    , @NamedQuery(name = "DireccionesTiendaVendedor.findByIdDireccionTienda", query = "SELECT d FROM DireccionesTiendaVendedor d WHERE d.idDireccionTienda = :idDireccionTienda")
    , @NamedQuery(name = "DireccionesTiendaVendedor.findByIdVendedor", query = "SELECT d FROM DireccionesTiendaVendedor d WHERE d.idVendedor = :idVendedor")
    , @NamedQuery(name = "DireccionesTiendaVendedor.findByDireccionTienda", query = "SELECT d FROM DireccionesTiendaVendedor d WHERE d.direccionTienda = :direccionTienda")
    , @NamedQuery(name = "DireccionesTiendaVendedor.findByTelefono", query = "SELECT d FROM DireccionesTiendaVendedor d WHERE d.telefono = :telefono")})
public class DireccionesTiendaVendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_direccion_tienda")
    private Integer idDireccionTienda;
    @Basic(optional = false)
    @Column(name = "id_vendedor")
    private int idVendedor;
    @Basic(optional = false)
    @Column(name = "direccion_tienda")
    private String direccionTienda;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;

    public DireccionesTiendaVendedor() {
    }

    public DireccionesTiendaVendedor(Integer idDireccionTienda) {
        this.idDireccionTienda = idDireccionTienda;
    }

    public DireccionesTiendaVendedor(Integer idDireccionTienda, int idVendedor, String direccionTienda, int telefono) {
        this.idDireccionTienda = idDireccionTienda;
        this.idVendedor = idVendedor;
        this.direccionTienda = direccionTienda;
        this.telefono = telefono;
    }

    public Integer getIdDireccionTienda() {
        return idDireccionTienda;
    }

    public void setIdDireccionTienda(Integer idDireccionTienda) {
        this.idDireccionTienda = idDireccionTienda;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccionTienda != null ? idDireccionTienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DireccionesTiendaVendedor)) {
            return false;
        }
        DireccionesTiendaVendedor other = (DireccionesTiendaVendedor) object;
        if ((this.idDireccionTienda == null && other.idDireccionTienda != null) || (this.idDireccionTienda != null && !this.idDireccionTienda.equals(other.idDireccionTienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.DireccionesTiendaVendedor[ idDireccionTienda=" + idDireccionTienda + " ]";
    }
    
}
