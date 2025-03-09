package com.ppoox.localfood.delivery.application.port.out.persistence;

import com.ppoox.localfood.delivery.domain.Delivery;

import java.util.List;

public interface DeliveryPersistencePort {
    Delivery save();

    List<Delivery> findAll();

    Delivery update();
}
