public class OutsourcedEmployee extends Employee {
    private double additionalCharge;
    public OutsourcedEmployee(String name, int hours, double valuePeHour,double additionalCharge) {
        super(name, hours, valuePeHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
