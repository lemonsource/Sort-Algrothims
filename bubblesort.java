import java.util.*;
public class bubblesort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a =new int[4];
		for(int i=0;i<4;i++){
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Your input and before sort is : "+Arrays.toString(a));
		bubble(a);
		System.out.println("After the bubblesort, the aaray is  : ["+Arrays.toString(a)+"]");
	}
	public static void bubble(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length-1;j++){
				int temp;
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}