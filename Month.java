import java.util.*;
class Month
{
	public static void main(String args[]){
		String mon;
		int z=0;
		Scanner g= new Scanner(System.in);
		String arr[]= new String[]{"january","february","march","april","may","june","july","august","september","october","november","december"}; //array declaration and initialisation
		int ayy[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};	//array declaration and initialisation
		System.out.println("enter any month");		
		mon=g.next();			//user input for month
		for(int i=0;i<12;i++){
			if(mon.equals(arr[i])){
			System.out.println("number of days in "+mon+" month="+ayy[i]);	//printing number of days in that month
			z++;
			}	
		}
		if(z==0){
		System.out.println("entered month is incorrect.");
		}
	}
}