package com.example.npospring.controller;

import com.example.npospring.entity.DynGraficEntity;
import com.example.npospring.entity.DynamogramEntity;
import com.example.npospring.repository.DynGraficRepo;
import com.example.npospring.service.DynGraficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/dyngrafic")
public class DynGraficController {

    @Autowired
    private DynGraficRepo dynGraficRepo;
    @Autowired
    private DynGraficService dynGraficService;

    @PostMapping
    public ResponseEntity createData(@RequestBody DynGraficEntity dynGraficEntity,
                                     @RequestParam Long dynamogramID )
    {
        try{
            return ResponseEntity.ok(dynGraficService.addData(dynGraficEntity,dynamogramID));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<DynGraficEntity> getAll(){
        return dynGraficRepo.findAll();
    }
}
