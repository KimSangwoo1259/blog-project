package com.mypro.blogproject.dto;


import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "sangwoo";
        String nickname = "good";

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, nickname); // 필드 포함 생성자 생성

        //then
        Assertions.assertThat(helloResponseDto.getName()).isEqualTo(name);
        Assertions.assertThat(helloResponseDto.getNickname()).isEqualTo(nickname);
    }
}
