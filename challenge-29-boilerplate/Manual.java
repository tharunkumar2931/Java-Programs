 class Manual extends Transmission {
     public Manual(String model){
         super();
         if(model.equals("MP4"))
         {
             firstModel();
         }
         if(model.equals("MP5"))
         {
             secondModel();
         }
    
         if(model.equals("MP6"))
         {
             thirdModel();
         }
         if(model.equals("MD5"))
         {
             fourthModel();
         }
         if(model.equals("MD6"))
         {
             fifthModel();
         }
         
     }
     public void firstModel(){
         this.forwardGears=4;
         this.firstGearRatio=2.540;
         this.secondGearRatio=1.9020;
         this.thirdGearRatio=1.510;
         this.fourthGearRatio=1.000;
    }
     public void secondModel()
     {
         this.forwardGears=5;
         this.firstGearRatio=3.545;
         this.secondGearRatio=1.904;
         this.thirdGearRatio=1.208;
         this.fourthGearRatio=0.914;
         this.fifthGearRatio=0.757;
    }
    public void thirdModel()
    {
        this.forwardGears=6;
        this.firstGearRatio=3.010;
        this.secondGearRatio=2.070;
        this.thirdGearRatio=1.430;
        this.fourthGearRatio=1.000;
        this.fifthGearRatio=0.710;
        this.sixthGearRatio=0.570;
    }
    public void fourthModel()
    {
        this.forwardGears=5;
        this.firstGearRatio=3.545;
        this.secondGearRatio=1.904;
        this.thirdGearRatio=1.233;
        this.fourthGearRatio=0.911;
        this.fifthGearRatio=0.725;
    }
    public void fifthModel()
    {
        this.forwardGears=6;
        this.firstGearRatio=3.640;
        this.secondGearRatio=2.150;
        this.thirdGearRatio=1.360;
        this.fourthGearRatio=1.000;
        this.fifthGearRatio=0.750;
        this.sixthGearRatio=0.630;
    }

    
    
}
