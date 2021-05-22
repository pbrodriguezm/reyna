/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools  Templates
 * and open the template in the editor.
 */
package appswingreyna;

/**
 *Patrick Rodriguez
 * @author Compu
 */
public class Comprobante {

 int serie;
 int numero;
 char tipo;
 String cliente;
 String clidocumento;
 String clidireccion;
 double mbruto;
 double impuesto;
 double mtotal;

    public Comprobante(int serie, int numero, char tipo, String cliente, String clidocumento, double mbruto, double impuesto, double mtotal) {
        this.serie = serie;
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.clidocumento = clidocumento;
        this.mbruto = mbruto;
        this.impuesto = impuesto;
        this.mtotal = mtotal;
    }

    public Comprobante() {
    }

    public double getMtotal() {
        return mtotal;
    }

    public void setMtotal(double mtotal) {
        this.mtotal = mtotal;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getClidocumento() {
        return clidocumento;
    }

    public void setClidocumento(String clidocumento) {
        this.clidocumento = clidocumento;
    }

    public String getClidireccion() {
        return clidireccion;
    }

    public void setClidireccion(String clidireccion) {
        this.clidireccion = clidireccion;
    }

    public double getMbruto() {
        return mbruto;
    }

    public void setMbruto(double mbruto) {
        this.mbruto = mbruto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
 
    
}
