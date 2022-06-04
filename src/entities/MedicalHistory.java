package entities;

public class MedicalHistory {
    private int idPatient;
    private String diseases;


    public MedicalHistory(int idPatient,String diseases){
        this.idPatient = idPatient;
        this.diseases = diseases;
    }
}

