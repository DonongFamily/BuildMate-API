package com.buildmate.api.sample.repository;

import com.buildmate.api.sample.entity.Sample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SampleMapper {

    List<Sample> findAllSamples();
    Sample findSample(@Param("sampleId") int sampleId);
}
