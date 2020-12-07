package com.tagworking.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tagworking.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
