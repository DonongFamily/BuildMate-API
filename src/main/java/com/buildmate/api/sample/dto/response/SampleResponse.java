package com.buildmate.api.sample.dto.response;

import com.buildmate.api.sample.entity.Sample;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SampleResponse {

    private int sampleId;
    private String sampleName;

    public static SampleResponse of(Sample sample) {
        return SampleResponse.builder()
                .sampleId(sample.getSampleId())
                .sampleName(sample.getSampleName())
                .build();
    }
}
