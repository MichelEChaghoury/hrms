package io.ultims.hrms.employee.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ultims.hrms.employee.model.Employee;

/**
 *
 * Repository interface for managing Employee entities.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**
     *
     * Retrieves a list of employees whose first name contains the specified string,
     * ignoring case.
     *
     * @param firstName the string to search for in the first name
     * @param pageable  the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByFirstNameContainsIgnoreCase(String firstName, Pageable pageable);

    /**
     *
     * Retrieves a list of employees whose last name contains the specified string,
     * ignoring case.
     *
     * @param lastName the string to search for in the last name
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByLastNameContainsIgnoreCase(String lastName, Pageable pageable);

    /**
     *
     * Retrieves a list of employees with the specified grade.
     *
     * @param grade    the grade to search for
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByGrade(String grade, Pageable pageable);

    /**
     *
     * Retrieves a list of employees with the specified salary.
     *
     * @param salary   the salary to search for
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findBySalary(BigDecimal salary, Pageable pageable);

    /**
     *
     * Retrieves a list of employees with a salary greater than the specified value.
     *
     * @param salary   the minimum salary
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findBySalaryGreaterThan(BigDecimal salary, Pageable pageable);

    /**
     *
     * Retrieves a list of employees with a salary less than the specified value.
     *
     * @param salary   the maximum salary
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findBySalaryLessThan(BigDecimal salary, Pageable pageable);

    /**
     *
     * Retrieves a list of employees whose job title contains the specified string,
     * ignoring case.
     *
     * @param jobTitle the string to search for in the job title
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByJobTitleContainsIgnoreCase(String jobTitle, Pageable pageable);

    /**
     *
     * Retrieves a list of employees with the specified gender.
     *
     * @param gender   the gender to search for
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByGender(String gender, Pageable pageable);

    /**
     *
     * Retrieves a list of employees in the specified department.
     *
     * @param departmentId the ID of the department
     * @param pageable     the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByDepartmentId(BigDecimal departmentId, Pageable pageable);

    /**
     *
     * Retrieves a list of employees whose email contains the specified string,
     * ignoring case.
     *
     * @param email    the string to search for in the email
     * @param pageable the pagination information
     * @return the list of matching employees
     */
    List<Employee> findByEmailContainsIgnoreCase(String email, Pageable pageable);

    /**
     *
     * Retrieves an employee with the specified email.
     *
     * @param email the email to search for
     * @return the optional employee, or empty if not found
     */
    Optional<Employee> findByEmail(String email);
}
