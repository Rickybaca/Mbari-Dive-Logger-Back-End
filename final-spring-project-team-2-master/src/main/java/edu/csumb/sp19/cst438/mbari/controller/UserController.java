package edu.csumb.sp19.cst438.mbari.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.sp19.cst438.mbari.model.User;
import edu.csumb.sp19.cst438.mbari.repositories.UserRepository;
import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins ="*")
@RestController
public class UserController{
    @Autowired
    UserRepository userRepository;

    
    @ApiOperation(value = "Authentication of the username and password.")
    
    @GetMapping("/user/authenticate/{username}/{password}")
    public Boolean authentication(@PathVariable String username, @PathVariable String password) {
        Optional<User> user = userRepository.findById(username); 
        if(user.isPresent()) {
             if(user.get().getPassword().equals(password)){
                 return true;
            }
        
        }else{
            return false;
         }
        return false;
    }


    @ApiOperation(value = "Adds a user.")
    @PostMapping("/user/add")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @ApiOperation(value = "Gets all existing users.")
    @GetMapping("/user/getAll")
    public List<User> getAll() {
        List<User> result = userRepository.findAll();
        return result;
    }

    @ApiOperation(value = "Gets user by id.")
    @GetMapping("/user/get/{id}")
    public Optional<User> getProductById(@PathVariable String id) {
        Optional<User> result = userRepository.findById(id);
        return result;
    }

}