package org.zrz.ftgo.orderservice.domain;

import javax.persistence.*;
import java.util.List;

@Embeddable
public class OrderLineItems {
    @ElementCollection(targetClass = OrderLineItem.class,fetch = FetchType.LAZY)
    @CollectionTable(name="order_line_items",joinColumns = @JoinColumn(name="order_id"))
    private List<OrderLineItem> lineItems;

    public OrderLineItems(){ }
    public OrderLineItems(List<OrderLineItem> lineItems){
        this.lineItems = lineItems;
    }

    public List<OrderLineItem> getLineItems(){
        return this.lineItems;
    }
    public void setLineItems(List<OrderLineItem> lineItems){
        this.lineItems = lineItems;
    }
}
