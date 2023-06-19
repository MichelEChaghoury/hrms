package io.ultims.hrms.employee.mapper;

import org.springframework.context.annotation.Configuration;

import io.ultims.hrms.employee.contract.v1.dto.CreateEmployeeDTO;
import io.ultims.hrms.employee.contract.v1.dto.EmployeeDTO;
import io.ultims.hrms.employee.contract.v1.dto.UpdateEmployeeDTO;
import io.ultims.hrms.employee.model.Employee;

@Configuration
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO toDto(Employee employee) {
        return EmployeeDTO.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .gender(employee.getGender())
                .dateOfBirth(employee.getDateOfBirth())
                .departmentId(employee.getDepartmentId())
                .grade(employee.getGrade())
                .jobTitle(employee.getJobTitle())
                .managerId(employee.getManagerId())
                .joinDate(employee.getJoinDate())
                .salary(employee.getSalary())
                .build();
    }

    @Override
    public EmployeeDTO toDto(Long id, UpdateEmployeeDTO employeeDTO) {
        return EmployeeDTO.builder()
                .id(id)
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .gender(employeeDTO.getGender())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .departmentId(employeeDTO.getDepartmentId())
                .grade(employeeDTO.getGrade())
                .jobTitle(employeeDTO.getJobTitle())
                .managerId(employeeDTO.getManagerId())
                .joinDate(employeeDTO.getJoinDate())
                .salary(employeeDTO.getSalary())
                .build();
    }

    @Override
    public Employee toEmployee(EmployeeDTO employeeDTO) {
        return Employee.builder()
                .id(employeeDTO.getId())
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .gender(employeeDTO.getGender())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .departmentId(employeeDTO.getDepartmentId())
                .grade(employeeDTO.getGrade())
                .jobTitle(employeeDTO.getJobTitle())
                .managerId(employeeDTO.getManagerId())
                .joinDate(employeeDTO.getJoinDate())
                .salary(employeeDTO.getSalary())
                .build();
    }

    @Override
    public Employee toEmployee(CreateEmployeeDTO employeeDTO) {
        return Employee.builder()
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .gender(employeeDTO.getGender())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .departmentId(employeeDTO.getDepartmentId())
                .grade(employeeDTO.getGrade())
                .jobTitle(employeeDTO.getJobTitle())
                .managerId(employeeDTO.getManagerId())
                .joinDate(employeeDTO.getJoinDate())
                .salary(employeeDTO.getSalary())
                .build();
    }

    @Override
    public EmployeeDTO toDto(CreateEmployeeDTO employeeDTO) {
        return EmployeeDTO.builder()
                .firstName(employeeDTO.getFirstName())
                .lastName(employeeDTO.getLastName())
                .email(employeeDTO.getEmail())
                .gender(employeeDTO.getGender())
                .dateOfBirth(employeeDTO.getDateOfBirth())
                .departmentId(employeeDTO.getDepartmentId())
                .grade(employeeDTO.getGrade())
                .jobTitle(employeeDTO.getJobTitle())
                .managerId(employeeDTO.getManagerId())
                .joinDate(employeeDTO.getJoinDate())
                .salary(employeeDTO.getSalary())
                .build();
    }
}
