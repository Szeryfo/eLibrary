package com.eLibrary.loan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
class LoanController {

    @Autowired
    LoanFacade facade;

    @GetMapping
    public List<LoanDto> getAll() {
        return facade.getAll();
    }

    @PostMapping
    public LoanDto save(@RequestBody LoanDto userDto) {
        return facade.save(userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        facade.deleteById(id);
    }
}
