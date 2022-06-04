package entities;

import entities.state.AppointmentState;
import entities.state.NewAppointment;

import java.util.Date;



public class Appointment {

    private AppointmentState state = new NewAppointment();

    private Date date;
    private int time;
    private String reason;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public int getTime() {
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
}
