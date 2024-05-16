package com.techpixe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techpixe.entity.Child;
import com.techpixe.service.ChildService;

@RestController
@RequestMapping("/child")
public class ChildController {
	@Autowired
	private ChildService childService;

	@PostMapping("/save/{parent}")
	public ResponseEntity<Child> saveChild(@PathVariable Long parent, @RequestParam String childName,
			@RequestParam String standard) {
		Child savedChild = childService.save(childName, standard, parent);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
