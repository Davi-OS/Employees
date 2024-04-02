
public class Employee {
    private String name;
    private int hours;
    private double valuePeHour;

    public Employee(String name, int hours, double valuePeHour) {
        this.name = name;
        this.hours = hours;
        this.valuePeHour = valuePeHour;
    }

    public double payment() {

        return valuePeHour * hours;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
