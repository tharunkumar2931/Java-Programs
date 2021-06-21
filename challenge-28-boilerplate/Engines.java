public class Engines {
    int displacement;
    int cylinders;
    String compRatio;
    int modelNumber;
    int maxPower;
    int maxRPM;
    int maxTorque;
    int weight;
    String currentType;
    int voltage;
    public Engines() {
	}
    public Engines(int modelNumber,int maxPower,int maxRPM,int maxTorque,int weight){
        this.modelNumber=modelNumber;
        this.maxPower=maxPower;
        this.maxRPM=maxRPM;
        this.maxTorque=maxTorque;
        this.weight=weight;
    }
	public void showSpecifications(String engineType,String powerSource,int modelNumber)
    {
        if(engineType.equalsIgnoreCase("InternalCombustion"))
        {
            if(powerSource.equalsIgnoreCase("petrol"))
            {
                PetrolEngine pe=new PetrolEngine(modelNumber);
                System.out.println("Key Specifications:");
                System.out.println("MaxPower is:"+pe.maxPower+"\n"+"MaxRPM is:"+pe.maxRPM+"\n"+"MaxTorque is:"+pe.maxTorque+"\n"+"Weight is:"+pe.weight+"\n"+"Displacement is:"+pe.displacement+"\n"+"compRatio is:"+pe.compRatio+"\n"+"Cylinder is:"+pe.cylinders);
            }
            if(powerSource.equalsIgnoreCase("diesel"))
            {
                System.out.println("Key Specifications:");
                DieselEngine de=new DieselEngine(modelNumber);
                System.out.println("MaxPower is:"+de.maxPower+"\n"+"MaxRPM is:"+de.maxRPM+"\n"+"MaxTorque is:"+de.maxTorque+"\n"+"Weight is:"+de.weight+"\n"+"Displacement is:"+de.displacement+"\n"+"compRatio is:"+de.compRatio+"\n"+"Cylinder is:"+de.cylinders);
            }
            if(powerSource.equalsIgnoreCase("cng"))
            {
                System.out.println("Key Specifications:");
                CompressedNaturalGas cn=new CompressedNaturalGas(modelNumber);
                System.out.println("MaxPower is:"+cn.maxPower+"\n"+"MaxRPM is:"+cn.maxRPM+"\n"+"MaxTorque is:"+cn.maxTorque+"\n"+"Weight is:"+cn.weight+"\n"+"Displacement is:"+cn.displacement+"\n"+"compRatio is:"+cn.compRatio+"\n"+"Cylinder is:"+cn.cylinders); 
            }
            if(engineType.equalsIgnoreCase("ElectricVehicle"))
            {
                if(powerSource.equalsIgnoreCase("electric"))
                {
                   System.out.println("Key Specifications:");
                   ElectricEngine ev=new ElectricEngine(modelNumber);
                   System.out.println("MaxPower is:"+ev.maxPower+"\n"+"MaxRPM is:"+ev.maxRPM+"\n"+"MaxTorque is:"+ev.maxTorque+"\n"+"Weight is:"+ev.weight+"\n"+" Displacement is:"+ev.displacement+"\n"+"compRatio is:"+ev.compRatio+"\n"+" Cylinder is:"+ev.cylinders);
                }
            }
        }  
    }
}
class InternalCombustion extends Engines
{
    int displacement;
    int cylinders;
    String CompRatio;
   public InternalCombustion(){
        super();
    }
    public InternalCombustion(int modelNumber,int maxPower,int maxRPM,int maxTorque,int weight,int displacement,int cylinders,String compRatio){
        super(modelNumber,maxPower,maxRPM,maxTorque,weight);
        this.displacement=displacement;
        this.cylinders=cylinders;
        this.compRatio=compRatio;
    }
}
class ElectricVehicle extends Engines{
    String currentType;
    int voltage;
    public ElectricVehicle(){
      super();
   }

     public ElectricVehicle(int modelNumber, int maxPower, int maxRPM, int maxTorque, int weight, String currentType, int voltage) {
    super(modelNumber,maxPower,maxRPM,maxTorque,weight);
     this.currentType=currentType;
     this.voltage=voltage;
}

}



