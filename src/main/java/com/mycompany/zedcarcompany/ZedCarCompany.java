/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zedcarcompany;

import java.util.Scanner;
public class ZedCarCompany {

    public static void main(String[] args) {

       Scanner carchoice = new Scanner(System.in);
        CarInventory theZedCarComp = new CarInventory();
        
        //display the menu
        System.out.println("Select a vehicle car type: 1-Mercedes , 2-BMW, 3- Suzki");
        int choiceOfUser = carchoice.nextInt();
        
        System.out.println("Select engine size: 1- Four wheel , 2- Six wheels");
        int choiceofengine = carchoice.nextInt();
        
        System.out.println("Select the the injector type: 1- Diesel , 2- Petrol");
        int choiceOfinjector = carchoice.nextInt();
        
        try{
            CarType type;
            switch(choiceOfUser){
                case 1: type = CarType.Mercedes;
                break;
                case 2:type = CarType.BMW;
                break;
                
                case 3: type = CarType.Suzki;
                break;
                
                default: throw new InvalidCarTypeException("Invalid car type" + choiceOfUser);
            }
            
            EngineSize theengine;
            switch (choiceofengine){
                case 1: engine = EngineSize.FOUR_Wheel;
                break;
                case 2: engine = EngineSize.Six_Wheel;
                break;
                
                default: throw new InvalidCarTypeException("Invalid engine size" + theengine);
                
                
               
            }
            
            InjectorType injector;
            switch (choiceOfinjector){
                case 1: injector = InjectorType.Petrol;
                break;
                case 2: injector = InjectorType.Diesel;
                break;
                
                default: throw new InvalidCarTypeException("Invalid type of injector: " +choiceOfinjector );
               
            }
            
            Car Found = inventory.findMatch(type,theengine , injector );
            System.out.println(found);
        }
        catch(InvalidCarTypeException e){
            System.out.println("Error:" + e.getMessage());
        }
        finally{
            carchoice.close();
        }
        
          
    
}
