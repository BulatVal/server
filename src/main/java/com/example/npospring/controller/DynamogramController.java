package com.example.npospring.controller;

import com.example.npospring.entity.DynamogramEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.repository.DynamogramRepo;
import com.example.npospring.service.DynamogramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/dynamogram")
public class DynamogramController {

    @Autowired
    private DynamogramService dynamogramService;
    @Autowired
    private DynamogramRepo dynamogramRepo;

    @PostMapping
    public ResponseEntity createData(@RequestBody DynamogramEntity dynamogramEntity,
                                     @RequestParam Long msrID )
    {
        try{
            return ResponseEntity.ok(dynamogramService.addData(dynamogramEntity,msrID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getDynamogramOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(dynamogramService.getDynamogramOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<DynamogramEntity> getAll(){
        return dynamogramRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(dynamogramService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
