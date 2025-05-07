package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {


        //Arrange
        Room room1 = new Room(2, 129, false, false);
        Room room2 = new Room(2, 139, true, false);

        //Act
        boolean result = room1.isOccupied();

        //Assert
        assertFalse(result);

    }
//    @org.junit.jupiter.api.Test
//    void checkOut() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void checkIn() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void cleanRoom() {
//    }
}