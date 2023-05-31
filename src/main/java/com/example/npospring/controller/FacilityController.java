package com.example.npospring.controller;

import com.example.npospring.entity.FacilityEntity;
import com.example.npospring.entity.FacilityTypeEntity;
import com.example.npospring.entity.MsrEntity;
import com.example.npospring.model.Facility;
import com.example.npospring.model.Msr;
import com.example.npospring.repository.FacilityRepo;
import com.example.npospring.service.FacilityService;
import com.example.npospring.service.MsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    FacilityService facilityService;
    @Autowired
    FacilityRepo facilityRepo;

    @PostMapping
    public ResponseEntity createData(@RequestBody FacilityEntity facilityEntity,
                                     @RequestParam Long facilityTypeID){
        try{
            facilityService.createData(facilityEntity,facilityTypeID);
            return ResponseEntity.ok("Запись добавлена");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getFacility(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(facilityService.getMsrFailTypeOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<FacilityEntity> getAll(){
        return facilityRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(facilityService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable Long id, @RequestBody Facility facility){
        try{
            return ResponseEntity.ok(facilityService.updateData(id,facility));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
