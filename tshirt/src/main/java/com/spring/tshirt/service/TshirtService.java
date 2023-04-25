package com.spring.tshirt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.tshirt.model.Tshirt;
import com.spring.tshirt.repositary.TshirtRepository;

@Service
public class TshirtService {
	@Autowired
	
	//Get Method
	private TshirtRepository repository;
	public List<Tshirt> getTshirt() {
		return repository.findAll();
	}
	
	//Get by Id Method
	public Optional<Tshirt> getTshirtId(int id) {
		return repository.findById(id);
	}
	
	//Post Method
	public Tshirt addTshirt(Tshirt tshirt) {
		return repository.save(tshirt);
	}
	
	//Update Method
	public Tshirt editTshirt(Tshirt tshirt,int id) {
		Tshirt tshirt1 = repository.findById(id).orElse(null);
		if(tshirt1!=null) {
			tshirt1.setBrand(tshirt.getBrand());
			tshirt1.setSize(tshirt.getSize());
			tshirt1.setPrice(tshirt.getPrice());
			return repository.saveAndFlush(tshirt1);
		}
		else {
			return null;
		}
		
	}
	public String deleteTshirt(int id) {
		repository.deleteById(id);
		return "deleted !";
	}
}
