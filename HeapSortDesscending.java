package javaPrograms;

public class HeapSortDesscending {

	
	//heapify method
	
	public static void heapify(int a[], int n, int i)
	{
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		while(l<n && a[l]<a[largest])
		{
			largest = l;
		}
		
		while(r<n && a[r]<a[largest])
		{
			largest = r;
		}
		
		if(i!=largest)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			
			heapify(a,n,largest);
		}
	
	}
	
	
	public static void main(String[] args) {
		
		
		int a[] = {9,8,7,6,5,-1,-2};
		int n = a.length;
		
		for(int i=n/2; i>=0; i--)
		{
		      heapify(a,n,i);
		}
		
		for(int i=n-1; i>=0; i-- )
		{
			int temp = a[i];
			a[i] = a[0];
			a[0] =temp;
			
			heapify(a,i,0);
		}
		
		
		for(int i:a)
		{
			System.out.print(i+ "  ");
		}
		
		

	}

}
