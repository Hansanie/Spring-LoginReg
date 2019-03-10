package net.guides.springboot.registrationloginspringbootsecuritythymeleaf.repository;

import net.guides.springboot.registrationloginspringbootsecuritythymeleaf.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
