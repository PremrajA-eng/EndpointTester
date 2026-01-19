
public class ArraysTest {

	public static void main(String[] args) {
		
		int[] arr= new int[5];
		arr[0]= 3;
		arr[1]= 8;
		arr[2]=30;
		arr[3]= 40;
		arr[4]=32;
		
		int[] arr2 = {23,4232,3234,232,437};
		for(int i=0; i<5;i++) {
			
			if(arr2[i]%2==0) {
			System.out.println("its divisible by 2");
			} 
			else {
				System.out.println(arr2[i] +"is not divisible");
			}
		}
		
		String[] arr3 = new String[6];
		arr3[0] = "prem";
		arr3[1]= "raj";
		arr3[2]="aru";
		arr3[3]= "rithad";
		arr3[4]="washim";
		arr3[5]="risod";
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i] +" ");
		}				
	}
}
