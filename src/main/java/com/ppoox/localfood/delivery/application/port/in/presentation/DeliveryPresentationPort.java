package com.ppoox.localfood.delivery.application.port.in.presentation;

import com.ppoox.localfood.delivery.domain.Delivery;

import java.util.List;

public interface DeliveryPresentationPort {
    Delivery save();

    List<Delivery> findAll();

    Delivery update();
}
