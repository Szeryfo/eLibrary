package com.eLibrary.domain.loan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class LoanService {

    @Autowired
    LoanRepository repository;

    @Autowired
    LoanMapper mapper;

    public List<LoanDto> getAll() {
        var all = repository.findAll();

        return mapper.toDtos(all);
    }

    public LoanDto save(LoanDto dto) {
        var entity = mapper.toEntity(dto);
        var savedEntity = repository.save(entity);

        return mapper.toDto(savedEntity);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
