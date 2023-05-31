package com.example.npospring.controller;

import com.example.npospring.entity.SourceEntity;
import com.example.npospring.entity.UserRolesEntity;
import com.example.npospring.model.Source;
import com.example.npospring.model.UserRoles;
import com.example.npospring.repository.SourceRepo;
import com.example.npospring.repository.UserRolesRepo;
import com.example.npospring.service.SourceService;
import com.example.npospring.service.UserRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("user_roles")
public class UserRolesController {

    @Autowired
    private UserRolesService userRolesService;
    @Autowired
    private UserRolesRepo userRolesRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody UserRolesEntity userRolesEntity){
        try{
            userRolesService.addData(userRolesEntity);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getRoleOne(@RequestParam Long id)  {
        try{
            return ResponseEntity.ok(userRolesService.getSourceOne(id));

        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<UserRolesEntity> getAll(){
        return userRolesRepo.findAll();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(userRolesService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody UserRoles userRoles){

        try{
            return ResponseEntity.ok(userRolesService.updateData(id,userRoles));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
