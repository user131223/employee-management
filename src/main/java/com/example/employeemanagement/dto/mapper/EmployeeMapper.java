package com.example.employeemanagement.dto.mapper;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

    EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);

    EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity);
}
