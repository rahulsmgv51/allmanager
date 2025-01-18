package com.rahulsmgv.allmanager.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahulsmgv.allmanager.entities.ManagerEntity;


@Repository
public interface ManagerRepository extends JpaRepository<ManagerEntity, Long>{
    
}