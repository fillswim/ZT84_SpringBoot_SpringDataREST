package com.fillswim.spring.springboot.zt84_springboot_springdatarest.dao;


import com.fillswim.spring.springboot.zt84_springboot_springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// <Тип данных, Тип первичного ключа>
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Метод GET        http://localhost:8080/employees                     Получение всех работников
    // Метод GET        http://localhost:8080/employees{employeeID}         Получение одного работника
    // Метод POST       http://localhost:8080/employees                     Добавление работника
    // Метод PUT        http://localhost:8080/employees{employeeID}         Изменение работника
    // Метод DELETE     http://localhost:8080/employees{employeeID}         Удаление работника

}
