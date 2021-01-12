package com.application.controller;
import com.application.models.UserFunctions;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.HashMap;

@RestController
public class TestController {
    //Task -1
    @GetMapping("/") // Annotation maps HTTP GET requests onto specific handler methods
    public String get() {
        return "Hello world";
    }
    //Task-2
    @PostMapping("/")
    public String post(@RequestBody String value) {
        return "Passed message" + value;
    }
    //Task-3
    HashMap<Integer, UserFunctions> userDetailsList = new HashMap<>();


    @GetMapping("/user") // To retrieve the information that is stored

    public String retrieveAllUser() {
        if (userDetailsList.isEmpty()) {
            return "No details Found!";
        } else {
            return "Retrieved information:\n" + " " + userDetailsList.toString();
        }

    }

    @PostMapping("/user/add")
    public String addUser(@RequestBody UserFunctions user) {

        userDetailsList.put(user.getId(), user);
        return "User Details:" + userDetailsList.toString();

    }

    @PutMapping("/user/update/{id}")
    public String updatePostionById(@PathVariable int id, @RequestBody String position) {
        try {
            if (userDetailsList.containsKey(id)) {
                UserFunctions user = userDetailsList.get(id); // getting the details in pre-existing id
                user.setPosition(position);// setting new postion with the access of the pre-exiting detail
                userDetailsList.put(id, user);
                return "Update Success";
            }
            return "Check the User id entered";
        } catch (Exception e) {
            return "Try Again";
        }
    }
    @DeleteMapping("/users/delete/{id}")

    public String deleteUserById(@PathVariable int id){
            userDetailsList.remove(id);
            return "Removed the user with id:" + id;

    }
}



 





