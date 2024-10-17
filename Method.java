public class Method{
	public static void main(String[] args){
		chikenRate();
		lightOn();
		lightOff();
		trafficLight();


	}

	public static void lightOn(){
		System.out.println("Please on the Light");
	}

    public static void lightOff(){
    	System.out.println("Please off the Light");
    }

    public static void trafficLight(){
    	System.out.println("Red : This Light Indicates the Stop");
    	System.out.println("Yellow : This Light Indicates Ready to Go");
    	System.out.println("Green : This Light Indicates To Go");
    }

    public static void chikenRate(){
    	short realPrize = 250;
    	short buyPrize = 200;
    	byte profit = 250-200;
    	System.out.println("profit : " + profit);
    }
}