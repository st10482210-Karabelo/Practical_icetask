/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class Mercedes_Car {
 
    public Mercedes_Car(
            String modelYear, 
            int engineSize,
            String injectorType,
            String carStatus){
        
        super(CarType.Mercedes, modelYear, engineSize, injectorType, carStatus);
    }
    
    @Override 
    public double getPrice(){
        return getCarStatus().equalIgnoreCase("Used");
    }
      
}
