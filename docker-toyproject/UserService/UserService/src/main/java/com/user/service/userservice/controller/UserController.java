package com.user.service.userservice.controller;

import com.user.service.userservice.domain.User;
import com.user.service.userservice.service.UserService;
import com.user.service.userservice.type.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/user/create")
    public ResponseDto<Integer> home(@RequestParam Map<String,String> user) {
        try {
            userService.saveUser(user);
            return new ResponseDto<Integer>(HttpStatus.OK.value(),200);
        }catch(IllegalArgumentException e){
            return new ResponseDto<Integer>(HttpStatus.NO_CONTENT.value(), 404);
        }

    }

    @GetMapping("/user")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

}
