package com.example.Appointment_scheduling.controller;

import com.example.Appointment_scheduling.model.Appointment;
import com.example.Appointment_scheduling.service.AppointmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping("/book")
    public Appointment book(@RequestBody Appointment appointment) {
        return service.bookAppointment(appointment);
    }

    @GetMapping("/all")
    public List<Appointment> getAll() {
        return service.getAllAppointments();
    }
}
