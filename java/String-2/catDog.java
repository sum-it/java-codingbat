//Return true if the string "cat" and "dog" appear the same number of times in the given string.
//
//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true
public boolean catDog(String str) {
  int c=0;
  int d=0;
  for (int count=0;count<str.length()-2;count++){
    if (str.substring(count,count+3).equals("cat"))
      c++;
    if (str.substring(count,count+3).equals("dog"))
      d++;
  }
  if (c==d)
  return true;
  return false;
}

