package HospitalManagement;

public class FortisHospital extends HospitalClass implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{

    //USMedicalAssociation
    @Override
    public void cardioService() {
        System.out.println("Fortis Hospital---cardioService");
    }

    @Override
    public void neuroService() {
        System.out.println("Fortis Hospital---neuroService");
    }

    @Override
    public void physioService() {
        System.out.println("Fortis Hospital---physioService");
    }

    @Override
    public void childCareService() {
        System.out.println("Fortis Hospital---childCareService");
    }

    //UKMedicalAssociation
    @Override
    public void entService() {
        System.out.println("Fortis Hospital---entService");
    }

    @Override
    public void dentalService() {
        System.out.println("Fortis Hospital---dentalService");
    }

    //IndianMedicalAssociation
    @Override
    public void oncologyService() {
        System.out.println("Fortis Hospital---oncologyService");
    }

    @Override
    public void gynicService() {
        System.out.println("Fortis Hospital---gynicService");
    }

    @Override
    public void orthoService() {
        System.out.println("Fortis Hospital---orthoService");
    }

    //Individual Services
    public void medicalTraining()
    {
        System.out.println("Fortis Hospital---medicalTraining");
    }

    public void medicalInsurance()
    {
        System.out.println("Fortis Hospital---medicalInsurance");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Fortis Hospital---covidVaccination");
    }

    @Override
    public void medicalTestService() {
        System.out.println("Fortis Hospital---medicalTestService");
    }

//    @Override --> we cannot override a final method
//    public  void medicalNews()
//    {
//        System.out.println("Fortis Hospital---medicalNews");
//    }


}
