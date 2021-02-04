package org.zrz.ftgo.orderservice.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="order_service_restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="restaurant_id")
    public Set<Order> orders;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Order> getOrders() {
        return orders;
    }
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
