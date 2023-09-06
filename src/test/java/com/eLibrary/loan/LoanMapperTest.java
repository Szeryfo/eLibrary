package com.eLibrary.loan;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.RepeatedTest;

class LoanMapperTest {

    private final LoanMapper mapper = new LoanMapperImpl();

    @RepeatedTest(1000)
    public void testMapping() {
        // given
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();

        var dto = LoanDto.builder()
            .id(1L)
            .userId(1L)
            .bookId(1L)
            .date(localDate)
            .time(localTime)
            .duration(1L)
            .build();

        // when
        var entity = mapper.toEntity(dto);

        // then
        assertThat(entity)
            .hasFieldOrPropertyWithValue("id", 1L)
            .hasFieldOrPropertyWithValue("userId",1L)
            .hasFieldOrPropertyWithValue("bookId", 1L)
            .hasFieldOrPropertyWithValue("date", localDate)
            .hasFieldOrPropertyWithValue("time", localTime)
            .hasFieldOrPropertyWithValue("duration",1L);
    }
}