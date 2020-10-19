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
@Table(name = "tipo_recepcion")
@NamedQueries({
    @NamedQuery(name = "TipoRecepcion.findAll", query = "SELECT t FROM TipoRecepcion t")
    , @NamedQuery(name = "TipoRecepcion.findByIdRecepcion", query = "SELECT t FROM TipoRecepcion t WHERE t.idRecepcion = :idRecepcion")
    , @NamedQuery(name = "TipoRecepcion.findByDescripcion", query = "SELECT t FROM TipoRecepcion t WHERE t.descripcion = :descripcion")})
public class TipoRecepcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_recepcion")
    private Integer idRecepcion;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;

    public TipoRecepcion() {
    }

    public TipoRecepcion(Integer idRecepcion) {
        this.idRecepcion = idRecepcion;
    }

    public TipoRecepcion(Integer idRecepcion, String descripcion) {
        this.idRecepcion = idRecepcion;
        this.descripcion = descripcion;
    }

    public Integer getIdRecepcion() {
        return idRecepcion;
    }

    public void setIdRecepcion(Integer idRecepcion) {
        this.idRecepcion = idRecepcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecepcion != null ? idRecepcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecepcion)) {
            return false;
        }
        TipoRecepcion other = (TipoRecepcion) object;
        if ((this.idRecepcion == null && other.idRecepcion != null) || (this.idRecepcion != null && !this.idRecepcion.equals(other.idRecepcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.TipoRecepcion[ idRecepcion=" + idRecepcion + " ]";
    }
    
}
