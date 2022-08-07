package com.ap.ap;


import com.ap.ap.models.User;
import com.ap.ap.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    UserRepo repo;

    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "NuncaMeEntregaronLaPC";
        String encodePassword = passwordEncoder.encode(rawPassword);
        User newUser = new User("JulianDiRocco@gmail.com", encodePassword);
        User savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
}
