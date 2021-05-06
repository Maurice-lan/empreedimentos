package com.corretor.imoveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corretor.imoveis.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long> {

}
