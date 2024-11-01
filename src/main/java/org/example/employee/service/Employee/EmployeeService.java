package org.example.employee.service.Employee;

import org.example.employee.dto.EmployeeDto;
import org.example.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee createEmployee(Employee employee);
    void deleteEmployee(long id);

}
