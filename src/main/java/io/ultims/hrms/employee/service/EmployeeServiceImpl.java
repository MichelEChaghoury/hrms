package io.ultims.hrms.employee.service;

import org.springframework.stereotype.Service;

import io.ultims.hrms.employee.contract.v1.dto.EmployeeDTO;
import io.ultims.hrms.employee.mapper.EmployeeMapper;
import io.ultims.hrms.employee.model.Employee;
import io.ultims.hrms.employee.repository.EmployeeRepository;
import io.ultims.hrms.shared.exception.NotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO getEmployee(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Invalid Employee ID was provided");
        }

        if (id < 1) {
            throw new IllegalArgumentException(id + " is not considered as a valid Employee ID");
        }

        Employee employee = employeeRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("No Employee with ID: " + id + " was found"));

        return employeeMapper.toDto(employee);
    }

}
