package target;

import java.util.*;
import java.io.*;

public class MangeshDBMS implements Serializable
{
    private static final long serialVersionUID = 1L;
    private LinkedList <Employee> Table;

    public MangeshDBMS()
    {
        //System.out.println("Mangesh DBMS started successfully...");
        Table = new LinkedList<>();
    }

    // Insert into Employee values(id,name,age,address,salary)
    public void InsertIntoTable(    String name ,
                                    int age, 
                                    String address,
                                    int salary
                                )
    {

        Employee eobj = new Employee(name,age,address,salary);

        Table.add(eobj);

        System.out.println("Mangesh DBMS > New reacord inserted successfully");
    }

    // select * from Employee
    public void SeletStarFrom()
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Data from the Employee table");
        System.out.println("-----------------------------------------------------");

        for(Employee eref : Table)
        {
            if(eref == null)
            {
                System.out.println("There are no data");
            }
            else
            {
                System.out.println(eref);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    //Restore Backup 
    public static MangeshDBMS RestoreBackup(String path)
    {
        try
        {
            MangeshDBMS ret = null;
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ret = (MangeshDBMS)ois.readObject();
            return ret;
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+ obj);
            return null;
        }
    }
    //Take backup
    public void TakeBackup()
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("MangeshDB.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            System.out.println("Mangesh DBMS gets succesfully store into secondary storaage");
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+ obj);
        }
    }

    // select * from Employee where EmpID = 11
    public void SelectSpecificId(int id)
    {
        boolean found = false;

        for(Employee eref : Table)
        {
            if(eref.EmpId == id)
            {
                found = true;
                System.out.println(eref);
                break;
            }
        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
    }
    // select * from Employee where EmpName = 'amit'
    public void SelectSpecificName(String name)
    {
        boolean found = false;

        for(Employee eref : Table)
        {
            if(name.equals(eref.EmpName))
            {
                found = true;
                System.out.println(eref);
            }
        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
    }

    // delete from Employee where EmpId = 11
    public void DeleteSpecificId(int id)
    {
        int index = 0;
        boolean found = false;

        for(Employee eref : Table)
        {
            if(eref.EmpId == id)
            {
                found = true;
                break;
            }
            index++;

        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
        else
        {
            Table.remove(index);
            System.out.println("Record successfully delete");
        }
    }

    // delete from Employee where EmpName = Mangesh
    public void DeleteSpecificName(String name)
    {
        int index = 0;
        boolean found = false;

        for(Employee eref : Table)
        {
            if(eref.EmpName == name)
            {
                found = true;
                break;
            }
            index++;

        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
        else
        {
            Table.remove(index);
            System.out.println("Record successfully delete");
        }
    }

    //Select * from Employee where EmpSalary = salary;
    public void SelectStarBySpecificSalary(int salary)
    {
        boolean found = false;

        for(Employee eref : Table)
        {
            if(eref.EmpSalary == salary)
            {
                found = true;
                System.out.println(eref);
                break;
            }
        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
    }

    //Select EmpName from Employee where EmpSalary = salary;
    public void SelectNameBySpecificAddress(String address)
    {
        boolean found = false;

        for(Employee eref : Table)
        {
            if(eref.EmpAddress.equals(address))
            {
                found = true;
                System.out.println(eref);
                break;
            }
        }
        if(found == false)
        {
            System.out.println("There is no data");
        }
    }

}