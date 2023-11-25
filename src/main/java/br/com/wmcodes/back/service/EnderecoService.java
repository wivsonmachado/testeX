package br.com.wmcodes.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wmcodes.back.entidades.Endereco;
import br.com.wmcodes.back.repositorios.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public void salvarEndereco(Endereco end) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(end.getLogradouro());
		endereco.setNumero(end.getNumero());
		endereco.setCep(end.getCep());
		endereco.setCidade(end.getCidade());
		endereco.setUf(end.getUf());
		endereco.setComplemento(end.getComplemento());
		
		enderecoRepository.save(endereco);
		
	}
	
}
