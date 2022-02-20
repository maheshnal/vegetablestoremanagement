package com.vegetableStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vegetableStore.model.customer;


@Repository

public interface customerRepository extends JpaRepository<customer,Long> {

}
