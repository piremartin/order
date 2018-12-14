package com.chj.order.service.impl;

import com.chj.order.domain.OrderE;
import com.chj.order.repository.OrderRepository;
import com.chj.order.service.OrderService;
import com.chj.order.service.dto.OrderDTO;
import com.chj.order.service.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public OrderE save(OrderDTO dto) {
        OrderE entity = orderMapper.toEntity(dto);
        return orderRepository.save(entity);
    }
}
