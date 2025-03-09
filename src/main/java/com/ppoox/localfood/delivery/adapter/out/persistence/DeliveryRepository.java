package com.ppoox.localfood.delivery.adapter.out.persistence;

import com.ppoox.localfood.delivery.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(exported = false, collectionResourceRel = "deliveries", itemResourceRel = "delivery", path = "delivery")
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
