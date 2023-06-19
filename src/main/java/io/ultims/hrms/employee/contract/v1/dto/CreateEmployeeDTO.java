package io.ultims.hrms.employee.contract.v1.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateEmployeeDTO {

    private final String firstName;
    private final String lastName;
    private final String gender;
    private final String email;
    private final BigDecimal salary;
    private final LocalDate dateOfBirth;
    private final LocalDate joinDate;
    private final String jobTitle;
    private final String grade;
    private final BigDecimal managerId;
    private final BigDecimal departmentId;
}
