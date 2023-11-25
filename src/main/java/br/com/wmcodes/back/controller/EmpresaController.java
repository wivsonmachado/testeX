package br.com.wmcodes.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wmcodes.back.EmpresaDTO;
import br.com.wmcodes.back.entidades.Empresa;
import br.com.wmcodes.back.entidades.Endereco;
import br.com.wmcodes.back.entidades.enums.StatusEnum;
import br.com.wmcodes.back.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService service;

	@PostMapping("/salvar")
	public ResponseEntity<String> salvarEmpresa(@RequestBody EmpresaDTO empresaDto){
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(empresaDto.getLogradouro());
		endereco.setNumero(empresaDto.getNumero());
		endereco.setCep(empresaDto.getCep());
		endereco.setCidade(empresaDto.getCidade());
		endereco.setComplemento(empresaDto.getComplemento());
		endereco.setUf(empresaDto.getUf());
		service.salvarEndereco(endereco);
		
		Empresa empresa = new Empresa();
		empresa.setNomeEmpresa(empresaDto.getNomeEmpresa());
		empresa.setEmailEmpresa(empresaDto.getEmailEmpresa());
		empresa.setContatoEmpresa(empresaDto.getContatoEmpresa());
		empresa.setObservacoes(empresaDto.getObservacoes());
		empresa.setEndereco(endereco);
		StatusEnum status = StatusEnum.valueOf(empresaDto.getStatus().toUpperCase());
		empresa.setStatus(status);
		
		service.salvarEmpresa(empresa);	
		
		
		return ResponseEntity.status(201).body(empresa.getNomeEmpresa() + " salvo com sucesso.");
		
		
	}
	
	
}
