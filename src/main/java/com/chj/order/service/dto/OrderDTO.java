package com.chj.order.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private Long id;

    private Long userId;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;
}
