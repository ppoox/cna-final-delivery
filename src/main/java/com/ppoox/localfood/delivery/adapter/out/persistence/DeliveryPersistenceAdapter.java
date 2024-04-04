package com.ppoox.localfood.delivery.adapter.out.persistence;

import com.ppoox.localfood.delivery.application.port.out.persistence.DeliveryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeliveryPersistenceAdapter implements DeliveryPersistencePort {

    private final DeliveryRepository deliveryRepository;

}
