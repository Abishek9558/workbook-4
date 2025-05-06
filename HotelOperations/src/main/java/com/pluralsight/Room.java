package com.pluralsight;

public class Room{
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void checkOut() {
        if(occupied) {
            occupied = false;
            System.out.println("guest checked out");
        } else {
            System.out.println("room is Empty");
        }
    }
    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;  // Becomes dirty after someone checks in
            System.out.println("Guest checked in. Room is now occupied and dirty.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }
        public void cleanRoom() {
        if (dirty) {
            dirty =false;
            System.out.println("Room just cleaned");
        } else  {
            System.out.println("Room is already clean");
        }
    }
}
