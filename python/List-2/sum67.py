#Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
#
#sum67([1, 2, 2]) → 5
#sum67([1, 2, 2, 6, 99, 99, 7]) → 5
#sum67([1, 1, 6, 7, 2]) → 4
def sum67(nums):
  result=0
  flag=False
  for i in range(len(nums)):
    if nums[i]==6:
      flag=True
      continue
    if flag and nums[i]==7:
      flag=False
      continue
    if not flag:
      result=result+nums[i]
  return result

print sum67([1, 2, 2]) 
print sum67([1, 2, 2, 6, 99, 99, 7])
print sum67([1, 1, 6, 7, 2])
