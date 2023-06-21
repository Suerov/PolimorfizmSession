public class HourlyEmp extends Emloyet {
    private int HourseWorked;
    private int HourseRate;


    public HourlyEmp(String name, int hourseWorked, int hourseRate) {
        super(name);
        HourseWorked = hourseWorked;
        HourseRate = hourseRate;
    }

    @Override
    public double calculateSalary() {
       double sum = HourseRate*HourseWorked;

        return sum;
    }


}
