package org.zrz.ftgo.orderservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.zrz.ftgo.orderservice.domain.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
}
