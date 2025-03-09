package com.ppoox.localfood.delivery.application.service;

import com.ppoox.localfood.delivery.application.port.in.presentation.DeliveryPresentationPort;
import com.ppoox.localfood.delivery.application.port.out.persistence.DeliveryPersistencePort;
import com.ppoox.localfood.delivery.domain.Delivery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliveryService implements DeliveryPresentationPort {

    private final DeliveryPersistencePort deliveryPersistencePort;


    @Override
    public Delivery save() {
        return deliveryPersistencePort.save();
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryPersistencePort.findAll();
    }

    @Transactional
    @Override
    public Delivery update() {
        return test();
    }

    public Delivery test() {
        return deliveryPersistencePort.update();
    }
}
