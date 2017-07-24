//Given a string, return a string where for every char in the original, there are two chars.
//
//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"
public String doubleChar(String str) {
  String result="";
  for (int count=0;count<str.length();count++){
    result=result+str.substring(count,count+1) + str.substring(count,count+1);
  }
  return result;
}
