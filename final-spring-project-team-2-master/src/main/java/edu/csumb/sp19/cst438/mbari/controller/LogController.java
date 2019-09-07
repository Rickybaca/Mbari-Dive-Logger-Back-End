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

import edu.csumb.sp19.cst438.mbari.model.Log;
import edu.csumb.sp19.cst438.mbari.repositories.LogRepository;
import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins ="*")
@RestController
public class LogController{
    @Autowired
    LogRepository logRepository;

    @ApiOperation(value = "Adds a log.")
    @PostMapping("/log/add")
    public void addLog(@RequestBody Log log) {
        logRepository.save(log);
        //return "Added log!";
    }

    @ApiOperation(value = "Gets all existing logs.")
    @GetMapping("/log/getAll")
    public List<Log> getAll() {
        List<Log> result = logRepository.findAll();
        return result;
    }

    @ApiOperation(value = "Gets log by id.")
    @GetMapping("/log/get/{id}")
    public Optional<Log> getLogById(@PathVariable String id) {
        Optional<Log> result = logRepository.findById(id);
        return result;
    }

}