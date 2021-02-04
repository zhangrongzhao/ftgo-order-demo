package org.zrz.ftgo.orderservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.zrz.ftgo.orderservice.domain.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {

}
