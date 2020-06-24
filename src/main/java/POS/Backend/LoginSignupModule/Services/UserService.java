package POS.Backend.LoginSignupModule.Services;

import POS.Backend.LoginSignupModule.Models.User;
import POS.Backend.LoginSignupModule.Models.UserDetailsModel;
import POS.Backend.LoginSignupModule.Repositories.UserRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email){
        User user = null;
        try{
            user = userRepository.findByEmail(email);
            System.out.println(user.getId());
        } catch (ObjectNotFoundException e){
            System.out.println(e);
        }
        return new UserDetailsModel(user);
    }
}
