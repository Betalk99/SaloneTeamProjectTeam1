package com.team1.Salone;

import java.math.BigDecimal;

enum OrderState {PENDING, SHIPPED, DELIVERED, CANCELLED}

public class Order {
    private BigDecimal advancePayment;
    private boolean isPaid;
    private OrderState orderState;
}
