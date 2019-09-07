package edu.csumb.sp19.cst438.mbari.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.sp19.cst438.mbari.model.Diver;
import edu.csumb.sp19.cst438.mbari.repositories.DiverRepository;
import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins ="*")
@RestController
public class DiverController{
    @Autowired
    DiverRepository diverRepository;

    @ApiOperation(value = "Adds a diver.")
    @PostMapping("/diver/add")
    public void addDiver(@RequestBody Diver diver) {
        diverRepository.save(diver);
        //return "Added Diver!";
    }

    @ApiOperation(value = "Gets all existing divers.")
    @GetMapping("/diver/getAll")
    public List<Diver> getAll() {
        List<Diver> result = diverRepository.findAll();
        return result;
    }

    @ApiOperation(value = "Gets diver by id.")
    @GetMapping("/diver/get/{id}")
    public Optional<Diver> getDiverById(@PathVariable String id) {
        Optional<Diver> result = diverRepository.findById(id);
        return result;
    }

}