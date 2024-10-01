package com.dbpersonal.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbpersonal.db.entities.Pessoa;
import com.dbpersonal.db.repository.PessoaRepository;

import jakarta.annotation.PostConstruct;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostConstruct
    public void salvarPessoasIniciais() {
        Pessoa pessoa1 = new Pessoa("João", 28, "Masculino", "Atlético", "Intermediário");
        Pessoa pessoa2 = new Pessoa("Maria", 22, "Feminino", "Endomorfo", "Iniciante");

        pessoaRepository.save(pessoa1);
        pessoaRepository.save(pessoa2);

        System.out.println("Pessoas salvas no banco de dados com sucesso!");
    }
}
