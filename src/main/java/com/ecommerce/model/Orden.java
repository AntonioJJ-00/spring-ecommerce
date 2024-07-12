package com.ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String numero;
    private Date fechaCracion;
    private Date fechaRecibida;
    private  double total;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalleorden;

    public Orden() {
    }

    public Orden(Integer id, String numero, Date fechaCracion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCracion = fechaCracion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCracion() {
        return fechaCracion;
    }

    public void setFechaCracion(Date fechaCracion) {
        this.fechaCracion = fechaCracion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DetalleOrden getDetalleorden() {
        return detalleorden;
    }

    public void setDetalleorden(DetalleOrden detalleorden) {
        this.detalleorden = detalleorden;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCracion=" + fechaCracion +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }
}
