package br.com.wmcodes.back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wmcodes.back.entidades.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
