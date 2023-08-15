package com.eLibrary.loan;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanFacade {

    private final LoanService service;

    public List<LoanDto> getAll() {
        return service.getAll();
    }

    public LoanDto save(LoanDto userDto) {
        return service.save(userDto);
    }

    public void deleteById(Long id) {
        service.deleteById(id);
    }
}
