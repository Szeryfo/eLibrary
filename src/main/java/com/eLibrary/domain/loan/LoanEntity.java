package com.eLibrary.domain.loan;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loan")
@Setter
@Getter
class LoanEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    Long userId;
    Long bookId;
    LocalDate date;
    LocalTime time;
    Long duration;
}
