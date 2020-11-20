package com.bellacore.eshopping.auth;
import com.bellacore.eshopping.entity.User;
import com.bellacore.eshopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import static com.bellacore.eshopping.config.security.ApplicationUserRole.*;


@Service
public class ApplicationUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new ApplicationUser(
                ADMIN.getGrantedAuthorities(),
                passwordEncoder.encode(user.getPassword()),
                user.getUsername(),
                true,
                true,
                true,
                true);
    }
}
