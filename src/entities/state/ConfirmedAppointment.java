package entities.state;

import entities.Appointment;

public class ConfirmedAppointment implements AppointmentState{
    @Override
    public void next(Appointment app) {
        app.setState(new CanceledAppointment());
    }
    @Override
    public void prev(Appointment app) {
        app.setState(new NewAppointment());
    }
    @Override
    public void printStatus() {
        System.out.println("Appointment is  confirmed");
    }
}
