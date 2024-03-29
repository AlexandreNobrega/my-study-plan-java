package com.devsuperior.demolazy.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.devsuperior.demolazy.dto.EmployeeDTO;
import com.devsuperior.demolazy.entities.Employee;
import com.devsuperior.demolazy.repositories.EmployeeRepository;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public JpaRepository<Employee, Long> getRepository() {
		return repository;
	}

/*
public EmployeeDTO findById(Long id) {
		Optional<Employee> result = repository.findById(id);
		return new EmployeeDTO(result.get());
	}

	public List<EmployeeDTO> findAll() {
		List<Employee> list = repository.findAll();
		//TODO: Convertendo a lista list para EmployeeDTO
		return list.stream().map(x -> new EmployeeDTO(x)).collect(Collectors.toList());
	}
*/
}
