//Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
//
//scoresClump([3, 4, 5]) → true
//scoresClump([3, 4, 6]) → false
//scoresClump([1, 3, 5, 5]) → true

public boolean scoresClump(int[] scores) {
  for (int count=0;count <scores.length-2;count++){
    if ((Math.abs(scores[count]-scores[count+1]) + 
    Math.abs(scores[count+1]-scores[count+2]) )<=2)
    return true;
  }
  return false;
}

