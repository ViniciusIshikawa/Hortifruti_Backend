package com.hortifruti.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hortifruti.domain.Produto;
import com.hortifruti.domain.enums.TipoAlimento;
import com.hortifruti.dto.ProdutoDTO;
import com.hortifruti.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repo;
	
	public Produto find(Integer id){
		Optional<Produto> obj = repo.findById(id);
		
		return obj.orElseThrow();
	}
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
	
	@Transactional
	public Produto insert(Produto obj) {
		obj.setId(null);
		obj = repo.save(obj);
		return obj;
	}
	
	public Produto update(Produto obj) {
		Produto newObj = find(obj.getId());
		newObj.setNome(obj.getNome());
		newObj.setPreco(obj.getPreco());
		newObj.setTipoAlimento(obj.getTipoAlimento());
		
		return repo.save(newObj);
	}
	
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
	
	public Produto fromDTO(ProdutoDTO objDTO) {
		return new Produto(objDTO.getId(), objDTO.getNome(), objDTO.getPreco(), TipoAlimento.toEnum(objDTO.getTipoAlimento()));
	}
}
