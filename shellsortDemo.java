import java.util.*;

public class shellsortDemo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int[] a=new int[4];
		System.out.println("PLZ input data:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("the data you input:"+Arrays.toString(a));
		shellsort(a);
		System.out.println("the data after shell sort:"+Arrays.toString(a));
	}
	public static void shellsort(int[]a){
		int k=a.length/2;
		while(k>=1){
			sort(a,k);
			k=k/2;
		}
	}
	public static void sort(int[] a,int k){
		for(int i=k;i<a.length;i++){
			if(a[i]<a[i-k]){
				int temp=a[i];
				//1 2 a[i]=a[i-k];
				int j; 
				for(j=i-k;j>=0&&temp<a[j];j=j-k){
					a[j+k]=a[j];
				}
				a[j+k]=temp;
			}
		}
	}
}