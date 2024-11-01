package org.example.employee.mapper;

import org.example.employee.dto.EmployeeDto;
import org.example.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper Instance = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDto EmployeeToEmployeeDto(Employee employee);
    Employee EmployeeDtoToEmployee(EmployeeDto employeeDto);
}
