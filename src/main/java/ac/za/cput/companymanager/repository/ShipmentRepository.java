package ac.za.cput.companymanager.repository;

import ac.za.cput.companymanager.domain.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment,Long> {
}
