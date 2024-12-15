package com.cloud.order.repository.impl;

import com.cloud.order.repository.po.CloudAirSegment;
import com.cloud.order.mapper.CloudAirSegmentMapper;
import com.cloud.order.repository.SegmentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: SegmentRepositoryImpl
 * @create: 2024-07-15 23:34
 **/

@Service
public class SegmentRepositoryImpl implements SegmentRepository {

    @Resource
    CloudAirSegmentMapper mapper;


    @Override
    public CloudAirSegment findById(String segmentId) {
        return mapper.selectById(segmentId);
    }

    @Override
    public int save(CloudAirSegment segment) {
        if(mapper.selectById(segment.getSegmentId())!=null) {
            return mapper.updateByPrimaryKeySelective(segment);
        } else {
            return mapper.insert(segment);
        }
    }

    @Override
    public List<CloudAirSegment> findByService(String serviceId) {
        List<CloudAirSegment> cloudAirSegments = mapper.selectSegmentByServiceId(serviceId);
        cloudAirSegments.stream().map(seg->)
    }
}
