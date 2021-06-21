 class CompressedNaturalGas extends InternalCombustion {
     public CompressedNaturalGas(int modelNumber){
         super();
         if(modelNumber==1000)
         {
             CompressedNaturalGasForOne();
         }
         if(modelNumber==1500)
         {
             CompressedNaturalGasForTwo();
         }
        }
        public void CompressedNaturalGasForOne()
        {
            this.displacement=998;
            this.maxPower=43;
            this.maxRPM=6000;
            this.maxTorque=78;
            this.weight=75;
            this.cylinders=3;
            this.compRatio="11.0:1";
        }
        public void CompressedNaturalGasForTwo()
        {
            this.displacement=1498;
            this.maxPower=69;
            this.maxRPM=6500;
            this.maxTorque=122;
            this.weight=93;
            this.cylinders=4;
            this.compRatio="10.5:1";
        }

    
}
