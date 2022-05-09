package com.example.inventivit_miniproject.controllers;

import com.example.inventivit_miniproject.entities.Case;
import com.example.inventivit_miniproject.services.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cases")
public class CaseController {

    private CaseService caseService;

    @Autowired
    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/{id}")
    public Case getById(@PathVariable("id") Long id){
        return caseService.get(id);
    }

    @PostMapping("/add")
    public Case add(@RequestBody Case Case){
        return caseService.add(Case);
    }

    @PutMapping("/{id}")
    public Case edit(@RequestBody Case Case,@PathVariable("id") Long id){
        return caseService.edit(Case);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){


        return caseService.delete(caseService.get(id));
    }

}
