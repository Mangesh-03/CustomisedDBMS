import target.Employee;
import target.MangeshDBMS;
import java.util.*;
import java.io.*;

class CustomisedDBMS
{
    public static void main(String a[]) 
    {
        MangeshDBMS mobj = null;

        if(a.length == 1)
        {
            File fobj = new File(a[0]); 

            if(fobj.exists() && fobj.isFile())  
            {
                try
                {
                    mobj = MangeshDBMS.RestoreBackup(a[0]);
                    System.out.println("Restore backup from backup File");
                }
                catch(Exception eobj)
                {
                    System.out.println("Error : "+eobj.getMessage());
                }
            }          
        }
        else
        {
            System.out.println("Unable to restore backup As Not provide backup file name or path");
        }   
        
        if(mobj == null)
        {
            System.out.println("Unable to restore backup");
            mobj = new MangeshDBMS();
        }
        Scanner sobj = new Scanner(System.in);

        int iOption = 0;
        int salary = 0;
        String name = "";
        String address = "";
        int age = 0;
        int id = 0;

        System.out.println("-----------------------------------------------------");
        System.out.println("---------------- Mangesh DBMS --------------------");
        System.out.println("-----------------------------------------------------");

        while(iOption != 20)
        {
            try
            {
                System.out.println("-----------------------------------------------------");
                System.out.println("1 : Insert into Employee");
                System.out.println("2 : select * from Employee");
                System.out.println("3 : Take a backup of Table");
                System.out.println("4 : select * from Employee where EmpId = ");
                System.out.println("5 : select * from Employee where EmpName = ");
                System.out.println("6 : delete from Employee where EmpId = ");
                System.out.println("7 : delete from Employee where EmpName = ");
                System.out.println("8 : select * from Employee where salary = ");
                System.out.println("9 : select EmpName from Employee where Adress = ");
                System.out.println("20 : Terminate the DBMS");
                System.out.println("-----------------------------------------------------");

                System.out.println("Please select the desire operation on database");
                iOption = sobj.nextInt();

                if(iOption == 1)
                {   
                    System.out.println("Please enter data that you want to add");

                    sobj.nextLine();

                    System.out.println("Enter the name of Employee");
                    name = sobj.nextLine();

                    System.out.println("Enter the age of Employee");
                    age = sobj.nextInt();
                    
                    System.out.println("Enter the address of Employee");
                    address = sobj.nextLine();
                    
                    sobj.nextLine();

                    System.out.println("Enter the salary of Employee");
                    salary = sobj.nextInt();
                    
                    mobj.InsertIntoTable(name,age,address,salary);
                }
                else if(iOption == 2)
                {
                    mobj.SeletStarFrom();
                }
                else if(iOption == 3)
                {
                    mobj.TakeBackup();
                }
                else if(iOption == 4)
                {
                    System.out.println("Enter the Employee id :");
                    id = sobj.nextInt();

                    mobj.SelectSpecificId(id);
                }
                else if(iOption == 5)
                {
                    sobj.nextLine();
                    System.out.println("Enter the name of Employee :");
                    name = sobj.nextLine();

                    mobj.SelectSpecificName(name);
                }
                else if(iOption == 6)
                {
                    System.out.println("Enter the Employee id :");
                    id = sobj.nextInt();

                    mobj.DeleteSpecificId(id);
                }
                else if(iOption == 7)
                {
                    System.out.println("Enter the Employee Name : ");
                    name = sobj.nextLine();

                    mobj.DeleteSpecificName(name);
                }
                else if(iOption == 8)
                {
                    System.out.println("Enter salary of Employee : ");
                    salary = sobj.nextInt();

                    mobj.SelectStarBySpecificSalary(salary);
                }
                else if(iOption == 9)
                {
                    System.out.println("Enter Address of Employee : ");
                    address = sobj.nextLine();

                    mobj.SelectNameBySpecificAddress(address);
                }

                // add more query
                else if(iOption == 20)
                {
                    System.out.println("Thank you for using Mangesh DBMS");
                    mobj = null;
                    System.gc();
                    break;
                }
            }
            catch(Exception  obj )
            {
                System.out.println("Error : "+obj.getMessage());
            }
        }// End of while
    }// End of main
}//End of main class



