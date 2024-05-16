package com.techpixe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long childId;

	private String childName;

	private String standard;

	@OneToOne(fetch = FetchType.EAGER)
	private Parent parent;
}
