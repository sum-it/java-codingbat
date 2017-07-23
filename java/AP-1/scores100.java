//Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
//
//scores100([1, 100, 100]) → true
//scores100([1, 100, 99, 100]) → false
//scores100([100, 1, 100, 100]) → true

public boolean scores100(int[] scores) {
  for (int count=0;count<scores.length-1;count++){
    if (scores[count]==100 && scores[count+1]==100)
      return true;
  }
  return false; 
}

