package OCA;


class Employee {
        public int salary;
    }


class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public  int stockOptions;

}

public class S37 {
    public static void main(String[] args) {
        Employee employee=new Employee();// salary
        Manager manager=new Manager();//budget,salary
        Director director=new Director();//stockOptions,budget,salary
        
        Employee employee1=new Employee();//salary
        Employee manager1=new Manager();//salary
        Employee director1=new Director();//salary


    }
}
