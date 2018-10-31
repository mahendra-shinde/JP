package com.shaunak;

// Creating a Department Class
public class Department {
    private int Department_id;
    private String Department_name;
    private int Manager_id;
    private int Location_id;

// Creating constructor
    public Department(int department_id, String department_name, int manager_id, int location_id) {
        Department_id = department_id;
        this.Department_name =department_name;
        Manager_id = manager_id;
        Location_id = location_id;
    }

    // Creating Getter Setter methods

    public int getDepartment_id() {
        return Department_id;
    }

    public void setDepartment_id(int department_id) {
        Department_id = department_id;
    }

    public String getDepartment_name() {
        return Department_name;
    }

    public void setDepartment_name(String Department_name) {
        this.Department_name = Department_name;
    }

    public int getManager_id() {
        return Manager_id;
    }

    public void setManager_id(int manager_id) {
        Manager_id = manager_id;
    }

    public int getLocation_id() {
        return Location_id;
    }

    public void setLocation_id(int location_id) {
        Location_id = location_id;
    }
}
