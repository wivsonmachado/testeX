package br.com.wmcodes.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wmcodes.back.entidades.Empresa;
import br.com.wmcodes.back.entidades.Endereco;
import br.com.wmcodes.back.repositorios.EmpresaRepository;
import br.com.wmcodes.back.repositorios.EnderecoRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public void salvarEmpresa(Empresa emp) {
		Empresa empresa = new Empresa();
		empresa.setNomeEmpresa(emp.getNomeEmpresa());
		empresa.setEmailEmpresa(emp.getEmailEmpresa());
		empresa.setContatoEmpresa(emp.getContatoEmpresa());
		empresa.setObservacoes(emp.getObservacoes());
		empresa.setStatus(emp.getStatus());
		empresa.setEndereco(emp.getEndereco());
		
		empresaRepository.save(empresa);		
		
	}
	
	public void deletarEmpresa(long id) {
		empresaRepository.deleteById(id);
	}
	
}
