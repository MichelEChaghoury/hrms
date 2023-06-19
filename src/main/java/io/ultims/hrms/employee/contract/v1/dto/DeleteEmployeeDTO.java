package io.ultims.hrms.employee.contract.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteEmployeeDTO {
    private final Long id;
}
