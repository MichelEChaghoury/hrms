package io.ultims.hrms.employee.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import io.ultims.hrms.employee.contract.v1.dto.EmployeeDTO;
import io.ultims.hrms.employee.mapper.EmployeeMapper;
import io.ultims.hrms.employee.mapper.EmployeeMapperImpl;
import io.ultims.hrms.employee.model.Employee;
import io.ultims.hrms.employee.repository.EmployeeRepository;
import io.ultims.hrms.shared.exception.NotFoundException;

class EmployeeServiceTests {

    private EmployeeService underTest;
    private EmployeeMapper employeeMapper = new EmployeeMapperImpl();

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new EmployeeServiceImpl(employeeRepository, employeeMapper);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWithAppropriateMessage_whenGivenIdIsNull() {

        // Given
        Long id = null;
        String message = "Invalid Employee ID was provided";

        // When
        Throwable exception = catchThrowable(() -> underTest.getEmployee(id));

        // Then
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        verify(employeeRepository, never()).findById(id);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWithAppropriateMessage_whenGivenIdIsNegative() {

        // Given
        Long id = -12L;
        String message = id + " is not considered as a valid Employee ID";

        // When
        Throwable exception = catchThrowable(() -> underTest.getEmployee(id));

        // Then
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        verify(employeeRepository, never()).findById(id);
    }

    @Test
    void shouldThrowNotFoundExceptionWithAppropriateMessage_whenNoEmployeeWithGivenIdWasFound() {

        // Given
        Long id = 34L;
        String message = "No Employee with ID: " + id + " was found";
        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.empty());

        // When
        Throwable exception = catchThrowable(() -> underTest.getEmployee(id));

        // Then
        assertThat(exception).isInstanceOf(NotFoundException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        verify(employeeRepository, times(1)).findById(id);
    }

    @Test
    void shouldReturnEmployeeDTO_whenEmployeeWithGivenIdWasFound() {

        // Given
        Long id = 34L;
        Employee employee = Employee.builder()
                .id(id)
                .build();

        Mockito.when(employeeRepository.findById(id)).thenReturn(Optional.of(employee));

        // When
        EmployeeDTO actual = underTest.getEmployee(id);
        EmployeeDTO excpected = employeeMapper.toDto(employee);

        // Then
        assertThat(actual).isEqualTo(excpected);
        verify(employeeRepository, times(1)).findById(id);
    }
}
