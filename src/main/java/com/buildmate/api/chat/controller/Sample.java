package com.buildmate.api.chat.controller;

import com.buildmate.api.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/chat")
public class Sample {

    @GetMapping("/test")
    public ApiResponse<String> test() {
        log.info("테스트 용");
        return ApiResponse.ok("잘됨");
    }
}
