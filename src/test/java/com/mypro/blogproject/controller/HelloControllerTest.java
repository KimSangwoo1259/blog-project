package com.mypro.blogproject.controller;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(SpringExtension.class) //테스트 할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행
@WebMvcTest(controllers = HelloController.class) // Web에 집중할 수 있는 어노테이션 / Q. 무슨말이지?
public class HelloControllerTest {

    @Autowired //빈 주입
    private MockMvc mvc; // 웹 API를 테스트 할 때 사용 (서블릿 컨테이너 구동 없이, 모의 HTTP 서블릿 요청을 전송)

    @Test
    public void hello_Test() throws Exception {
        String hello = "hello Spring Boot!";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) // 응답 상태 코드가 정상(200)인지 확인
                .andExpect(content().string(hello)); // mvc.perform 의 결과를 검증

    }

}
