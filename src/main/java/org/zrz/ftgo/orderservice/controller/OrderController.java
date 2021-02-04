package org.zrz.ftgo.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zrz.ftgo.orderservice.domain.Order;
import org.zrz.ftgo.orderservice.domain.Restaurant;
import org.zrz.ftgo.orderservice.repository.OrderRepository;
import org.zrz.ftgo.orderservice.repository.RestaurantRepository;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderRepository orderRepository;
    private RestaurantRepository restaurantRepository;

    public OrderController(OrderRepository orderRepository,RestaurantRepository restaurantRepository){
        this.orderRepository = orderRepository;
        this.restaurantRepository=restaurantRepository;
    }


    @GetMapping
    public Set<Order> getOrders(){
        Restaurant restaurant = restaurantRepository.findById(1L).orElseThrow(()->new RuntimeException());
        return restaurant.getOrders();
        //Order order = orderRepository.findById(1L).orElseThrow(()->new RuntimeException());
        //return order;
    }
}
