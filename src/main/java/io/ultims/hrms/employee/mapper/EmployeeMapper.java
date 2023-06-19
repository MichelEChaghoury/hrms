package io.ultims.hrms.employee.mapper;

import io.ultims.hrms.employee.contract.v1.dto.CreateEmployeeDTO;
import io.ultims.hrms.employee.contract.v1.dto.EmployeeDTO;
import io.ultims.hrms.employee.contract.v1.dto.UpdateEmployeeDTO;
import io.ultims.hrms.employee.model.Employee;

/**
 *
 * Mapper interface for converting between Employee entities and DTOs.
 */
public interface EmployeeMapper {

    /**
     *
     * Converts an Employee entity to an EmployeeDTO.
     *
     * @param employee the Employee entity to convert
     * @return the corresponding EmployeeDTO
     */
    EmployeeDTO toDto(Employee employee);

    /**
     *
     * Converts an Employee entity with the specified ID and UpdateEmployeeDTO to an
     * EmployeeDTO.
     *
     * @param id          the ID of the Employee entity
     * @param employeeDTO the UpdateEmployeeDTO containing updated information
     * @return the corresponding EmployeeDTO
     */
    EmployeeDTO toDto(Long id, UpdateEmployeeDTO employeeDTO);

    /**
     *
     * Converts an EmployeeDTO to an Employee entity.
     *
     * @param employeeDTO the EmployeeDTO to convert
     * @return the corresponding Employee entity
     */
    Employee toEmployee(EmployeeDTO employeeDTO);

    /**
     *
     * Converts a CreateEmployeeDTO to an Employee entity.
     *
     * @param employeeDTO the CreateEmployeeDTO to convert
     * @return the corresponding Employee entity
     */
    Employee toEmployee(CreateEmployeeDTO employeeDTO);

    /**
     *
     * Converts a CreateEmployeeDTO to an EmployeeDTO.
     *
     * @param employeeDTO the CreateEmployeeDTO to convert
     * @return the corresponding EmployeeDTO
     */
    EmployeeDTO toDto(CreateEmployeeDTO employeeDTO);
}
