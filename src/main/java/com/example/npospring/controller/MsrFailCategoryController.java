package com.example.npospring.controller;

import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrValueSourceEntity;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrValueSource;
import com.example.npospring.service.MsrFailCategoryService;
import com.example.npospring.service.MsrValueSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_fail_category")
public class MsrFailCategoryController {
    @Autowired
    MsrFailCategoryService msrFailCategoryService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrFailCategoryEntity msrFailCategoryEntity) {
        try {
            msrFailCategoryService.addData(msrFailCategoryEntity);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailCategoryOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrFailCategoryService.getMsrFailCategoryOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrFailCategoryService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrFailCategory msrFailCategory){
        try{
            return ResponseEntity.ok(msrFailCategoryService.updateData(id,msrFailCategory));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
