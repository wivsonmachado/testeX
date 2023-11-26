package br.com.wmcodes.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wmcodes.back.EmpresaDTO;
import br.com.wmcodes.back.entidades.Empresa;
import br.com.wmcodes.back.entidades.Endereco;
import br.com.wmcodes.back.entidades.enums.StatusEnum;
import br.com.wmcodes.back.service.EmpresaService;
import br.com.wmcodes.back.service.EnderecoService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@Autowired
	private EnderecoService enderecoService;

	@PostMapping("/salvar")
	public ResponseEntity<String> salvarEmpresa(@RequestBody EmpresaDTO empresaDto){
		
		Endereco endereco = new Endereco();
		Empresa empresa = new Empresa();

		
		empresa.setNomeEmpresa(empresaDto.getNomeEmpresa());
		empresa.setEmailEmpresa(empresaDto.getEmailEmpresa());
		empresa.setContatoEmpresa(empresaDto.getContatoEmpresa());
		empresa.setObservacoes(empresaDto.getObservacoes());
		StatusEnum status = StatusEnum.valueOf(empresaDto.getStatus().toUpperCase());
		empresa.setStatus(status);
		
		empresaService.salvarEmpresa(empresa);	
		endereco.setLogradouro(empresaDto.getLogradouro());
		endereco.setNumero(empresaDto.getNumero());
		endereco.setCep(empresaDto.getCep());
		endereco.setCidade(empresaDto.getCidade());
		endereco.setComplemento(empresaDto.getComplemento());
		endereco.setUf(empresaDto.getUf());
		enderecoService.salvarEndereco(endereco);
		
		return ResponseEntity.status(201).body(empresa.getNomeEmpresa() + " salvo com sucesso.");
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletarEmpresa(@PathVariable long id) {
		//implementar
		
	}
	
	
}
