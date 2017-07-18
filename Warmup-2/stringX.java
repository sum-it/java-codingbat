//Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"

public String stringX(String str) {
  String result="";
  for (int count=0;count<str.length();count++){
    if ((count==0 || count==str.length()-1) && str.substring(count,count+1).equals("x")){
      result=result + str.substring(count,count+1);
    }
    if (str.substring(count,count+1).equals("x"))
      continue;
    result=result + str.substring(count,count+1);
  }
  return result;
}

