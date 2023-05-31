package com.example.npospring.controller;

import com.example.npospring.entity.FacilityEntity;
import com.example.npospring.entity.MsrFailEntity;
import com.example.npospring.entity.MsrFailSeverityEntity;
import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.model.MsrFail;
import com.example.npospring.model.MsrFailSeverity;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.repository.MsrFailTypeRepo;
import com.example.npospring.service.MsrFailTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/msr_fail_type")
public class MsrFailTypeController {

    @Autowired
    MsrFailTypeService msrFailTypeService;
    @Autowired
    MsrFailTypeRepo msrFailTypeRepo;
    @PostMapping
    public ResponseEntity createData(@RequestBody MsrFailTypeEntity msrFailTypeEntity,
                                     @RequestParam Long categoryID,
                                     @RequestParam Long severityID){
        try{
            return ResponseEntity.ok(msrFailTypeService.createData(msrFailTypeEntity,categoryID,severityID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrFailTypeService.getMsrFailTypeOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrFailTypeService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrFailType msrFailType){
        try{
            return ResponseEntity.ok(msrFailTypeService.updateData(id,msrFailType));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
