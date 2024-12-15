package com.cloud.order.repository;

import com.cloud.order.domain.Segment;
import com.cloud.order.repository.po.CloudAirSegment;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: SegmentRepository
 * @create: 2024-07-15 23:18
 **/

public interface SegmentRepository {

    CloudAirSegment findById(String segmentId);

    int save(CloudAirSegment segment);

    List<Segment> findByService(String serviceId);
}
