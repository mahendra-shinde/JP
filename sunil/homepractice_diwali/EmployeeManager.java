package com.amit.homepractice_diwalivacation;

public class EmployeeManager extends EmployeeManagement {

    long perks;

    public EmployeeManager(int id, String name, long salary, long perks) throws Exception{
            super(id, name, salary);
            setPerks(perks);
    }

    public long getPerks(){

        return this.perks;
    }

    public void setPerks(long perks)throws Exception{

        if (perks<=0 || perks<=this.perks){
            throw new Exception("Invalid Perks");
        }else{

            this.perks = perks;
        }


    }


}
