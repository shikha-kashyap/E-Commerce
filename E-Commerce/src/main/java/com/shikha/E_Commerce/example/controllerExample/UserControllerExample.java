package com.shikha.E_Commerce.example.controllerExample;


import com.shikha.E_Commerce.entity.User;
import com.shikha.E_Commerce.example.serviceExample.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1. add @RestController
// tells spring to return data in json format
// 1.5. define the mapping or url for this controller
@RestController
@RequestMapping("/api/v1/users")
public class UserControllerExample {

    // 2. create a reference to the userService
    // create the Service is service package
    private final UserService userService;

    // 3. create a constructor and take a UserService as argument
    // adding @Autowired when using constructor is optional
    @Autowired
    public UserControllerExample(UserService userService){
        this.userService = userService;
    }

    // 4. Now we create the mappings for the crud operations
    // a. get- getOne user, getAll users
    // b. post- save or post a user
    // c. put- update one user
    // d. delete- delete one user

    // get all users mapping
    // returns a list of all users
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // gets one user
    // @path variable is used to extract the userid from url
    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return userService.getUserById(userId);
    }

    // post mapping
    // add the user to the database
    // @RequestBody is used to get form data
    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    // put mapping
    // used to update a user whose id is obtained using the Path variable
    // the changes are obtained using the @RequestBody from the form data
    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable int id){
        return userService.update(id, user);
    }

    // delete mapping
    // deletes the user using their id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }


}
