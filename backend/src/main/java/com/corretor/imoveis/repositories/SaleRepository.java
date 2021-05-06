package com.corretor.imoveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corretor.imoveis.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

}
