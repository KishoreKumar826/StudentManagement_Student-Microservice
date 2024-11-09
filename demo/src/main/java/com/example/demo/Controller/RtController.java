package com.example.demo.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.student;
import com.example.demo.Repository.Repo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class RtController {
    @Autowired
    private Repo repo;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Kishore! welcome!";
    }
    
    
    @GetMapping("/students")
    public List<student> getAllStudent(){
        return repo.findAll();
    }
    
    
    @GetMapping("/findById")
    public ResponseEntity<student> findById(@PathVariable Integer student_Id){
      
        Optional<student> found=repo.findById(student_Id);
        if(found.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(found.get());
    }

    @PostMapping("/AddUsers")
    public ResponseEntity<student> AddStudent(@RequestBody student stud){
      
        student savedUser = repo.save(stud); // database call

        return ResponseEntity.created(URI.create(savedUser.getStudent_Id().toString())).body(savedUser);
}
}
