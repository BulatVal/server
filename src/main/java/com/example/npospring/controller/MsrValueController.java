package com.example.npospring.controller;

import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.entity.MsrValueEntity;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.model.MsrValue;
import com.example.npospring.repository.MsrValueRepo;
import com.example.npospring.service.MsrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr_value")

public class MsrValueController {

    @Autowired
    private MsrValueService msrValueService;
    @Autowired
    private MsrValueRepo msrValueRepo;

    @PostMapping
    public ResponseEntity createData(@RequestBody MsrValueEntity msrValueEntity,
                                     @RequestParam Long msrID,
                                     @RequestParam Long valueTypeID){
        try{
            return ResponseEntity.ok(msrValueService.createData(msrValueEntity,msrID,valueTypeID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrValueService.getMsrValueOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<MsrValueEntity> getAll(){
        return msrValueRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrValueService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrValue msrValue){
        try{
            return ResponseEntity.ok(msrValueService.updateData(id,msrValue));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
