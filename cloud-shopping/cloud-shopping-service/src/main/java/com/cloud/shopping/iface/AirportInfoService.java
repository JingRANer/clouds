package com.cloud.shopping.iface;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.repository.domain.AirportEsPO;

import java.util.List;

/**
 * @author: jingran
 * @Desc: 查询全部机场信息
 * @ClassName: AirportInfoService
 * @create: 2024-05-29 10:26
 **/

public interface AirportInfoService {

    List<AirportEsPO> getAirportByStr(String reqStr);

    SingleResponse insertAllAirportCacheBean();

    List<AirportEsPO> queryAllAirportList();
}
