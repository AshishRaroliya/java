class Ash {    public static boolean test(int [] ar, int ele)  {
     
	 int start =  0;
	 int last  = ar.length-1;

	 for(int i =0 ; i<ar.length ; i++)
	 {
      int mid= (start+last)/2;
      if(ar[mid]==ele)
       {
      	return true;
       }
       else if(ar[mid]>ele)
       {
       	last = mid-1;
       }
       else
       {
       start = mid+1;
       }
     }
     
       return false;	
}}
class Ash2
{
	public static void main(String[] args) {
		int ar[ ] = {1,2,3,4,5,6,232,999};
	    int ele   = 2;
	boolean res   = Ash.test(ar,ele);
	System.out.println(res);
}
}
