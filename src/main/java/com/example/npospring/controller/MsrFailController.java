package com.example.npospring.controller;

import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrFailEntity;
import com.example.npospring.model.MsrFail;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.service.MsrFailCategoryService;
import com.example.npospring.service.MsrFailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_fail")
public class MsrFailController {
    @Autowired
    MsrFailService msrFailService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrFailEntity msrFailEntity) {
        try {
            msrFailService.addData(msrFailEntity);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrFailService.getMsrFailOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrFailService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrFail msrFail){
        try{
            return ResponseEntity.ok(msrFailService.updateData(id,msrFail));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
