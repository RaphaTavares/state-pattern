package com.company.tests;

import com.company.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    //Pedido realizado

    @Test
    public void deveAceitarPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals("pedido aceito", pedido.aceitar());
    }

    @Test
    public void deveCancelarPedidoRealizado(){
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals("pedido cancelado", pedido.cancelar());
    }

    @Test
    public void naoDeveEnviarPedidoRealizado() {
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals("não é possível enviar o pedido", pedido.enviar());
    }

    @Test
        public void naoDeveEntregarPedidoRealizado() {
        pedido.setEstado(PedidoEstadoRealizado.getInstance());
        assertEquals("não é possível entregar o pedido", pedido.entregar());
    }


    //Pedido aceito

    @Test
        public void naoDeveAceitarPedidoAceito() {
                pedido.setEstado(PedidoEstadoAceito.getInstance());
                assertEquals("não é possível aceitar o pedido", pedido.aceitar());
            }

    @Test
        public void deveEnviarPedidoAceito() {
            pedido.setEstado(PedidoEstadoAceito.getInstance());
            assertEquals("pedido enviado", pedido.enviar());
    }

    @Test
        public void naoDeveEntregarPedidoAceito() {
            pedido.setEstado(PedidoEstadoAceito.getInstance());
            assertEquals("não é possível entregar o pedido", pedido.entregar());
    }

    @Test
        public void naoDeveCancelarPedidoAceito() {
            pedido.setEstado(PedidoEstadoAceito.getInstance());
            assertEquals("não é possível cancelar o pedido", pedido.cancelar());
    }


    //Pedido enviado

    @Test
    public void naoDeveAceitarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("não é possível aceitar o pedido", pedido.aceitar());
    }

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("não é possível enviar o pedido", pedido.enviar());
    }

    @Test
    public void deveEntregarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("pedido entregue com sucesso!", pedido.entregar());
    }

    @Test
    public void deveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Pedido cancelado com sucesso", pedido.cancelar());
    }

    //Pedido entregue

    @Test
    public void naoDeveAceitarPedidoEntregue(){
        pedido.setEstado((PedidoEstadoEntregue.getInstance()));
        assertEquals("não é possível aceitar o pedido", pedido.aceitar());
    }

    @Test
    public void naoDeveEnviarPedidoEntregue(){
        pedido.setEstado((PedidoEstadoEntregue.getInstance()));
        assertEquals("não é possível enviar o pedido", pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue(){
        pedido.setEstado((PedidoEstadoEntregue.getInstance()));
        assertEquals("não é possível entregar o pedido", pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue(){
        pedido.setEstado((PedidoEstadoEntregue.getInstance()));
        assertEquals("não é possível cancelar o pedido", pedido.cancelar());
    }

    //Pedido cancelado

    @Test
    public void naoDeveAceitarPedidoCancelado(){
        pedido.setEstado((PedidoEstadoCancelado.getInstance()));
        assertEquals("não é possível aceitar o pedido", pedido.aceitar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado(){
        pedido.setEstado((PedidoEstadoCancelado.getInstance()));
        assertEquals("não é possivel enviar o pedido", pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado(){
        pedido.setEstado((PedidoEstadoCancelado.getInstance()));
        assertEquals("não é possível entregar o pedido", pedido.entregar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado(){
        pedido.setEstado((PedidoEstadoCancelado.getInstance()));
        assertEquals("não é possível cancelar o pedido", pedido.cancelar());
    }

}
