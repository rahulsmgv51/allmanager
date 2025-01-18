package com.rahulsmgv.allmanager.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rahulsmgv.allmanager.dto.ManagerDTO;

import jakarta.websocket.server.PathParam;

@RestController
public class ManagerController {
    
    @GetMapping(path = "/employees/{id}")
    public ManagerDTO getEmployees(@PathVariable("id") Long empId){
        return new ManagerDTO(empId, "Rahul", LocalDate.of(2022, 01, 03), true);
    }

    @GetMapping(path = "/employees")
    public String getData(@PathParam("sortBy") String sortBy){
        return "Hello "+ sortBy;
    }

}