package com.example.npospring.controller;

import com.example.npospring.entity.MsrGroupEntity;
import com.example.npospring.entity.MsrTagEntity;
import com.example.npospring.entity.SourceEntity;
import com.example.npospring.model.MsrGroup;
import com.example.npospring.model.MsrTag;
import com.example.npospring.repository.MsrGroupRepo;
import com.example.npospring.service.MsrGroupService;
import com.example.npospring.service.MsrTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr_group")
public class MsrGroupController {
    @Autowired
    MsrGroupService msrGroupService;
    @Autowired
    MsrGroupRepo msrGroupRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrGroupEntity msrGroup) {
        try {
            msrGroupService.addData(msrGroup);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<MsrGroupEntity> getAll(){
        return msrGroupRepo.findAll();
    }

    @GetMapping
    public ResponseEntity getMsrGroupOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrGroupService.getMsrGroupOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrGroupService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrGroup msrGroup){
        try{
            return ResponseEntity.ok(msrGroupService.updateData(id,msrGroup));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
