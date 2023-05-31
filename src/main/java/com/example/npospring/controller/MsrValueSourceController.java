package com.example.npospring.controller;

import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.entity.MsrValueSourceEntity;
import com.example.npospring.model.MsrTag;
import com.example.npospring.model.MsrValueSource;
import com.example.npospring.service.MsrTagService;
import com.example.npospring.service.MsrValueSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_value_source")
public class MsrValueSourceController {

    @Autowired
    MsrValueSourceService msrValueSourceService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrValueSourceEntity msrValueSource) {
        try {
            msrValueSourceService.addData(msrValueSource);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrTagOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrValueSourceService.getMsrValueSourceOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrValueSourceService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrValueSource msrValueSource){
        try{
            return ResponseEntity.ok(msrValueSourceService.updateData(id,msrValueSource));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
