package net.guides.springboot.registrationloginspringbootsecuritythymeleaf.services;

import net.guides.springboot.registrationloginspringbootsecuritythymeleaf.models.User;
import net.guides.springboot.registrationloginspringbootsecuritythymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
