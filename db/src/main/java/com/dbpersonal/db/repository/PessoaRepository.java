package com.dbpersonal.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbpersonal.db.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Métodos adicionais podem ser adicionados se necessário
}
