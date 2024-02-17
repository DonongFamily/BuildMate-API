package com.buildmate.api.sample.service;

import com.buildmate.api.sample.dto.response.SampleResponse;
import com.buildmate.api.sample.entity.Sample;
import com.buildmate.api.sample.repository.SampleMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleMapper sampleMapper;

    /**
     * List 받기
     */
    public List<SampleResponse> getSampleList() {
        return sampleMapper.findAllSamples().stream()
                .map(SampleResponse::of)
                .collect(Collectors.toList());
    }

    /**
     * id값으로 찾기
     */
    public SampleResponse getSample(int id) {
        Sample sample = sampleMapper.findSample(id);
        return SampleResponse.of(sample);
    }
}
