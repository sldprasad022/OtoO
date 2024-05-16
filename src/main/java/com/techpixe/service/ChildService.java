package com.techpixe.service;

import com.techpixe.entity.Child;

public interface ChildService {
	Child save(String childName, String standard, Long parent);
}
