package com.example.Dilya.RoomController;

class Room {
    private String roomNumber;
    private String type;

    public Room() {
    }

    public Room(String roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
