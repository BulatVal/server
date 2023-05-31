package com.example.npospring.controller;

import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.entity.MsrTypeEntity;
import com.example.npospring.entity.SourceEntity;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.model.MsrType;
import com.example.npospring.repository.MsrTypeRepo;
import com.example.npospring.service.MsrFailTypeService;
import com.example.npospring.service.MsrTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr_type")
public class MsrTypeController {
    @Autowired
    MsrTypeService msrTypeService;
    @Autowired
    private MsrTypeRepo msrTypeRepo;
    @PostMapping
    public ResponseEntity createData(@RequestBody MsrTypeEntity msrTypeEntity,
                                     @RequestParam Long groupID){
        try{
            return ResponseEntity.ok(msrTypeService.createData(msrTypeEntity,groupID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrFailTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrTypeService.getMsrTypeOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<MsrTypeEntity> getAll(){
        return msrTypeRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrTypeService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrType msrType){
        try{
            return ResponseEntity.ok(msrTypeService.updateData(id,msrType));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
