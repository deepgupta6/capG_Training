package com;

/**
 * Employee class represents an employee entity with id, name and email.
 * 
 * Author: Deep Gupta
 */
public class Employee {

    /** Employee unique id */
    private int empId;

    /** Employee name */
    private String eName;

    /** Employee email address */
    private String email;

    /**
     * Default constructor.
     */
    public Employee() {
        // empty constructor
    }

    /**
     * Parameterized constructor to initialize employee details.
     *
     * @param empId employee id
     * @param eName employee name
     * @param email employee email
     */
    public Employee(final int empId, final String eName, final String email) {
        super();
        this.empId = empId;
        this.eName = eName;
        this.email = email;
    }

    /**
     * Gets employee id.
     *
     * @return employee id
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets employee id.
     *
     * @param empId employee id
     */
    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    /**
     * Gets employee name.
     *
     * @return employee name
     */
    public String geteName() {
        return eName;
    }

    /**
     * Sets employee name.
     *
     * @param eName employee name
     */
    public void seteName(final String eName) {
        this.eName = eName;
    }

    /**
     * Gets employee email.
     *
     * @return employee email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets employee email.
     *
     * @param email employee email
     */
    public void setEmail(final String email) {
        this.email = email;
    }
}