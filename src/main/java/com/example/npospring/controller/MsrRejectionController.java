package com.example.npospring.controller;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrRejectionEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.model.MsrRegection;
import com.example.npospring.service.MsrDescService;
import com.example.npospring.service.MsrRejectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_rejection")
public class MsrRejectionController {
    @Autowired
    private MsrRejectionService msrRejectionService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrRejectionEntity msrRejectionEntity){
        try{
            msrRejectionService.addData(msrRejectionEntity);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getMsrRejectionOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrRejectionService.getMsrRejectionOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrRejectionService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody MsrRegection msrRegection){

        try{
            return ResponseEntity.ok(msrRejectionService.updateData(id,msrRegection));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
