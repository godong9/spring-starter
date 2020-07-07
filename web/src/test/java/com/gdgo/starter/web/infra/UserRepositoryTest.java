package com.gdgo.starter.web.infra;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gdgo.starter.web.domain.user.User;

public class UserRepositoryTest extends AbstractRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        User user = User.builder()
                        .name("testName")
                        .email("test@test.com")
                        .password("test")
                        .build();
        userRepository.save(user);
    }

    @Test
    void findByName() {
        User user = userRepository.findByName("testName").get();

        Assertions.assertNotNull(user.getUserId());
        Assertions.assertNotNull(user.getEmail());
        Assertions.assertNotNull(user.getPassword());
        Assertions.assertNotNull(user.getCreatedAt());
        Assertions.assertNotNull(user.getUpdatedAt());
    }
}
