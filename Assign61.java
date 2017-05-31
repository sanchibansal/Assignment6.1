import java.util.*;
class Assign61
{
	public static void main(String args[]){	
		int c=1;
		int arr[]= new int[10];	//array declaration
		for(int i=0;i<10;i++){	//array intialisation
			arr[i]=c;
			c++;	
		}
		for(int i=0;i<10;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");	//printing even numbers
			}
		}

	}
}