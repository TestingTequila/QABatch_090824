package HospitalManagement;

public interface USMedicalAssociation extends WHO, UHO
{
    public void cardioService();
    public  void neuroService();
    public  void physioService();
    public  void childCareService();

    int NO_OF_DOCTORS=10;

    public static void  taxCalculation()
    {
        System.out.println("Tax Calculation");
    }

    public  static void  ItrCalculation()
    {
        System.out.println("ITR Calculation");
    }


    default  void getMedicalService()
    {
        System.out.println("US getMedicalService");
    }

    default  void OPD()
    {
        System.out.println("US getMedicalService");
    }


}
