package br.com.wmcodes.back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wmcodes.back.entidades.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
