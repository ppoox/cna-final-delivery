package com.ppoox.localfood.delivery.adapter.out.persistence;

import com.ppoox.localfood.delivery.application.port.in.presentation.DeliveryPresentationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeliveryPersistenceAdapter implements DeliveryPresentationPort {

    private final DeliveryRepository deliveryRepository;

}
