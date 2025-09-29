class RegularEmployee extends Employee
{
    double salary;
    RegularEmployee(String ename,int eno)
    {
      super(ename,eno);
    }
    void disp()
    {
      System.out.println("Employee name   = "+ename);
      System.out.println("Employee number = "+eno);
      System.out.println("Salary = "+salary);

    }
}
