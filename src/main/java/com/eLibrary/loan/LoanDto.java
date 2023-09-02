package com.eLibrary.loan;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility = ANY)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class LoanDto {

    Long id;
    Long userId;
    Long bookId;
    LocalDate date;
    LocalTime time;
    Long duration;
}