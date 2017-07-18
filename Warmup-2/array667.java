//Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
//
//array667([6, 6, 2]) → 1
//array667([6, 6, 2, 6]) → 1
//array667([6, 7, 2, 6]) → 1
public int array667(int[] nums) {
  int result=0;
  for (int count=0;count<nums.length-1;count++){
    if (nums[count]==6 && (nums[count+1]==6 || nums[count+1]==7))
      result++;
  }
  return result;
}
