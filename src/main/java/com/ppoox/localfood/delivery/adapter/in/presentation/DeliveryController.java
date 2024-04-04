package com.ppoox.localfood.delivery.adapter.in.presentation;

import com.ppoox.localfood.delivery.application.port.in.presentation.DeliveryPresentationPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/delivery")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryPresentationPort deliveryPresentationPort;

}
