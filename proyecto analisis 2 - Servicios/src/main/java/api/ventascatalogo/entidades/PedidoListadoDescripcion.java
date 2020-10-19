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
@Table(name = "pedido_listado_descripcion")
@NamedQueries({
    @NamedQuery(name = "PedidoListadoDescripcion.findAll", query = "SELECT p FROM PedidoListadoDescripcion p")
    , @NamedQuery(name = "PedidoListadoDescripcion.findByIdPedidoListadoDescripcion", query = "SELECT p FROM PedidoListadoDescripcion p WHERE p.idPedidoListadoDescripcion = :idPedidoListadoDescripcion")
    , @NamedQuery(name = "PedidoListadoDescripcion.findByIdProducto", query = "SELECT p FROM PedidoListadoDescripcion p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "PedidoListadoDescripcion.findByIdConsumidor", query = "SELECT p FROM PedidoListadoDescripcion p WHERE p.idConsumidor = :idConsumidor")})
public class PedidoListadoDescripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pedido_listado_descripcion")
    private Integer idPedidoListadoDescripcion;
    @Basic(optional = false)
    @Column(name = "id_producto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "id_consumidor")
    private int idConsumidor;

    public PedidoListadoDescripcion() {
    }

    public PedidoListadoDescripcion(Integer idPedidoListadoDescripcion) {
        this.idPedidoListadoDescripcion = idPedidoListadoDescripcion;
    }

    public PedidoListadoDescripcion(Integer idPedidoListadoDescripcion, int idProducto, int idConsumidor) {
        this.idPedidoListadoDescripcion = idPedidoListadoDescripcion;
        this.idProducto = idProducto;
        this.idConsumidor = idConsumidor;
    }

    public Integer getIdPedidoListadoDescripcion() {
        return idPedidoListadoDescripcion;
    }

    public void setIdPedidoListadoDescripcion(Integer idPedidoListadoDescripcion) {
        this.idPedidoListadoDescripcion = idPedidoListadoDescripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedidoListadoDescripcion != null ? idPedidoListadoDescripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoListadoDescripcion)) {
            return false;
        }
        PedidoListadoDescripcion other = (PedidoListadoDescripcion) object;
        if ((this.idPedidoListadoDescripcion == null && other.idPedidoListadoDescripcion != null) || (this.idPedidoListadoDescripcion != null && !this.idPedidoListadoDescripcion.equals(other.idPedidoListadoDescripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.PedidoListadoDescripcion[ idPedidoListadoDescripcion=" + idPedidoListadoDescripcion + " ]";
    }
    
}
