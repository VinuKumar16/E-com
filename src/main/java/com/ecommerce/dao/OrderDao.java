package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CustomerOrder;

@Repository
public interface OrderDao extends JpaRepository<CustomerOrder, Long> {

}
