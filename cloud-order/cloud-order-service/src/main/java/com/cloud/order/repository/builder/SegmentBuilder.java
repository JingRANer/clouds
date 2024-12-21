package com.cloud.order.repository.builder;

import com.cloud.order.domain.Segment;
import com.cloud.order.repository.po.CloudAirSegment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: SegmentBuilder
 * @create: 2024-12-15 21:10
 **/

@Mapper
public interface SegmentBuilder {

    SegmentBuilder INSTANCE = Mappers.getMapper(SegmentBuilder.class);
    Segment toSegment(CloudAirSegment cloudAirSegment);
}
