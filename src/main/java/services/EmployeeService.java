package services;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    public static List<Employee> getEmployeeBaseList() {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Cristiano", "Ronaldo", "Junior", 34, "Forward",39000.0,true));
        emp.add(new Employee(2,"Lionel", "Messi", "Second", 33, "MidleF",41000.0, true));
        emp.add(new Employee(3, "Neymar", "Esta", "Junior", 29, "RightF",31000.0, true));
        emp.add(new Employee(4, "Zlatan", "Ibrahimovic", "Lex",41,"LeftF", 25000.0, true));
        emp.add(new Employee(5, "Jose", "Mourinho", "Ledo", 61, "Coach", 10000.0, true));
        emp.add(new Employee(6, "Nina", "Dovrev", "Popovich", 37, "Actress", 9000.0, true));
        emp.add(new Employee(7, "Mariya", "Sharapova", "Dolgovovich", 38, "TennisPlayer", 17000.0, true));
        emp.add(new Employee(8, "Lebron", "James", "Ole", 32,"NBA", 99000.0, true));
        emp.add(new Employee(9, "Adele", "Hello", "ItsMe", 37,"Singer", 11000.0, true));
        emp.add(new Employee(10,"Vladimir", "Putin", "Sergeevich",65, "President",999999.0, true));
        return emp;
    }
    public static List<Employee> getEmployeeKadryList() {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(7,"Cristiano", "Ronaldo", "Junior", 34, "Forward",39000.0,true));
        emp.add(new Employee(2,"Lionel", "Messi", "Second", 33, "MidleF",41000.0, true));
        emp.add(new Employee(3, "Neymar", "Esta", "Junior", 29, "RightF",31000.0, true));
        emp.add(new Employee(4, "Zlatan", "Ibrahimovic", "Lex",41,"LeftF", 25000.0, true));
        emp.add(new Employee(6, "Jose", "Mourinho", "Ledo", 61, "Coach", 10000.0, true));
        emp.add(new Employee(9, "Eminem", "Ft", "Akon", 41, "Rap",65000.0, true));
        emp.add(new Employee(12, "Tom", "Brady", "Jackson", 43, "NFL", 89000.0, true));
        emp.add(new Employee(13, "Jerry", "The", "Mouse", 2, "Cartoon", 0.0,true));
        emp.add(new Employee(14,"Nursultan", "Nursultanov", "Nursultanovich", 79, "Undead", 45000.0, true));
        emp.add(new Employee(15, "Pep", "Guardiola", "Genius", 59, "Coach", 50000.0, true));
            return emp;
    }
    public static Map<Integer,Employee> mapIzList(List<Employee>employees) {
        Map<Integer,Employee> result = new HashMap<>();
        employees.forEach(x-> result.put(x.getTabNum(),x));
        return result;
    }

    public static List<Employee> getEmployeeVseList() {
        List<Employee> emp = new ArrayList<>(getEmployeeBaseList());
        List<Employee> emp1 = new ArrayList<>(getEmployeeKadryList());
        emp.addAll(emp1);
        return emp;
    }
}
