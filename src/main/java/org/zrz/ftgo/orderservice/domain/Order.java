package org.zrz.ftgo.orderservice.domain;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    private long id;

    @Version
    private long version;

    @Column(name="restaurant_id")
    private Long restaurantId;

    @Column(name="customer_id")
    private Long customerId;

    @Embedded
    private OrderLineItems orderLineItems;

    @Embedded
    private DeliveryInformation deliveryInformation;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public OrderLineItems getOrderLineItems() {
        return orderLineItems;
    }
    public void setOrderLineItems(OrderLineItems orderLineItems) {
        this.orderLineItems = orderLineItems;
    }
}
