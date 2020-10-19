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
@Table(name = "consumidor", catalog = "ventascatalogo", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Consumidor.findAll", query = "SELECT c FROM Consumidor c")
    , @NamedQuery(name = "Consumidor.findByIdConsumidor", query = "SELECT c FROM Consumidor c WHERE c.idConsumidor = :idConsumidor")
    , @NamedQuery(name = "Consumidor.findByNombre", query = "SELECT c FROM Consumidor c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Consumidor.findByApellido", query = "SELECT c FROM Consumidor c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Consumidor.findByTelefono", query = "SELECT c FROM Consumidor c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Consumidor.findByDireccionEntrega", query = "SELECT c FROM Consumidor c WHERE c.direccionEntrega = :direccionEntrega")
    , @NamedQuery(name = "Consumidor.findByNit", query = "SELECT c FROM Consumidor c WHERE c.nit = :nit")
    , @NamedQuery(name = "Consumidor.findByPassword", query = "SELECT c FROM Consumidor c WHERE c.password = :password")
    , @NamedQuery(name = "Consumidor.findByCorreo", query = "SELECT c FROM Consumidor c WHERE c.correo = :correo")})
public class Consumidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consumidor")
    private Integer idConsumidor;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @Column(name = "direccion_entrega")
    private String direccionEntrega;
    @Basic(optional = false)
    @Column(name = "nit")
    private int nit;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;

    public Consumidor() {
    }

    public Consumidor(Integer idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public Consumidor(Integer idConsumidor, String nombre, String apellido, int telefono, String direccionEntrega, int nit, String password, String correo) {
        this.idConsumidor = idConsumidor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccionEntrega = direccionEntrega;
        this.nit = nit;
        this.password = password;
        this.correo = correo;
    }

    public Integer getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(Integer idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
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
        hash += (idConsumidor != null ? idConsumidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumidor)) {
            return false;
        }
        Consumidor other = (Consumidor) object;
        if ((this.idConsumidor == null && other.idConsumidor != null) || (this.idConsumidor != null && !this.idConsumidor.equals(other.idConsumidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.ventascatalogo.entidades.Consumidor[ idConsumidor=" + idConsumidor + " ]";
    }
    
}
