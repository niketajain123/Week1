import java.util.Scanner;
public class EmployeeIncome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double employee[][]=new double[10][2];
		double salary,yos;
		double totalBonus=0, totalOldSalary=0, totalNewSalary=0;
		for(int i=0;i<10;i++){
				System.out.println("Enter salary and years of service of employee"+(i+1)+" : ");
				salary=sc.nextDouble();
				yos=sc.nextDouble();
				if(yos<0||salary<0)
				{
					System.out.println("Invalid salary or year of service. Enter again!");
					i--;
				}
				else{
					employee[i][0]=salary;//inserting salary
					employee[i][1]=yos;//inserting year of service
					totalOldSalary+=salary;
				}
				
		}
		double updated[][]=new double[10][2];
		
		//computing bonus ans new salary
		for(int i=0;i<10;i++){
			if(employee[i][1]>=5){
				updated[i][1]=employee[i][0]*0.05;//bonus
			}
			else{
				updated[i][1]=employee[i][0]*0.02;//bonus
			}
			updated[i][0]=employee[i][0]+updated[i][1];//new salary
			totalBonus+=updated[i][1];
			totalNewSalary+=updated[i][0];
		}
		//printing result
		System.out.println("Total bonus payout is "+totalBonus);
		System.out.println("Total old salary is "+totalOldSalary);
		System.out.println("Total new salary is "+totalNewSalary);
		
		//closing sc object
		sc.close();
	}
}
			