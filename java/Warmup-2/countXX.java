//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//countXX("abcxx") → 1
//countXX("xxx") → 2
//countXX("xxxx") → 3

int countXX(String str) {
  int result=0;
  if (str.length()<2)
    return result;
  for (int count=1; count <str.length();count++){
    if (str.charAt(count)=='x' && str.charAt(count-1)=='x')
      result++;
  }
  return result;  
}

