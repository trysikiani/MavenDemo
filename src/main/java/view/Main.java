package view;

import model.Employee;
import services.EmployeeService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeBaseList = EmployeeService.getEmployeeBaseList();
       // System.out.println("Список сотрудников из базы: ");
       // employeeBaseList.forEach(System.out::println);
       // System.out.println("Список сотрудников из кадров: ");
        List<Employee> employeeKadryList = EmployeeService.getEmployeeKadryList();
       // employeeKadryList.forEach(System.out::println);
      //  System.out.println("Список сотрудников из двух списков: ");
        List<Employee> employeeVseList = EmployeeService.getEmployeeVseList();
       // employeeVseList.forEach(System.out::println);

        Map<Integer,Employee> mapIzBazy = EmployeeService.mapIzList(employeeBaseList);
        Map<Integer,Employee> mapIzKadry = EmployeeService.mapIzList(employeeKadryList);
        System.out.println("Список до обновления: ");
        System.out.println("----------------------------------");
        employeeBaseList.forEach(System.out::println);
        System.out.println("----------------------------------");
        for(Employee employee:employeeBaseList) {
            if (mapIzKadry.get(employee.getTabNum())== null) {
                employee.setActive(false);
            }
        }
        for (Employee employee:employeeKadryList) {
            if (mapIzBazy.get(employee.getTabNum())== null) {
                employee.setActive(true);
                employeeBaseList.add(employee);
            }
        }
        System.out.println("Список после обновления: ");
        System.out.println("----------------------------------");
        employeeBaseList.forEach(System.out::println);





//        List<Employee> employeeVseList = EmployeeService.getEmployeeVseList();
//        employeeVseList.forEach(System.out::println);
//        System.out.println("Список сотрудников из двух списков: ");
      //  List<Employee> employeeLastList = EmployeeService.getEmployeeLastList();
       // employeeLastList.forEach(System.out::println);







    }
}

