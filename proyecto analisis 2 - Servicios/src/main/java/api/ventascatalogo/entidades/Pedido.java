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
@Table(name = "pedido")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByIdConsumidor", query = "SELECT p FROM Pedido p WHERE p.idConsumidor = :idConsumidor")
    , @NamedQuery(name = "Pedido.findByIdPedidoListadoDescripcion", query = "SELECT p FROM Pedido p WHERE p.idPedidoListadoDescripcion = :idPedidoListadoDescripcion")
    , @NamedQuery(name = "Pedido.findByIdTipoRecepcion", query = "SELECT p FROM Pedido p WHERE p.idTipoRecepcion = :idTipoRecepcion")
    , @NamedQuery(name = "Pedido.findByComision", query = "SELECT p FROM Pedido p WHERE p.comision = :comision")
    , @NamedQuery(name = "Pedido.findByCostoTotal", query = "SELECT p FROM Pedido p WHERE p.costoTotal = :costoTotal")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "id_consumidor")
    private int idConsumidor;
    @Basic(optional = false)
    @Column(name = "id_pedido_listado_descripcion")
    private int idPedidoListadoDescripcion;
    @Basic(optional = false)
    @Column(name = "id_tipo_recepcion")
    private int idTipoRecepcion;
    @Basic(optional = false)
    @Column(name = "comision")
    private int comision;
    @Basic(optional = false)
    @Column(name = "costo_total")
    private int costoTotal;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, int idConsumidor, int idPedidoListadoDescripcion, int idTipoRecepcion, int comision, int costoTotal) {
        this.idPedido = idPedido;
        this.idConsumidor = idConsumidor;
        this.idPedidoListadoDescripcion = idPedidoListadoDescripcion;
        this.idTipoRecepcion = idTipoRecepcion;
        this.comision = comision;
        this.costoTotal = costoTotal;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(int idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public int getIdPedidoListadoDescripcion() {
        return idPedidoListadoDescripcion;
    }

    public void setIdPedidoListadoDescripcion(int idPedidoListadoDescripcion) {
        this.idPedidoListadoDescripcion = idPedidoListadoDescripcion;
    }

    public int getIdTipoRecepcion() {
        return idTipoRecepcion;
    }

    public void setIdTipoRecepcion(int idTipoRecepcion) {
        this.idTipoRecepcion = idTipoRecepcion;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.Pedido[ idPedido=" + idPedido + " ]";
    }
    
}
