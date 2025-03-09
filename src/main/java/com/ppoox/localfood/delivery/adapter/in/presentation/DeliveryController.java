package com.ppoox.localfood.delivery.adapter.in.presentation;

import com.ppoox.localfood.delivery.application.port.in.presentation.DeliveryPresentationPort;
import com.ppoox.localfood.delivery.domain.Delivery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class DeliveryController {

    private final DeliveryPresentationPort deliveryPresentationPort;

    @PostMapping
    public ResponseEntity<Delivery> saveTest() {
        return ResponseEntity.ok(deliveryPresentationPort.save());
    }

    @GetMapping
    public ResponseEntity<List<Delivery>> getTest() {
        return ResponseEntity.ok(deliveryPresentationPort.findAll());
    }

    @PutMapping
    public ResponseEntity<Delivery> setTest() {
        return ResponseEntity.ok(deliveryPresentationPort.update());
    }
}
