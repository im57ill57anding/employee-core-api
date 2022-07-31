package kz.dar.academy.employeecoreapi.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> createEmployee(@Valid @RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEmployeeById(@PathVariable String id, @Valid @RequestBody Employee employee) {
        employeeService.updateEmployeeById(id, employee);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
    }

}
