package oopdemo;

public class Staff {
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    public void printMessage() {
        System.out.println("Calculating Pay...");
    }

    public int calculatePay() {
        printMessage();

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }

    public int calculatePay(int bonus, int allowance) {
        printMessage();
        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }

    public void setHoursWorked(int hours) {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: HoursWorked Cannot be Smaller tha Zero");
            System.out.println("Error: HoursWorked isn't updated");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
