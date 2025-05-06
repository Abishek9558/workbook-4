package com.pluralsight;

public class Main {public static void main(String[] args) {
    // testing the room
    Room room = new Room(2, 150.00, false, false);
    System.out.println("Room available: " + room.isAvailable());
    room.checkOut();
    room.checkIn();
    room.cleanRoom();

    // testing the reservation
    Reservation res1 = new Reservation("King", 15, true);
    System.out.println("Reservation total: $" + res1.getReservationTotal());
    System.out.println("Type: " + res1.getRoomType());

    // testing employess
    Employee emp = new Employee(107, "Abishek ", "MAnager", 25.00, 45);
    System.out.println("Employee Total Pay: $" + emp.getTotalPay());
    System.out.println("Regular Hours: " + emp.getRegularHours());
    emp.punchIn(9);
    emp.punchOut(14);
    System.out.println("Overtime Hours: " + emp.getOvertimeHours());
    System.out.println("Employee name: " +emp.getName());
    System.out.println("Employee Id: " +emp.getEmployeeId());
    System.out.println("Department: " +emp.getDepartment());
}
}
