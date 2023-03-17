package org.softcars.model;
/**
 * @author Israel
 */
public class Venta_Autos{
    public String marca;
    public int modelo;
    public double precioCompra;
    public double gastos;
    public double precioTotal;
    public double precioVenta;
    public double ganancia;
    public String mesVenta;

    public Venta_Autos(){}

    public Venta_Autos(String marca, int modelo, double precioCompra, double gastos, double precioTotal, double precioVenta, double ganancia, String mesVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioCompra = precioCompra;
        this.gastos = gastos;
        this.precioTotal = precioTotal;
        this.precioVenta = precioVenta;
        this.ganancia = ganancia;
        this.mesVenta = mesVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public String getMesVenta() {
        return mesVenta;
    }

    public void setMesVenta(String mesVenta) {
        this.mesVenta = mesVenta;
    }

    @Override
    public String toString() {
        return "Venta_Autos{" + "marca=" + marca + ", modelo=" + modelo + ", precioCompra=" + precioCompra + ", gastos=" + gastos + ", precioTotal=" + precioTotal + ", precioVenta=" + precioVenta + ", ganancia=" + ganancia + ", mesVenta=" + mesVenta + '}';
    }
}