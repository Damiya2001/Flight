package com.example.flight.repository;

import com.example.flight.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepo extends JpaRepository<Airport, Integer> {
}
