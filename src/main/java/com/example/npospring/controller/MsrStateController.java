package com.example.npospring.controller;

import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrFailCategoryEntity;
import com.example.npospring.entity.MsrStateEntity;
import com.example.npospring.model.MsrFailCategory;
import com.example.npospring.model.MsrState;
import com.example.npospring.repository.MsrStateRepo;
import com.example.npospring.service.MsrFailCategoryService;
import com.example.npospring.service.MsrStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr_state")
public class MsrStateController {
    @Autowired
    MsrStateService msrStateService;
    @Autowired
    private MsrStateRepo msrStateRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrStateEntity msrStateEntity) {
        try {
            msrStateService.addData(msrStateEntity);
            return ResponseEntity.ok("Запись добавлена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrStateOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrStateService.getMsrStateOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<MsrStateEntity> getAll(){
        return msrStateRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrStateService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody MsrState msrState){
        try{
            return ResponseEntity.ok(msrStateService.updateData(id,msrState));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
