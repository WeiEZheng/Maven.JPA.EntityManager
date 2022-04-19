package services;

import entities.ComputerRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompRoomTest {
    @Test
    void test() {
        CompRoomServices compRoomServices = new CompRoomServices();
        Assertions.assertTrue(compRoomServices.findAll().size() == 2);
        ComputerRoom newCompRoom = new ComputerRoom(3,0,"301","3");
        compRoomServices.create(newCompRoom);
        Assertions.assertTrue(compRoomServices.findById(3).getRoomNumber().equals("3"));
        Assertions.assertTrue(compRoomServices.findAll().size() == 3);
        newCompRoom.setFloorNumber("5");
        compRoomServices.update(newCompRoom);
        Assertions.assertTrue(compRoomServices.findById(7).getFloorNumber().equals("5"));
        compRoomServices.delete(3);
        Assertions.assertTrue(compRoomServices.findAll().size() == 2);
    }
}
