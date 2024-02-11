package com.org.ott.services;

import com.org.ott.entity.LoginRequest;
import com.org.ott.entity.User;

public interface UserService {

    User registerUser(User user);
    boolean login(LoginRequest loginRequest);
}
