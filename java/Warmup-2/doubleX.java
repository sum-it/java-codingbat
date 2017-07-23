//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true

boolean doubleX(String str) {
  for (int count=0; count<str.length()-1;count++){
    if (str.charAt(count)=='x'){
      if (str.charAt(count+1)=='x'){
        return true;
      }
        return false;
    }
  }
  return false;
}

