package com.corenetworks.modelo;

import java.util.List;

public class Factura {
    private IImpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura(){
        double total = 0;
        for (Producto elemento:
             productos) {
            total += elemento.getPrecio() + impuesto.calcularImpuesto(elemento);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "impuesto=" + impuesto +
                ", productos=" + productos +
                '}';
    }

    public Factura() {
    }

    public Factura(IImpuesto impuesto, List<Producto> productos) {
        this.impuesto = impuesto;
        this.productos = productos;
    }

    public IImpuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(IImpuesto impuesto) {
        this.impuesto = impuesto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
