package com.techpixe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techpixe.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {

}
