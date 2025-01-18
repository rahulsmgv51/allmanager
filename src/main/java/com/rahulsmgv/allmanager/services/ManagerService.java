package com.rahulsmgv.allmanager.services;

import org.springframework.stereotype.Service;

import com.rahulsmgv.allmanager.dto.ManagerDTO;
import com.rahulsmgv.allmanager.entities.ManagerEntity;
import com.rahulsmgv.allmanager.repositories.ManagerRepository;

@Service
public class ManagerService {
    
    final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository){
        this.managerRepository = managerRepository;
    }

    public ManagerDTO getEmployeeById(Long id){
        ManagerEntity managerEntity = managerRepository.getById(id);
        return new ManagerDTO();
    }
}