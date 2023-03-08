package pnarray;

public class Count {

	public static void main(String[] args) {
		int arr[]= {4,-4,6,8,-9,0,4,-7,56};
		int ncount=0;
		int pcount=0;
		int length=arr.length;
		for(int i=0;i<length;i++) {
			if(arr[i]<0) {
				ncount++;
				
			}else if(arr[i]>0) {
				pcount++;
			}
	
	}


	System.out.println("no of positive numbers :"+pcount);
	System.out.println("no of NEGATIVE numbers :"+ncount);
}
}