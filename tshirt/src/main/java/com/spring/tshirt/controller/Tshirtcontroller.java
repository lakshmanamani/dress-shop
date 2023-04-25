package com.spring.tshirt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tshirt.model.Tshirt;
import com.spring.tshirt.service.TshirtService;

@RestController
@RequestMapping("/api")
public class Tshirtcontroller {
		@Autowired
		private TshirtService service;
		@GetMapping()
		public List<Tshirt> read(){
			return service.getTshirt();
		}
		@GetMapping("/{id}")
		public Optional<Tshirt> readbyId(@PathVariable int id) {
			return service.getTshirtId(id);
		}
		@PostMapping
		public Tshirt create(@RequestBody Tshirt tshirt) {
			return service.addTshirt(tshirt);
		}
		@PutMapping("/{id}")
		public Tshirt update(@RequestBody Tshirt tshirt, @PathVariable int id) {
				return service.editTshirt(tshirt, id);
		}
		@DeleteMapping("/{id}")
		public String delete(@PathVariable int id) {
			return service.deleteTshirt(id);
		}
		
}
