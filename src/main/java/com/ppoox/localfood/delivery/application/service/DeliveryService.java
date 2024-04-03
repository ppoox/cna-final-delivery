package com.ppoox.localfood.delivery.application.service;

import com.ppoox.localfood.delivery.application.port.in.presentation.DeliveryPresentationPort;
import com.ppoox.localfood.delivery.application.port.out.persistence.DeliveryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService implements DeliveryPresentationPort {

    private final DeliveryPersistencePort deliveryPersistencePort;

}
