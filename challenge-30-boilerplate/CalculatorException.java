public class CalculatorException extends Exception{
    private static final long serialVersionUID=1L;
    String str1;
    CalculatorException(String str2)
    {
        str1=str2;
    }
    public String toString(){
        return ("CalculatorException:"+str1);
    }
    
}
