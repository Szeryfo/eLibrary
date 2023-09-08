package com.eLibrary.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.RepeatedTest;

class UserMapperTest {

    private final UserMapper mapper = new UserMapperImpl();

    @RepeatedTest(10)
    public void testMapping() {
        // given
        var dto = UserDto.builder()
            .id(1L)
            .name("name")
            .password("password")
            .build();

        // when
        var entity = mapper.toEntity(dto);

        // then
        assertThat(entity)
            .hasFieldOrPropertyWithValue("id", 1L)
            .hasFieldOrPropertyWithValue("name","name")
            .hasFieldOrPropertyWithValue("password","password");
    }
}