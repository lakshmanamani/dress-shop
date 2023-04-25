package com.spring.tshirt.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.tshirt.model.Tshirt;
@Repository
public interface TshirtRepository extends JpaRepository<Tshirt, Integer> {

}
