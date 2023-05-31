package com.example.npospring.controller;

import com.example.npospring.entity.MsrDescEntity;
import com.example.npospring.entity.MsrValueEntity;
import com.example.npospring.entity.SourceEntity;
import com.example.npospring.exception.MsrDescNotFoundException;
import com.example.npospring.model.MsrDesc;
import com.example.npospring.model.Source;
import com.example.npospring.repository.SourceRepo;
import com.example.npospring.service.MsrDescService;
import com.example.npospring.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/source")
public class SourceController {

    @Autowired
    private SourceService sourceService;
    @Autowired
    private SourceRepo sourceRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody SourceEntity sourceEntity){
        try{
            sourceService.addData(sourceEntity);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @GetMapping
    public ResponseEntity getSourceOne(@RequestParam Long id)  {
        try{
            return ResponseEntity.ok(sourceService.getSourceOne(id));

        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<SourceEntity> getAll(){
        return sourceRepo.findAll();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(sourceService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody Source source){

        try{
            return ResponseEntity.ok(sourceService.updateData(id,source));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
