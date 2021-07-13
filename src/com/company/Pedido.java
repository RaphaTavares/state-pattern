package com.company;

public class Pedido {

    private String lanche;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRealizado.getInstance();
    }

    public String getLanche() {
        return lanche;
    }

    public Pedido setLanche(String lanche) {
        this.lanche = lanche;
        return this;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }

    public String aceitar(){
        return estado.aceitar(this);
    }

    public String enviar(){
        return estado.enviar(this);
    }

    public String entregar(){
        return estado.entregar(this);
    }

    public String cancelar(){
        return estado.cancelar(this);
    }
}
