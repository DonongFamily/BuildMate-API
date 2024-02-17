package com.buildmate.api.sample.entity;

import com.buildmate.api.common.BaseEntity;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Sample extends BaseEntity {
    private int sampleId;
    private String sampleName;
}
