package com.example.Appointment_scheduling.repository;

import com.example.Appointment_scheduling.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
}
