package com.beamm.flightbooking.bootstrap;

import com.beamm.flightbooking.model.Airplane;
import com.beamm.flightbooking.service.AirplaneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AirplaneService airplaneService;

    public BootstrapData(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Airplanes");

        Airplane c1 = new Airplane();

        c1.setAirplaneModel("Ethiopian");
        c1.setAirplaneSerialNumber("kcds");
        c1.setBusinessClassSeats(14);
        c1.setEconomyClassSeats(73);
        c1.setFirstClassSeats(0);
        airplaneService.saveAirplane(c1);

        Airplane c2 = new Airplane();

        c2.setAirplaneModel("Kenyan");
        c2.setAirplaneSerialNumber("kcds");
        c2.setBusinessClassSeats(14);
        c2.setEconomyClassSeats(73);
        c2.setFirstClassSeats(0);
        airplaneService.saveAirplane(c2);


        System.out.println("Total Airplanes: ");
        System.out.println(airplaneService.getAllAirplanesList());
    }
}
