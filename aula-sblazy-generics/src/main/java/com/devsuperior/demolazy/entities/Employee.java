package com.devsuperior.demolazy.entities;

import com.devsuperior.demolazy.dto.EmployeeDTO;
import com.devsuperior.demolazy.util.Convertible;

import javax.persistence.*;

@Entity
@Table(name = "tb_employee")
public class Employee implements Convertible<EmployeeDTO> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Employee() {
	}

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//TODO: Implementação do convert, retorna um DTO copiando os dados do meu objeto da entidade Employee
	// Quero que o método convert, converta um objeto do tipo desta classe em um objeto que eu definir no lugar de T
	@Override
	public EmployeeDTO convert() {
		return new EmployeeDTO(this);
	}
}
