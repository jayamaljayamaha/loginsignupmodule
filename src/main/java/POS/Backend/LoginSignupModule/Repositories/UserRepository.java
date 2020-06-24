package POS.Backend.LoginSignupModule.Repositories;

import POS.Backend.LoginSignupModule.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmail(String email);
}
