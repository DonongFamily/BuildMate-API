package com.buildmate.api.sample.controller;

import com.buildmate.api.common.ApiResponse;
import com.buildmate.api.sample.dto.request.SampleRequest;
import com.buildmate.api.sample.dto.response.SampleResponse;
import com.buildmate.api.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping
    public ApiResponse<String> test() {
        log.info("테스트 용");
        return ApiResponse.ok("잘됨");
    }

    @GetMapping("/sampleList")
    public ApiResponse<List<SampleResponse>> dbTest() {
        List<SampleResponse> sampleList = sampleService.getSampleList();
        return ApiResponse.ok(sampleList);
    }

    @GetMapping("/sample")
    public ApiResponse<SampleResponse> dbTest(@RequestBody SampleRequest sampleRequest) {
        SampleResponse sample = sampleService.getSample(sampleRequest.getSampleId());
        return ApiResponse.ok(sample);
    }
}
