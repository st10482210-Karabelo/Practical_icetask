/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karab
 */
public class BMW_vehicle extends CarVehicles{
    public BMW_vehicle(
    String modelYear, 
            int engineSize,
            String injectorType,
            String carStatus,
    )
    {
        super(CarType.BMW, modelYear, engineSize, injectorType, carStatus);
    }
    
    @Override
    public double getPrice(){
        if (getCarStatus().equalsIgnoreCase("Used"));
    }
}
