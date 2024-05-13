package com.example.estoque.produto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estoque.produto.entity.ProdVisibilidade;
import com.example.estoque.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{
    
    List<Produto> findByVisibilidade(ProdVisibilidade visibilidade);

    List<Produto> findByVisibilidadeIn(List<ProdVisibilidade> visibilidades);
}
