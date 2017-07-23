//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//
//array123([1, 1, 2, 3, 1]) → true
//array123([1, 1, 2, 4, 1]) → false
//array123([1, 1, 2, 1, 2, 3]) → true

public boolean array123(int[] nums) {
  if (nums.length <3)
    return false;
  for (int count=0;count<nums.length-2;count++){
    if(nums[count]==1 && nums[count+1]==2 && nums[count+2]==3)
      return true;
  }
  return false;
}

