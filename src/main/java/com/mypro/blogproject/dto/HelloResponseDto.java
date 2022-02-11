package com.mypro.blogproject.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

@Getter //getter 메소드 자동 생성
@RequiredArgsConstructor // 선언된 모든 final이 붙은 필드가 포함된 생성자를 생성
public class HelloResponseDto {
    private final String name;
    private final String nickname;
}
