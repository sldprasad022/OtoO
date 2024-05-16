package com.techpixe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parentId;

	private String parentName;

	private String address;
}
