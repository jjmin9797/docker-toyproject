package com.user.service.userservice.service;

import com.user.service.userservice.domain.User;
import com.user.service.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    public void saveUser(Map<String,String> user) {
        User newUser = new User();
        newUser.setUserName(user.get("username"));
        newUser.setAge(user.get("age"));
        userRepository.save(newUser);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
