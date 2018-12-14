package com.chj.order.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_order")
public class OrderE implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "modify_time")
    private LocalDateTime modifyTime;
}
