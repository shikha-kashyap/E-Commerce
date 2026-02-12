package com.shikha.E_Commerce.example.ManyToMany2;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class DoctorAppointmentKey implements Serializable {
    private int doctorId;
    private int appointmentId;

    public DoctorAppointmentKey(){}

    public DoctorAppointmentKey(int doctorId, int appointmentId) {
        this.doctorId = doctorId;
        this.appointmentId = appointmentId;
    }
}
