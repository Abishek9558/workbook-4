package com.pluralsight;

public class Employee{
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIntime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getPayRate() {
        return payRate;
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);

    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    public void punchIn (double time) {
        punchIntime = time;
        System.out.println(name +  "punch time: " + time);
    }
    public void punchOut(double time)
    {   double hours = time -punchIntime;
        if (hours > 0) {
            hoursWorked += hours;
            System.out.println(name + " punched out at: " + time+ "\nHours worked: " +hours);
        }else {
            System.out.println("Error Invalid time");
        }
    }
}
