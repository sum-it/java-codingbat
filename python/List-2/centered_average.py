#Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
#
#centered_average([1, 2, 3, 4, 100]) → 3
#centered_average([1, 1, 5, 5, 10, 8, 7]) → 5
#centered_average([-10, -4, -2, -4, -2, 0]) → -3

def centered_average(nums):
  bigger=nums[0]
  smaller=nums[0]
  total=0
  for i in range(len(nums)):
    total=total+nums[i]
    smaller=min(smaller,nums[i])
    bigger=max(bigger,nums[i])
  return ((total- (bigger+smaller))/(len(nums)-2))


