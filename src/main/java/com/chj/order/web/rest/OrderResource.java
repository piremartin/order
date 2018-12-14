package com.chj.order.web.rest;

import com.chj.order.domain.OrderE;
import com.chj.order.service.OrderService;
import com.chj.order.service.dto.OrderDTO;
import com.chj.order.service.mapper.OrderMapper;
import com.chj.order.web.rest.vm.OrderSaveVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderResource {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @PostMapping("/save")
    public ResponseEntity<OrderE> save(@Valid @RequestBody OrderSaveVM vm){
        OrderDTO dto = OrderSaveVM.toDTO(vm);
        OrderE savedE = orderService.save(dto);
        return ResponseEntity.ok(savedE);
    }
}
