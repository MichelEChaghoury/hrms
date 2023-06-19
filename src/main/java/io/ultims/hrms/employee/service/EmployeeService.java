package io.ultims.hrms.employee.service;

import io.ultims.hrms.employee.contract.v1.dto.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO getEmployee(Long id);
}
