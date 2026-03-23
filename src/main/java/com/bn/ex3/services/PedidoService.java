package com.bn.ex3.services;

import com.bn.ex3.models.PedidoModel;
import com.bn.ex3.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public PedidoModel criarPedido(PedidoModel pedido) {
        return repository.save(pedido);
    }

    public List<PedidoModel> findAll() {
        return repository.findAll();
    }

    public PedidoModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarPedido(Long id) {
        repository.deleteById(id);
    }
}