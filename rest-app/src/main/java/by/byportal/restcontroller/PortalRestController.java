package by.byportal.restcontroller;

import by.byportal.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class PortalRestController {

    @GetMapping("/hello")
    public String homePage() {
        System.out.println("hello - проверка вывода в консоль надписи из вкладки /hello");
        String someString = "проверка работоспособности ";
        return someString + " 5";
    }
    @GetMapping("/employee")
    public Employee getEmployee() {
        Date birthDate = new Date (1976, 05,1);
        Employee employee1 = new Employee("Сергей", "Иванюклвич", birthDate);
        return employee1;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Островский", "Руслан", new Date (1980,12,05)));
        employees.add(new Employee("Левченко", "Александр", new Date (1976,9,20)));
        employees.add(new Employee("Рагозинский", "Алексей", new Date (1977,3,17)));
        employees.add(new Employee("Якимчик", "Александр", new Date (1980,1,4)));
        employees.add(new Employee("Савицкий", "Владимир", new Date (1982,5,10)));
        // TODO: Implement returning list from EmployeeService layer

        return employees;
    }

}
