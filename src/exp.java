
public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution
		{
		    public static void conquer(ArrayList<Integer> a,int si,int mid,int ei){
		        int []merged = new int[ei-si];
		        int idx1=si;
		        int idx2=mid+1;
		        int x=0;
		        while(idx1<=mid && idx2<=ei){
		            if(a.get(idx1)<a.get(idx2)){
		                merged[x++]=a.get(idx1++);
		            }else{
		                merged[x++]=a.get(idx2++);
		            }
		        }
		        while(idx1<=mid){
		             merged[x++]=a.get(idx1++);
		        }
		        while(idx2<=ei){
		             merged[x++]=a.get(idx2++);
		        }
		        for(int i=si,j=0;j<merged.length;i++,j++){
		            a.set(i,merged[j]);
		        }
		    }
		    public static void divide(ArrayList<Integer> a,int si,int ei){
		        if(si>=ei)return;
		        int mid = si + (ei-si)/2;
		        divide(a,si,mid);
		        divide(a,mid+1,ei);
		        conquer(a,si,mid,ei);
		    }
		    public long findMinDiff (ArrayList<Integer> a, int n, int m)
		    {
		     divide(a,0,a.size()-1);
		     long smallest =Integer.MAX_VALUE;
		     for(int i=0; i<a.size();i++){
		         if(a.get(i+m-1)-a.get(i)<smallest){
		             smallest=a.get(i+m-1)-a.get(i);
		         }
		     }
		     return smallest;
		    }
		}
	}

}
