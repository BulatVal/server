package com.example.npospring.controller;

import com.example.npospring.entity.FacilityTypeEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.entity.MsrFailTypeEntity;
import com.example.npospring.model.Msr;
import com.example.npospring.model.MsrFailType;
import com.example.npospring.repository.MsrRepo;
import com.example.npospring.service.MsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/msr")
public class MsrController {
    @Autowired
    MsrService msrService;
    @Autowired
    MsrRepo msrRepo;


    @PostMapping
    public ResponseEntity createData(@RequestBody MsrEntity msrEntity,
                                     @RequestParam Long typeID,
                                     @RequestParam Long sourceID,
                                     @RequestParam Long stateID,
                                     @RequestParam Long facilityID)
    {
        try{
            return ResponseEntity.ok(msrService.createData(msrEntity,typeID,sourceID,stateID,facilityID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getMsrOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(msrService.getMsrOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<MsrEntity> getAll(){
        return msrRepo.findAll();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(msrService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody Msr msr){
        try{
            return ResponseEntity.ok(msrService.updateData(id,msr));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
