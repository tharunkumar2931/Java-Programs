 class AutomaticManualTransmission extends Transmission{
     public AutomaticManualTransmission(String model)
     {
         if(model.equalsIgnoreCase("AMTP4"))
         {
             firstModel();
         }
         if(model.equalsIgnoreCase("AMTD5"))
         {
             secondModel();
         }

    }
    public void firstModel()
    {
        this.forwardGears=4;
        this.firstGearRatio=2.540;
        this.secondGearRatio=1.920;
        this.thirdGearRatio=1.510;
        this.fourthGearRatio=1.000;
    }
    public void secondModel()
    {
        this.forwardGears=5;
        this.firstGearRatio=2.950;
        this.secondGearRatio=1.940;
        this.thirdGearRatio=1.340;
        this.fourthGearRatio=1.000;
        this.fifthGearRatio=0.630;
    }

    
}
