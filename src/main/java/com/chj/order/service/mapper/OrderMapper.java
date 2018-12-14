package com.chj.order.service.mapper;

import com.chj.order.domain.OrderE;
import com.chj.order.service.dto.OrderDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO toDTO(OrderE entity);

    OrderE toEntity(OrderDTO dto);
}
