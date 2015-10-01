package ac.za.cput.companymanager.repository;

import ac.za.cput.companymanager.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
