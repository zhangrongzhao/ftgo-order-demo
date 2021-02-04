package org.zrz.ftgo.orderservice.domain;

import javax.persistence.*;

@Embeddable
public class DeliveryInformation {
    @Embedded
    @AttributeOverrides(value={
            @AttributeOverride(name="state",column = @Column(name="delivery_state"))
    })
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
