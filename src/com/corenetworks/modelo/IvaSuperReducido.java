package com.corenetworks.modelo;

public class IvaSuperReducido implements IImpuesto{

    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.04;
    }
}
