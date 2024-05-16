package com.techpixe.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techpixe.entity.Parent;
import com.techpixe.repository.ParentRepository;
import com.techpixe.service.ParentService;

@Service
public class ParentServiceImpl implements ParentService {
	@Autowired
	private ParentRepository parentRepository;

	@Override
	public Parent save(String parentName, String address) {
		Parent parent = new Parent();
		parent.setParentName(parentName);
		parent.setAddress(address);
		return parentRepository.save(parent);
	}

}
