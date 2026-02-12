package com.shikha.E_Commerce.example.ManyToMany2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorAppointment {

    @EmbeddedId
    private DoctorAppointmentKey doctorAppointmentKey;

    @ManyToOne
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @MapsId("appointmentId")
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private boolean active;

    private String notes;

    public DoctorAppointment(Doctor doctor, Appointment appointment, boolean active, String notes){
        this.doctor = doctor;
        this.appointment = appointment;
        this.active = active;
        this. notes = notes;

        this.doctorAppointmentKey = new DoctorAppointmentKey(doctor.getId(), appointment.getId());
    }
}
