package br.com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.api.model.Produto;

@Service
public class ProdutoService {

	public List<Produto> buscarTodos() {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto produto = new Produto();
		produto.setDescricao("teste");
		produto.setId(1L);
		produto.setImagePath("teset");
		produto.setNome("teste poduto");
		produto.setPreco(10.0);
		produto.setQuantidade(10);
		listaProdutos.add(produto);
		
		return listaProdutos;
	}
}
