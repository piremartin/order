package com.chj.order.service;

import com.chj.order.domain.OrderE;
import com.chj.order.service.dto.OrderDTO;

public interface OrderService {

    OrderDTO findById(Long id);

    OrderE save(OrderDTO dto);
}
