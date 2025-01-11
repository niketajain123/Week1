public class VolumeOfEarth{
	public static void main(String[]args){
		//create a variable radius to indicate radius of earth in kilometers
		int radius=6378;
		//create a variable volumeInKilometers to indicate volume of earth in kilometers
		//logic used for volumeInKilometers=>4/3*pi*r^3
		double volumeInKilometers=4/3*Math.PI*Math.pow(radius,3);
		//create a variable volumeInMiles to indicate volume of earth in miles
		//logic used for volumeInMiles=>volumeInKilometers*1.6
		double volumeInMiles=volumeInKilometers*1.6;
		//printing volume of earth in cubic kilometers and cubic miles 
		System.out.println("The volume of earth in cubic kilometers is"+volumeInKilometers+" and cubic miles is"+volumeInMiles);
	}
}