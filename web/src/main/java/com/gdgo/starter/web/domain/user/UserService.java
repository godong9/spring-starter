package com.gdgo.starter.web.domain.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gdgo.starter.web.infra.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findUserByUserId(Long userId) {
        return userRepository.findById(userId);
    }
}
