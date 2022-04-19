package services;

import entities.Comp;
import entities.Os;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CompServicesTest {
    @Test
    void test() {
        CompServices compServices = new CompServices();
        Assertions.assertTrue(compServices.findAll().size() == 6);
        Comp newComp = new Comp(7, "AMD 5700XT",
                "Ryzen 5 3600",
                "11.2", Os.Linux,
                "Gigabyte B450");
        compServices.create(newComp);
        Assertions.assertTrue(compServices.findById(7).getCpu_name().equals("Ryzen 5 3600"));
        Assertions.assertTrue(compServices.findAll().size() == 7);
        newComp.setCpu_name("Ryzen 7 3800x");
        compServices.update(newComp);
        Assertions.assertTrue(compServices.findById(7).getCpu_name().equals("Ryzen 7 3800x"));
        compServices.delete(7);
        Assertions.assertTrue(compServices.findAll().size() == 6);
    }
}