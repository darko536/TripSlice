package com.Darko.TripSlice;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }

    record NewUserRequest(
            String name,
            String email,
            String password
    ){}

    @PostMapping
    public void addUser(@RequestBody NewUserRequest request){
        User user = new User();
        user.setEmail(request.email);
        user.setName(request.name);
        user.setPassword(request.password);
        userRepository.save(user);
    }

    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable("userId") Integer id){
        userRepository.deleteById(id);
    }

}
