package com.pluralsight;
import java.time.LocalDateTime;

public class Employee{
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIntime;
    private String formatTime(double time) {
        int hours = (int) time;
        int minutes = (int) ((time - hours) * 60);
        return String.format("%02d:%02d", hours, minutes);
    }



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

    public void punchIn(double time) {
        punchIntime = time;
        System.out.println(name +  "punch time: " + formatTime(time));
    }
    public void punchOut(double time) {
        double hours = time - punchIntime;
        if (hours > 0) {
            hoursWorked += hours;
            System.out.println(name + " punched out at: " + formatTime(time) + "\nHours worked: " + hours);
        } else {
            System.out.println("Error Invalid time");
        }
    }public void punchIn () {
            LocalDateTime now = LocalDateTime.now();
            double time = now.getHour() + now.getMinute() / 60.0;
            punchIn(time);
        }
        public void punchOut () {
            LocalDateTime now = LocalDateTime.now();
            double time = now.getHour() + now.getMinute() / 60.0;
            punchOut(time);
        }
    }
