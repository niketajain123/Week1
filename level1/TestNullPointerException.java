public class TestNullPointerException{
	public void generateNullPointerException(){
		String text=null;
		try{
			text.toString();
		}
		catch(NullPointerException ex){
			System.out.println("NullPointerException generated and catched");
		
		}
	}
	public static void main(String[]args){
		TestNullPointerException exc=new TestNullPointerException();
		exc.generateNullPointerException();
	}
}
		