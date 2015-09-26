package ac.za.cput.companymanager.repository;

import ac.za.cput.companymanager.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yusraAdmin on 9/25/2015.
 */
public interface UserRepository extends CrudRepository<User, String> {
    }

