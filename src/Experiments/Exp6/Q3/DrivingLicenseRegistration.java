import java.util.*;

class DrivingLicenseRegistration extends User
{
  boolean validate()
  {
    if(age<18)
      return false;
    else if (tel.length()!=10)
      return false;

    else if(emailId.indexOf('@')==-1)
      return false;

    return true;
  }

  public static void main(String[] args)
  {
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
    DrivingLicenseRegistration ob = new DrivingLicenseRegistration();
    ob.accept();
    ob.disp();

    if(ob.validate()==true)
      System.out.println("Eligible for driving ");
    else
      System.out.println("Not eligible");
    System.out.println("----------Divya Kheraj Bhanushali B204----------");
  }
}
