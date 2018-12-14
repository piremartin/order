package com.chj.order.repository;

import com.chj.order.domain.OrderE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderE, Long> {
}
