package com.org.ott.controller;

import com.org.ott.entity.LoginRequest;
import com.org.ott.entity.User;
import com.org.ott.services.UserService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Data
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService = null;

    //! http://localhost:8082/user/register
    @PostMapping("register")
    public ResponseEntity<User> registerUser(
            @RequestBody User user
    ) {
        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);
    }

    //! http://localhost:8082/user/login
    @PostMapping("login")
    public ResponseEntity<Object> loginUser(
            @RequestBody LoginRequest loginRequest
    ) {
        boolean isLogin = userService.login(loginRequest);

        if (isLogin) {
            return ResponseEntity.ok().body(Map.of("message", "Login successful"));
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("error", "Invalid email or password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }

    @RequestMapping("/")
    public String host() {
        return "index.jsp";
    }
}
