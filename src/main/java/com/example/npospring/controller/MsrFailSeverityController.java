package com.example.npospring.controller;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrFailSeverityEntity;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrFailSeverity;
import com.example.npospring.repository.MsrFailSeverityRepo;
import com.example.npospring.service.MsrFailCategoryService;
import com.example.npospring.service.MsrFailSeverityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_fail_severity")
public class MsrFailSeverityController {
    @Autowired
    MsrFailSeverityService msrFailSeverityService;

    @PostMapping
    public ResponseEntity getData(@RequestBody MsrFailSeverityEntity msrFailSeverityEntity) {
        try {
            msrFailSeverityService.addData(msrFailSeverityEntity);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailSeverityOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrFailSeverityService.getMsrFailSeverityOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrFailSeverityService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrFailSeverity msrFailSeverity){
        try{
            return ResponseEntity.ok(msrFailSeverityService.updateData(id,msrFailSeverity));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
