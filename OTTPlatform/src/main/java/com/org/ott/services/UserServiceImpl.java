package com.org.ott.services;

import com.org.ott.entity.LoginRequest;
import com.org.ott.entity.User;
import com.org.ott.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = null;


    @Override
    //user creation
    public User registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("User is already exists!");
        }
        return userRepository.save(user);
    }

    @Override
    public boolean login(LoginRequest loginRequest) {
        User currUser = userRepository.findByEmail(loginRequest.getEmail());
        return currUser != null && loginRequest.getPassword().matches(currUser.getPassword());
    }
}
