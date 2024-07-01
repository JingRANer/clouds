package com.cloud.shopping.repository.iface;

import com.cloud.shopping.dao.AirportCacheBean;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportInfoRepository
 * @create: 2024-06-20 17:59
 **/

public interface AirportInfoRepository {

    List<AirportCacheBean> getAllAirportCacheBean();
}
