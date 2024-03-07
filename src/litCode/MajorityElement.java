package litCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int getMajorityEle(int[] nums) {
		int val = nums.length/2;
		int returnVal =0;
		Map<Integer, Integer> mapVal = new HashMap<Integer, Integer>();
		for(int i=0 ; i<nums.length;i++) {
			if(mapVal.containsKey(nums[i])) {
				mapVal.put(nums[i],mapVal.get(nums[i])+1 );
			}else {
				mapVal.put(nums[i],1);
			}
			if(mapVal.get(nums[i])>val) {
				returnVal =  nums[i];
			}
			
		}
		return returnVal;
		
	}
	
	public static void main(String[] args) {
		//int[] a = {3,1,3};
		int[] a = {2,2,1,1,1,2,2};
		
		int majorVal = getMajorityEle(a);
		System.out.println("majorVal..."+majorVal);
		
	}

}
