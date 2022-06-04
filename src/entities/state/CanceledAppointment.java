package entities.state;

import entities.Appointment;

public class CanceledAppointment implements AppointmentState{

    @Override
    public void next(Appointment app) {
        System.out.println("The appointment has been canceled by the user");
    }
    @Override
    public void prev(Appointment app) {
        app.setState (new ConfirmedAppointment());
    }
    @Override
    public void printStatus() {
        System.out.println("Appointment canceled");
    }
}
