package com.rahulsmgv.allmanager.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}