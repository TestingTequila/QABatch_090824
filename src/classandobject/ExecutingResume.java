package classandobject;

public class ExecutingResume {
    public static void main(String[] args) {

        //NameOfTheClassWhoseCopyWeWishToCreate NameYouWantToGiveToYourCopy = new NameOfTheClassWhoseCOpyWeWishToCreate();
        Resume rebekah = new Resume();
        rebekah.fName = "Rebekah";
        rebekah.lName = "Joseph";
        rebekah.totalExperience = 5;
        rebekah.isFromIT = false;
        rebekah.Designation = "Manager";

        //NameOfTheClassWhoseCopyWeWishToCreate NameYouWantToGiveToYourCopy = new NameOfTheClassWhoseCOpyWeWishToCreate();
        Resume luxmi = new Resume();
        luxmi.fName ="Luxmi";
        luxmi.lName ="Acharya";
        luxmi.totalExperience =3;
        luxmi.isFromIT = true;
        luxmi.Designation ="QA";

    }
}
