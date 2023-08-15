package com.eLibrary.loan;

import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface LoanMapper {

    LoanDto toDto(LoanEntity entity);

    List<LoanDto> toDtos(List<LoanEntity> entities);

    LoanEntity toEntity(LoanDto dto);
}