package kz.dar.academy.employeecoreapi.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private static final HashMap<String, Employee> employeeMap = new HashMap<>();

    static {
        Employee employee1 = new Employee(
                UUID.randomUUID().toString(),
                "Sula",
                "Mechta",
                "Yandex",
                "SWE",
                "sulya.mechta@yandex.ru",
                30000000.0
        );
        Employee employee2 = new Employee(
                UUID.randomUUID().toString(),
                "Muha",
                "Zhbn",
                "Google",
                "SWE",
                "soulee@google.com",
                500000000.0
        );
        Employee employee3 = new Employee(
                UUID.randomUUID().toString(),
                "Rsn",
                "Zhtv",
                "Meta",
                "SWE",
                "danq@facebook.com",
                50000000000.0
        );
        employeeMap.put(employee1.getId(), employee1);
        employeeMap.put(employee2.getId(), employee2);
        employeeMap.put(employee3.getId(), employee3);
    }

    void createEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    Employee getEmployeeById(String id) {
        return employeeMap.get(id);
    }

    void updateEmployeeById(String id, Employee employee) {
        employee.setId(id);
        employeeMap.put(id, employee);
    }

    void deleteEmployeeById(String id) {
        employeeMap.remove(id);
    }
}
