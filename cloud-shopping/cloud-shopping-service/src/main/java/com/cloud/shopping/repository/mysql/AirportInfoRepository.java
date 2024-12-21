package com.cloud.shopping.repository.mysql;

import com.cloud.shopping.dao.AirportCacheBean;
import com.cloud.shopping.repository.domain.AirportPO;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportInfoRepository
 * @create: 2024-06-20 17:59
 **/

public interface AirportInfoRepository {

    List<AirportPO> getAllAirportCacheBean();
}
