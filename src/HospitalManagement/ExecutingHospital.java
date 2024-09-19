package HospitalManagement;

public class ExecutingHospital
{
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.dentalService();
        fh.medicalTraining();
        fh.orthoService();
        fh.entService();
        fh.gynicService();
        fh.cardioService();
        fh.medicalInsurance();
        fh.medicalTraining();
        fh.oncologyService();
        fh.physioService();

        //USMedicalAssociation us = new USMedicalAssociation(); We cannot create object of an interface

        System.out.println("=============TOP CASTING CONCEPTS USMA==========================");
        //TopCasting
        USMedicalAssociation usma= new FortisHospital();
        usma.cardioService();
        usma.neuroService();
        usma.physioService();

        System.out.println("=============TOP CASTING CONCEPTS UKMA==========================");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entService();
        ukma.dentalService();

        System.out.println("=============TOP CASTING CONCEPTS IMA==========================");
        IndianMedicalAssociation ima =new FortisHospital();
        ima.oncologyService();
        ima.gynicService();
        ima.orthoService();

        System.out.println("=============DOWN CASTING CONCEPTS IMA==========================");
        // Down casting - Not allowed in Java

        fh.medicalRD();
        fh.medicalNews();
        fh.emergencyService();

        System.out.println("=============Common Service in all the interface==========================");
        fh.childCareService();

        fh.medicalTestService();

        System.out.println("=============WHO Interface Service==========================");
        fh.covidVaccination();



    }

}
