package ac.za.cput.companymanager.repository;

import ac.za.cput.companymanager.domain.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository  extends CrudRepository<Supplier, Long> {

   // public Supplier findCode(Integer code);
}

