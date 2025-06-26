package com.example.flight.controller;



import com.example.flight.model.Airport;
import com.example.flight.model.Flights;
import com.example.flight.model.Passengers;
import com.example.flight.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FlightController {

    private final AirportRepo airportRepo;
    private final FlightRepo flightRepo;
    private final PassengerRepo passengerRepo;

    // Airports
    @PostMapping("/airports")
    public Airport saveAirport(@RequestBody Airport a) { return airportRepo.save(a); }

    @GetMapping("/airports")
    public List<Airport> getAirports() { return airportRepo.findAll(); }

    @DeleteMapping("/airports/{id}")
    public void deleteAirport(@PathVariable int id) { airportRepo.deleteById(id); }

    @PutMapping("/airports/{id}")
    public Airport updateAirport(@PathVariable Long id, @RequestBody Airport updated) {
        updated.setId(id);
        return airportRepo.save(updated);
    }

    // Flights
    @PostMapping("/flights")
    public Flights saveFlight(@RequestBody Flights f) { return flightRepo.save(f); }

    @GetMapping("/flights")
    public List<Flights> getFlights() { return flightRepo.findAll(); }

    @DeleteMapping("/flights/{id}")
    public void deleteFlight(@PathVariable Long id) { flightRepo.deleteById(id); }

    @PutMapping("/flights/{id}")
    public Flights updateFlight(@PathVariable Long id, @RequestBody Flights updated) {
        updated.setId(id);
        return flightRepo.save(updated);
    }

    // Passengers
    @PostMapping("/passengers")
    public Passengers savePassenger(@RequestBody Passengers p) { return passengerRepo.save(p); }

    @GetMapping("/passengers")
    public List<Passengers> getPassengers() { return passengerRepo.findAll(); }

    @DeleteMapping("/passengers/{id}")
    public void deletePassenger(@PathVariable Long id) { passengerRepo.deleteById(id); }

    @PutMapping("/passengers/{id}")
    public Passengers updatePassenger(@PathVariable Long id, @RequestBody Passengers updated) {
        updated.setId(id);
        return passengerRepo.save(updated);
    }
}


