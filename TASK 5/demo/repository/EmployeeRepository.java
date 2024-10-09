package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE YEAR(e.hireDate) = :year AND e.department = :department")
    List<Employee> findEmployeesByHireYearAndDepartment(@Param("year") int year, @Param("department") String department);
}

