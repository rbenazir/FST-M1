package activities;

public class Main {
	
	static void exceptionTest(String data) throws CustomException {
		if(data==null)
				throw new CustomException("String value is null");
		else
			System.out.println(data);
	}
	
	public static void main(String[] args) {
		try {
            
            Main.exceptionTest("Will print to console");
            Main.exceptionTest(null); 
           
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
		
	}

}
