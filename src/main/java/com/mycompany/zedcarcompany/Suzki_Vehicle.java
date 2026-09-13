/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karab
 */
public class Suzki_Vehicle extends CarVehicles{
    public Suzki_Vehicle(String modelYear, 
            int engineSize,
            String injectorType,
            String carStatus)
    {
         super(CarType.Suzki, modelYear, engineSize, injectorType, carStatus);
    }
       
    )
        
    
    @Override 
    public double getPrice(){
        if (getCarStatus().equalIgnoreCase("Used"));
    }
}
