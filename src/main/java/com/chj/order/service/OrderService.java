package com.chj.order.service;

import com.chj.order.domain.OrderE;
import com.chj.order.service.dto.OrderDTO;

public interface OrderService {

    OrderE save(OrderDTO dto);
}
