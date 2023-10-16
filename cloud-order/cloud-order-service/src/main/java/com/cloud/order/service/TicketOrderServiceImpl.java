package com.cloud.order.service;

import com.cloud.order.domain.RanAirOrder;
import com.cloud.order.mapper.RanAirOrderMapper;
import com.cloud.order.service.iface.TicketOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ticketOrderService")
public class TicketOrderServiceImpl implements TicketOrderService {

    @Resource
    RanAirOrderMapper ranAirOrderMapper;

    @Override
    public RanAirOrder getRanAirOrder(Long id) {
        return ranAirOrderMapper.selectByPrimaryKey(id);
    }
}
