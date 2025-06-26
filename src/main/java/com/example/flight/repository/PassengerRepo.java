package com.example.flight.repository;

import com.example.flight.model.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passengers,Long> {
}
