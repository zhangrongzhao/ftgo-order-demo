package org.zrz.ftgo.orderservice.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String state;

    public Address(){}
    public Address(String state){ this.state=state; }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
