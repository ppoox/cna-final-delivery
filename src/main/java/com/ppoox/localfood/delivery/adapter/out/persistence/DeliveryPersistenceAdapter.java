package com.ppoox.localfood.delivery.adapter.out.persistence;

import com.ppoox.localfood.delivery.application.port.out.persistence.DeliveryPersistencePort;
import com.ppoox.localfood.delivery.domain.Delivery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DeliveryPersistenceAdapter implements DeliveryPersistencePort {

    private final DeliveryRepository deliveryRepository;

    @Override
    public Delivery save() {
        return deliveryRepository.save(new Delivery());
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery update() {
        Delivery delivery = deliveryRepository.findById(1L).orElseThrow();
        delivery.setStatus();
        return delivery;
    }
}
