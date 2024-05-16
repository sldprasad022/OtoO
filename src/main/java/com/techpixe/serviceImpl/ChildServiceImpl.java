package com.techpixe.serviceImpl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.techpixe.entity.Child;
import com.techpixe.entity.Parent;
import com.techpixe.repository.ChildRepository;
import com.techpixe.repository.ParentRepository;
import com.techpixe.service.ChildService;

@Service
public class ChildServiceImpl implements ChildService {
	@Autowired
	private ChildRepository childRepository;

	@Autowired
	private ParentRepository parentRepository;

	@Override
	public Child save(String childName, String standard, Long parent) {
		Parent parent1 = parentRepository.findById(parent)
				.orElseThrow(() -> new NoSuchElementException("Id was not found: " + parent));
		if (parent1 != null) {
			Child child = new Child();
			child.setChildName(childName);
			child.setStandard(standard);
			child.setParent(parent1);
			return childRepository.save(child);
		} else {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Id was not found " + parent);
		}
	}

}
