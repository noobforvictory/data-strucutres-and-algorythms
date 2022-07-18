class Solution {
    public  void conqure(int[]nums1, int si, int mid, int ei) {
		int [] merged= new int[(ei-si)+1]; 
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			if(nums1[idx1]<=nums1[idx2]) {
				merged[x++]=nums1[idx1++];
			}else {
				merged[x++]=nums1[idx2++];
			}
		}
		while(idx1<=mid) {
			merged[x++]=nums1[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=nums1[idx2++];
		}
		for(int i=0,j=si;i<merged.length;i++,j++) {
			nums1[j]=merged[i];
		}
	}
    public  void divide(int[]nums1, int si, int ei) {
		if(si>=ei)return ;
		int mid = si+(ei-si)/2;
		divide(nums1,si,mid);
		divide(nums1,mid+1,ei);
		conqure(nums1, si, mid, ei);
    }
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m,j=0;j<nums2.length;i++,j++){
            nums1[i]=nums2[j];
        }
        divide(nums1,0,nums1.length-1);
    }
}