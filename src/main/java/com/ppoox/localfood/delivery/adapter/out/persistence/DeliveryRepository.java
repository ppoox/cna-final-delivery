package com.ppoox.localfood.delivery.adapter.out.persistence;

import com.ppoox.localfood.delivery.domain.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "deliveries", itemResourceRel = "delivery", path = "delivery")
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}
