package entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "CompRoom")
public class ComputerRoom {
    @Id
    @OneToMany
    Integer roomId;
    Integer numberOfComp;
    String RoomNumber;
    String FloorNumber;

    public ComputerRoom() {
    }

    public ComputerRoom(Integer id, Integer numberOfComp, String roomNumber, String floorNumber) {
        this.roomId = id;
        this.numberOfComp = numberOfComp;
        this.RoomNumber = roomNumber;
        this.FloorNumber = floorNumber;
    }
    @Column(name = "RoomId")
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer id) {
        this.roomId = id;
    }

    @Column(name = "numberOfComp")
    public Integer getNumberOfComp() {
        return numberOfComp;
    }

    public void setNumberOfComp(Integer numberOfComp) {
        this.numberOfComp = numberOfComp;
    }
    @Column(name = "RoomNumber")
    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    @Column(name = "FloorNumber")
    public String getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        FloorNumber = floorNumber;
    }
}
