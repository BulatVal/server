package com.example.npospring.controller;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.UserEntity;
import com.example.npospring.model.Msr;
import com.example.npospring.model.User;
import com.example.npospring.repository.MsrRepo;
import com.example.npospring.repository.UserRepo;
import com.example.npospring.service.MsrService;
import com.example.npospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;


    @PostMapping
    public ResponseEntity createData(@RequestBody UserEntity userEntity,
                                     @RequestParam Long roleID)
    {
        try{
            return ResponseEntity.ok(userService.createData(userEntity,roleID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(userService.getSourceOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<UserEntity> getAll(){
        return userRepo.findAll();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(userService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody User user){
        try{
            return ResponseEntity.ok(userService.updateData(id,user));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
