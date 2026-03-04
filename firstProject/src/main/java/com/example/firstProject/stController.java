package com.example.firstProject;

import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;

@RestController
public class stController {

    LinkedList<Student> list1=new LinkedList();

    @PostMapping("/linkWork")
    public String addUser(@RequestBody Student s1){
        list1.add(s1);
        return "User "+s1.getName()+" Added Successfully!";
    }

    @GetMapping("/linkWork")
    public LinkedList<Student> userdata(){
        return list1;
    }
}
