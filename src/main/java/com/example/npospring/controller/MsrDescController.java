package com.example.npospring.controller;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.repository.MsrDescRepo;
import com.example.npospring.service.MsrDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msr_desc")
public class MsrDescController {

    @Autowired
    private MsrDescService msrDescService;
    @PostMapping
    public ResponseEntity getData(@RequestBody MsrDescEntity msrDesc,
                                  @RequestParam Long msrID){
        try{
            msrDescService.addData(msrDesc,msrID);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getMsrDescOne(@RequestParam Long id) throws MsrDescNotFoundException {
        try{
            return ResponseEntity.ok(msrDescService.getMsrDescOne(id));
        } catch(MsrDescNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrDescService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody MsrDesc msrDesc){

        try{
            return ResponseEntity.ok(msrDescService.updateData(id,msrDesc));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


}
