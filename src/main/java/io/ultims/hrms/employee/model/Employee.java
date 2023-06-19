package io.ultims.hrms.employee.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Employee implements Serializable {

    @Id
    @Column(name = "emp_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "gender", nullable = true, length = 1)
    private String gender;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "salary", nullable = false)
    private BigDecimal salary;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Temporal(TemporalType.DATE)
    @Column(name = "join_date", nullable = false)
    private LocalDate joinDate;

    @Column(name = "job_title", nullable = false, length = 255)
    private String jobTitle;

    @Column(name = "grade", nullable = false, length = 50)
    private String grade;

    @Column(name = "manager_id", nullable = true)
    private BigDecimal managerId;

    @Column(name = "department_id", nullable = false)
    private BigDecimal departmentId;

}
