package com.example.estoque.produto.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.estoque.produto.entity.ProdVisibilidade;
import com.example.estoque.produto.entity.Produto;

public interface ProdutoRepository extends CrudRepository <Produto, Long>{

    @SuppressWarnings("null")
    @Override
    List<Produto> findAll();

    List<Produto> findByVisibilidade(ProdVisibilidade visibilidade);
}
