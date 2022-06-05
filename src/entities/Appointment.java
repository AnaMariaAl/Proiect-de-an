package entities;

import entities.builder.Patient;
import entities.state.AppointmentState;
import entities.state.NewAppointment;





public class Appointment {

    private AppointmentState state = new NewAppointment();

    private String date;
    private String time;
    private String reason;
    private Doctor doctor;
    private Patient patient;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }


    public AppointmentState getState() {
        return state;
    }

    public void setState(AppointmentState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    @Override
    public String toString() {
        return "Your appointment is :" + "\n" +
                " date = " + date + "\n" +
                " time = " + time + '\'' + "\n" +
                " reason = " + reason + '\'' + "\n" +
                '}';
    }
}
