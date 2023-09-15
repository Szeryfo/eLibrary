package com.eLibrary.domain.loan;

import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "Get all loans")
    @GetMapping
    public List<LoanDto> getAll() {
        return facade.getAll();
    }

    @Operation(summary = "Get loans by given user id")
    @GetMapping("/user/{userId}")
    public List<LoanDto> getByUserId(@PathVariable Long userId) {
        return null;
    }

    @Operation(summary = "Get loans by given book id")
    @GetMapping("/book/{bookId}")
    public List<LoanDto> getByBookId(@PathVariable Long bookId) {
        return null;
    }

    @Operation(summary = "Get late loans")
    @GetMapping("/late")
    public List<LoanDto> getLateLoans() {
        return null;
    }

    @Operation(summary = "Save loan")
    @PostMapping
    public LoanDto save(@RequestBody LoanDto userDto) {
        return facade.save(userDto);
    }

    @Operation(summary = "Delete loan by given id")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        facade.deleteById(id);
    }
}
