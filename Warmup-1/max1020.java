//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
//max1020(11, 19) → 19
//max1020(19, 11) → 19
//max1020(11, 9) → 11

public int max1020(int a, int b) {
  if ( a >=10 && a <=20){
    if ((b<10 || b >20)|| a>=b)
    return a;
  }
  if ( b >=10 && b <=20)
    return b;
  return 0;
}

