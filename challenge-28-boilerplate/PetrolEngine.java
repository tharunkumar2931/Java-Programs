class PetrolEngine extends InternalCombustion {
    public PetrolEngine(int modelNumber){
        super();
        if(modelNumber==1000)
        {
            petrolEngineModelOne();
        }
        if(modelNumber==1500)
        {
            petrolEngineModelTwo();
        }
        if(modelNumber==2000)
        {
            petrolEngineModelThree();
        }
        if(modelNumber==2400)
        {
            petrolEngineModelFour();
        }
    }
    public void petrolEngineModelOne()
    {
        this.displacement=996;
        this.maxPower=50;
        this.maxRPM=6000;
        this.maxTorque=90;
        this.weight=75;
        this.cylinders=3;
        this.compRatio="11.0:1";
    }
    public void petrolEngineModelTwo()
    {
        this.displacement=1498;
        this.maxPower=88;
        this.maxRPM=6500;
        this.maxTorque=155;
        this.weight=93;
        this.cylinders=4;
        this.compRatio="10.3:1";
    }
    public void petrolEngineModelThree()
    {
        this.displacement=1992;
        this.maxPower=118;
        this.maxRPM=6500;
        this.maxTorque=220;
        this.weight=125;
        this.cylinders=4;
        this.compRatio="12.0:1";
    }
    public void petrolEngineModelFour()
    {
        this.displacement=2396;
        this.maxPower=138;
        this.maxRPM=6900;
        this.maxTorque=340;
        this.weight=140;
        this.cylinders=6;
        this.compRatio="10.5:1";
    }   
}
