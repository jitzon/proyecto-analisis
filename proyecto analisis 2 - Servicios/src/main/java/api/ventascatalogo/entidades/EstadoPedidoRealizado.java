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
@Table(name = "estado_pedido_realizado")
@NamedQueries({
    @NamedQuery(name = "EstadoPedidoRealizado.findAll", query = "SELECT e FROM EstadoPedidoRealizado e")
    , @NamedQuery(name = "EstadoPedidoRealizado.findById", query = "SELECT e FROM EstadoPedidoRealizado e WHERE e.id = :id")
    , @NamedQuery(name = "EstadoPedidoRealizado.findByIdPedido", query = "SELECT e FROM EstadoPedidoRealizado e WHERE e.idPedido = :idPedido")
    , @NamedQuery(name = "EstadoPedidoRealizado.findByIdEstadoPedido", query = "SELECT e FROM EstadoPedidoRealizado e WHERE e.idEstadoPedido = :idEstadoPedido")
    , @NamedQuery(name = "EstadoPedidoRealizado.findByIdRepartidor", query = "SELECT e FROM EstadoPedidoRealizado e WHERE e.idRepartidor = :idRepartidor")})
public class EstadoPedidoRealizado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_pedido")
    private int idPedido;
    @Basic(optional = false)
    @Column(name = "id_estado_pedido")
    private int idEstadoPedido;
    @Basic(optional = false)
    @Column(name = "id_repartidor")
    private int idRepartidor;

    public EstadoPedidoRealizado() {
    }

    public EstadoPedidoRealizado(Integer id) {
        this.id = id;
    }

    public EstadoPedidoRealizado(Integer id, int idPedido, int idEstadoPedido, int idRepartidor) {
        this.id = id;
        this.idPedido = idPedido;
        this.idEstadoPedido = idEstadoPedido;
        this.idRepartidor = idRepartidor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdEstadoPedido() {
        return idEstadoPedido;
    }

    public void setIdEstadoPedido(int idEstadoPedido) {
        this.idEstadoPedido = idEstadoPedido;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
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
        if (!(object instanceof EstadoPedidoRealizado)) {
            return false;
        }
        EstadoPedidoRealizado other = (EstadoPedidoRealizado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.EstadoPedidoRealizado[ id=" + id + " ]";
    }
    
}
