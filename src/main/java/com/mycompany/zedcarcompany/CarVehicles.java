package com.mycompany.zedcarcompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karab
 */
public class CarVehicles {
    private String modelYear;
    private int engineSize;
    private String injectorType;
    private String carStatus;
    private CarType cartype;
    
    public void setmodelYear(String modelyear){
        modelYear = modelyear;
        
    }
    public String getmodelYear(){
        return modelYear;
    }
    
    public void setengineSize(int SizeOfengine){
        engineSize = SizeOfengine;
    }
    
    public int getengineSize(){
        return engineSize;
    }
    
    public void setinjectorType(String injtype){
        injectorType = injtype;
    }
    
    public String getinjectorType(){
         return injectorType;
    }
    
    public void setcarStatus(String Status){
        carStatus = Status;
    }
    
    public String getcarStatus(){
        return carStatus;
    }
    
    public CarType setcarType ( CarType cartypes){
        carType = cartypes ;
    }
    
    public CarType getcarType(){
        return carType;
    }
    
    public abstract double getPrcice();
    // the abstract method used in the subclass that will act as polymorphsim in teh pricing logic
    
    @Override 
    public String toString(){
        System.out.println("The car model was made in:" + modelYear + 
                "\nThe Car type is" + carType + "The engine szie of the veicle is:" + engineSize+
                "\nInjector type of the  vehicle is:" + injectorType +
                "\nThe status of teh vehicle stands at: " + carStatus);
        
        return carType;
    }
    
}
