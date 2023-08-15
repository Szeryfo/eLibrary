package com.eLibrary.loan;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
