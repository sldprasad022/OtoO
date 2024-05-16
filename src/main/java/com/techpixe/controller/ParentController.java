package com.techpixe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techpixe.entity.Parent;
import com.techpixe.service.ParentService;

@RestController
@RequestMapping("/parent")
public class ParentController {
	@Autowired
	ParentService parentService;

	@PostMapping("/save")
	public ResponseEntity<?> saveParent(@RequestParam String parentName, @RequestParam String address) {
		Parent saved = parentService.save(parentName, address);
		return ResponseEntity.ok(saved);
	}
}
