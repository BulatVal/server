package com.example.npospring.controller;


import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrTag;
import com.example.npospring.service.MsrTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_tag")
public class MsrTagController {
    @Autowired
    MsrTagService msrTagService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrTagEntity msrTag) {
        try {
            msrTagService.addData(msrTag);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrTagOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrTagService.getMsrTagOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrTagService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrTag msrTag){
        try{
            return ResponseEntity.ok(msrTagService.updateData(id,msrTag));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

}
