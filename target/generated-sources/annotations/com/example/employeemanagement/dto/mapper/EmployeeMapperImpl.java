package com.example.employeemanagement.dto.mapper;

import com.example.employeemanagement.dto.request.EmployeeRequest;
import com.example.employeemanagement.dto.response.EmployeeResponse;
import com.example.employeemanagement.entity.EmployeeEntity;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-11T14:54:29+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20231206-1732, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        String address = null;
        Date dateOfBirth = null;
        String gender = null;
        String name = null;

        address = employeeRequest.getAddress();
        dateOfBirth = employeeRequest.getDateOfBirth();
        gender = employeeRequest.getGender();
        name = employeeRequest.getName();

        String email = null;

        EmployeeEntity employeeEntity = new EmployeeEntity( name, gender, dateOfBirth, address, email );

        return employeeEntity;
    }

    @Override
    public EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId( employeeEntity.getId() );
        employeeResponse.setName( employeeEntity.getName() );
        employeeResponse.setGender( employeeEntity.getGender() );
        employeeResponse.setDateOfBirth( employeeEntity.getDateOfBirth() );
        employeeResponse.setAddress( employeeEntity.getAddress() );

        return employeeResponse;
    }
}
