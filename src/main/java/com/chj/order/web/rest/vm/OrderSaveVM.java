package com.chj.order.web.rest.vm;
import com.chj.order.service.dto.OrderDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderSaveVM {

    private Long userId;

    public static OrderDTO toDTO(OrderSaveVM vm){
        OrderDTO orderDTO= new OrderDTO();
        orderDTO.setUserId(vm.getUserId());
        orderDTO.setCreateTime(LocalDateTime.now());
        return orderDTO;

    }
}
