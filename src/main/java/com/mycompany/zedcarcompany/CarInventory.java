package com.mycompany.zedcarcompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.*;
public class CarInventory {
    
  ArrayList<CarVehicles> vehicles = new ArrayList<>(); 
  
  public CarInventory(){
      vehicles.add("Mercedes");
  display(vehicles);
  vehicles.add("BMW");
  display(vehicles);
  vehicles.add("Suzki");
  display(vehicles);
  }
  
  
  public CarVehicles findMatch (CarType type, Engine engineSize, InjectorType injectorType ) throws InvalidCarTypeException{
    for (CarVehicles c : vehicles){
        
        if (c.getcartype()== type &&
                c.getengineSize() == engineSize
                && c.getInjectorType() == injectorType){
            
            return c;
        }
        
    } 
    
    throw new InvalidCarTypeException("No car found for type" + type);
}
  public ArrayList<vehicles> getVehicles(){
      return vehicles;
  }
  
  public void display(){
      System.out.println("The size of this list of vehicles is " + vehicles.size());
      System.out.println(vehicles);
  }
}



