package com.example.npospring.controller;

import com.example.npospring.entity.FacilityEntity;
import com.example.npospring.entity.FacilityTypeEntity;
import com.example.npospring.entity.SourceEntity;
import com.example.npospring.entity.UserEntity;
import com.example.npospring.model.FacilityType;
import com.example.npospring.model.Source;
import com.example.npospring.repository.FacilityTypeRepo;
import com.example.npospring.service.FacilityTypeService;
import com.example.npospring.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/facility_type")
public class FacilityTypeController {

    @Autowired
    private FacilityTypeService facilityTypeService;
    @Autowired
    FacilityTypeRepo facilityTypeRepo;
    @PostMapping
    public ResponseEntity getData(@RequestBody FacilityTypeEntity facilityTypeEntity){
        try{
            facilityTypeService.addData(facilityTypeEntity);
            return ResponseEntity.ok("Запись добавлена");
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<FacilityTypeEntity> getAll(){
        return facilityTypeRepo.findAll();
    }

    @GetMapping
    public ResponseEntity getFacilityTypeOne(@RequestParam Long id) {
        try{
            return ResponseEntity.ok(facilityTypeService.getFacilityTypeOne(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteData(@PathVariable Long id){
        try{
            return ResponseEntity.ok(facilityTypeService.delete(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
    @PutMapping("/{id}/")
    public ResponseEntity upData(@PathVariable("id") Long id, @RequestBody FacilityType facilityType){

        try{
            return ResponseEntity.ok(facilityTypeService.updateData(id,facilityType));
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
