package entities.state;

import entities.Appointment;

public class NewAppointment implements AppointmentState{
    @Override
    public void next(Appointment app) {
        app.setState(new ConfirmedAppointment());
    }
    @Override
    public void prev(Appointment app) {
        System.out.println("The appointment is created.");
    }
    @Override
    public void printStatus() {
        System.out.println("Appointment was created.");
    }
}

