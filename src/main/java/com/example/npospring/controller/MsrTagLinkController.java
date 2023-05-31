package com.example.npospring.controller;

import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.entity.MsrTagLinkEntity;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.model.MsrTagLink;
import com.example.npospring.service.MsrFailTypeService;
import com.example.npospring.service.MsrTagLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_tag_link")
public class MsrTagLinkController {
    @Autowired
    MsrTagLinkService msrTagLinkService;
    @PostMapping
    public ResponseEntity createData(@RequestBody MsrTagLinkEntity msrTagLinkEntity,
                                     @RequestParam Long tagID,
                                     @RequestParam Long typeID){
        try{
            return ResponseEntity.ok(msrTagLinkService.createData(msrTagLinkEntity,tagID,typeID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrTagLinkOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrTagLinkService.getMsrTagLinkOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrTagLinkService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrTagLink msrTagLink){
        try{
            return ResponseEntity.ok(msrTagLinkService.updateData(id,msrTagLink));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

}
