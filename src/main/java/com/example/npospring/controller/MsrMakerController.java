package com.example.npospring.controller;

import com.example.npospring.entity.MsrMarkerEntity;
import com.example.npospring.entity.MsrRejectionEntity;
import com.example.npospring.model.MsrMarker;
import com.example.npospring.model.MsrRegection;
import com.example.npospring.service.MsrMarkerService;
import com.example.npospring.service.MsrRejectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_marker")
public class MsrMakerController {

    @Autowired
    private MsrMarkerService msrMarkerService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrMarkerEntity msrMarkerEntity){
        try{
            msrMarkerService.addData(msrMarkerEntity);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getMsrMarkerOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrMarkerService.getMsrMarkerOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrMarkerService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody MsrMarker msrMarker){

        try{
            return ResponseEntity.ok(msrMarkerService.updateData(id,msrMarker));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
