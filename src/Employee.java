package target;

import java.util.*;
import java.io.*;

public class Employee implements Serializable
{
    private static final long serialVersionUID = 1L;
    public int EmpId;
    public String EmpName;
    public int EmpAge;
    public String EmpAddress;
    public int EmpSalary;
    
    private static int Counter;

    static
    {
        Counter = 1;
    }

    public Employee(String b , int c , String d ,int e)
    {
        this.EmpId = Counter++;
        this.EmpName = b;
        this.EmpAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }
    public void DisplayInformation()
    {
        System.out.println("EmpId : "+this.EmpId+" EmpName : "+this.EmpName+" EmpAge: "+this.EmpAge+" EmpAddress : "+this.EmpAddress+" EmpSalary : "+this.EmpSalary);
        System.out.println();
    }

    public String toString()
    {
        return "EmpId : "+this.EmpId+" EmpName : "+this.EmpName+" EmpAge: "+this.EmpAge+" EmpAddress : "+this.EmpAddress+" EmpSalary : "+this.EmpSalary;
    }
}