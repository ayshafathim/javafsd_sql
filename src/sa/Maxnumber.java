package sa;

public class Maxnumber {

	public static void main(String[] args) {
		int arr[]= {5,3,8,1,7,2};
		int max=arr[0];
		int length=arr.length;
		for(int i=0;i<length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("the max no is :"+max);
		}
	}


