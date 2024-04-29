package com.example.estoque.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estoque.produto.entity.ProdVisibilidade;
import com.example.estoque.produto.entity.Produto;
import com.example.estoque.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoRepository prodRep;

    @GetMapping("/estoque")
    public List<Produto> listarAtivos(){
        return prodRep.findByVisibilidade(ProdVisibilidade.ATIVADO);
    }

    @GetMapping("/estoqueTotal")
    public List<Produto> listar(){
        return prodRep.findAll();
    }

    @GetMapping("/produto/{id}")
    public Produto getProduto(@PathVariable Long id){
        return this.prodRep.findById(id).get();
    }

    @PostMapping("/novoProduto")
    public Produto novoProduto(@RequestBody Produto produto){
        return prodRep.save(produto);
    }

    @PutMapping("/atualizarProduto")
    public Produto atualizarProduto(@RequestBody Produto produto){
        return prodRep.save(produto);
    }

    @DeleteMapping("/excluirProduto/{id}")
    public void excluirProduto(@PathVariable Long id){
        prodRep.deleteById(id);
    }
}
