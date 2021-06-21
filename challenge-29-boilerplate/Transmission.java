class Transmission
{
    String model;
    int forwardGears;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;
    double sixthGearRatio;
    double seventhGearRatio;
    double eightGearRatio;

    public Transmission(String model,int forwardGears,double firstGearRatio,double secondGearRatio,double thirdGearRatio,double fourthGearRatio,double fifthGearRatio,
    double sixthGearRatio,double seventhGearRatio,double eightGearRatio)
    {
        this.model=model;
        this.forwardGears=forwardGears;
        this.firstGearRatio=firstGearRatio;
        this.secondGearRatio=secondGearRatio;
        this.thirdGearRatio=thirdGearRatio;
        this.fourthGearRatio=fourthGearRatio;
        this.fifthGearRatio=fifthGearRatio;
        this.sixthGearRatio=sixthGearRatio;
        this.seventhGearRatio=seventhGearRatio;
        this.eightGearRatio=eightGearRatio;
    }
    public Transmission()
    {
        super();
    }
    public void showSpec()
    {
        System.out.format("%s%d\n","Forward Gears:",forwardGears);
        System.out.format("%s%.3f\n","1st Gear Ratio:",firstGearRatio);
        System.out.format("%s%.3f\n","2nd Gear Ratio:",secondGearRatio);
        System.out.format("%s%.3f\n","3rd Gear Ratio:",thirdGearRatio);
        System.out.format("%s%.3f\n","4th Gear Ratio:",fourthGearRatio);
        if(fifthGearRatio!=0.0){
            System.out.format("%s%.3f\n","5th Gear Ratio:",fifthGearRatio);
        }
        if(sixthGearRatio!=0.0){
            System.out.format("%s%.3f\n","6th Gear Ratio:",sixthGearRatio);
        }
        if(seventhGearRatio!=0.0){
            System.out.format("%s%.3f\n","7th Gear Ratio:",seventhGearRatio);
        }
        if(eightGearRatio!=0.0){
            System.out.format("%s%.3f\n","8th Gear Ratio:",eightGearRatio);
        }

    }
}


