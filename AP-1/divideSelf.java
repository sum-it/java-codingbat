//We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
//
//dividesSelf(128) → true
//dividesSelf(12) → true
//dividesSelf(120) → false

public boolean dividesSelf(int n) {
  int number=n;
  if (n==0)
  return false;
  if (n/10 == 0)
  return true;
  while (n>=1){
    if (n%10 ==0)
      return false;
    if ((number)%(n%10)!=0)
      return false;
    n=n/10;
  }
  return true;
}

