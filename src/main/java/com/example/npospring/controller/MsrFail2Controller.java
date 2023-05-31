package com.example.npospring.controller;

import com.example.npospring.entity.MsrFail2Entity;
import com.example.npospring.entity.MsrValueEntity;
import com.example.npospring.model.MsrFail2;
import com.example.npospring.model.MsrValue;
import com.example.npospring.service.MsrFail2Service;
import com.example.npospring.service.MsrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_fail2")
public class MsrFail2Controller {
    @Autowired
    private MsrFail2Service msrFail2Service;

    @PostMapping
    public ResponseEntity createData(@RequestBody MsrFail2Entity msrFail2Entity,
                                     @RequestParam Long msrID,
                                     @RequestParam Long failTypeID){
        try{
            return ResponseEntity.ok(msrFail2Service.createData(msrFail2Entity,msrID,failTypeID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrFail2Service.getMsrFail2One(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrFail2Service.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrFail2 msrFail2){
        try{
            return ResponseEntity.ok(msrFail2Service.updateData(id,msrFail2));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
