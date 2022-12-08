package com.devsuperior.demolazy.services;

import com.devsuperior.demolazy.util.Convertible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


//TODO: T extends Convertible<DTO>: significa que T é um Convertible<DTO>(Convertenado para DTO)
public interface GenericService<T extends Convertible<DTO>, DTO, ID> {

    JpaRepository<T, ID> getRepository();
    default DTO findById(ID id) {
        Optional<T> result = getRepository().findById(id);
        return result.get().convert();
    }

    default List<DTO> findAll() {
        List<T> list = getRepository().findAll();
        //TODO: Convertendo a lista list para EmployeeDTO
        return list.stream().map(x -> x.convert()).collect(Collectors.toList());
    }

}
