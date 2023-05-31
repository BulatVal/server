package com.example.npospring.controller;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrValueTypeEntity;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrValueType;
import com.example.npospring.repository.MsrValueTypeRepo;
import com.example.npospring.service.MsrFailCategoryService;
import com.example.npospring.service.MsrValueTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr_value_type")
public class MsrValueTypeController {

    @Autowired
    MsrValueTypeService msrValueTypeService;
    @Autowired
    private MsrValueTypeRepo msrValueTypeRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrValueTypeEntity msrValueTypeEntity) {
        try {
            msrValueTypeService.addData(msrValueTypeEntity);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrValueTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrValueTypeService.getMsrValueTypeOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<MsrValueTypeEntity> getAll(){
        return msrValueTypeRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrValueTypeService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrValueType msrValueType){
        try{
            return ResponseEntity.ok(msrValueTypeService.updateData(id,msrValueType));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
