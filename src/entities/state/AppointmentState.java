package entities.state;

import entities.Appointment;

public interface AppointmentState {
    void next(Appointment app);
    void prev(Appointment app);
    void printStatus();

}

