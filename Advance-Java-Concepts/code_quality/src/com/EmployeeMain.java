package com;

import java.util.logging.Logger;

/**
 * Main class to demonstrate Employee object creation.
 * 
 * Author: Deep Gupta
 */
public final class EmployeeMain {

    /** Logger instance for logging information */
    private static final Logger LOGGER = Logger.getLogger(EmployeeMain.class.getName());

    /**
     * Private constructor to prevent instantiation.
     */
    private EmployeeMain() {
        // Utility class constructor
    }

    /**
     * Main method - program entry point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {

        Employee emp = new Employee(101, "amit", "amit@gmail.com");

        LOGGER.info("EmployeeId -> " + emp.getEmpId());
        LOGGER.info("EmployeeName -> " + emp.geteName());
        LOGGER.info("EmployeeEmail -> " + emp.getEmail());
    }
}