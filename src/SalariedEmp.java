public class SalariedEmp extends  Emloyet {
    private  int monthlySalary;



    public SalariedEmp(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {

        return  monthlySalary;
    }
}
