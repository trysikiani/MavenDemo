package model;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Employee {
    private Integer tabNum;
    private String name;
    private String surname;
    private String middleName;
    private Integer age;
    private String position;
    private Double salary;
    private Boolean active;

//    public Employee(Integer tabNum, String name, String surname, String middleName,
//                    Integer age, String position, Double salary) {
//        this.name = name;
//        this.surname = surname;
//        this.middleName = middleName;
//        this.age = age;
//        this.tabNum = tabNum;
//        this.position = position;
//        this.salary = salary;
//    }
}
