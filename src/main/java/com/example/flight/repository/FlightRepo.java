package com.example.flight.repository;

import com.example.flight.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flights,Long> {
}
