/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ife
 */
public class SalaryData { 
    private String occupation;
    private double womenSalary;
    private double menSalary;
    private double ratio;

    public SalaryData(String occupation, double womenSalary, double menSalary, double ratio) {
        this.occupation = occupation;
        this.womenSalary = womenSalary;
        this.menSalary = menSalary;
        this.ratio = ratio;
    }

    public String getOccupation() { return occupation; }
    public double getWomen() { return womenSalary; }
    public double getMen() { return menSalary; }
    public double getRatio() { return ratio; }
   
}
