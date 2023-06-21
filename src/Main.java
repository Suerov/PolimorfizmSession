
public class Main {
    public static void main(String[] args) {
        HourlyEmp  hourlyemp= new HourlyEmp("Nursultan", 24, 2);
       SalariedEmp salariedemp= new SalariedEmp("Nazarbaev", 1000000 );
       double hourlyempsalary= hourlyemp.calculateSalary();
       double salaried= salariedemp.calculateSalary();
        System.out.println(hourlyempsalary);
        System.out.println(salaried);



    }
}