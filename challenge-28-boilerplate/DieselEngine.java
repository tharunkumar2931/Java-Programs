class DieselEngine extends InternalCombustion {
    public DieselEngine(int modelNumber){
        super();
        if(modelNumber==1300)
        {
            DiselEngineForOne();
        }
        if(modelNumber==1800)
        {
            DiselEngineForTwo();
        }
        if(modelNumber==2400)
        {
            DiselEngineForThree();
        }
        
    }
    

    public void DiselEngineForOne()
    {
        this.displacement=1248;
        this.maxPower=67;
        this.maxRPM=6000;
        this.maxTorque=200;
        this.weight=111;
        this.cylinders=4;
        this.compRatio = "17.6:1";
    }

    public void DiselEngineForTwo() {
        this.displacement = 1796;
        this.maxPower = 103;
        this.maxRPM = 6300;
        this.maxTorque = 170;
        this.weight = 141;
        this.cylinders = 4;
        this.compRatio = "10.5:1";

    }

    public void DiselEngineForThree() {
        this.displacement = 2384;
        this.maxPower = 136;
        this.maxRPM = 7000;
        this.maxTorque = 233;
        this.weight = 151;
        this.cylinders = 4;
        this.compRatio = "11.62:1";
    }
    
    
    
    
}
