package com.cts.restfull.webservice.restfullwebservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.restfull.webservice.restfullwebservice.bean.Product;

@Repository
public interface ProductDaoService extends JpaRepository<Product, Integer> {

}
