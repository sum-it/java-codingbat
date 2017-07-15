//Given a string, return a new string where the first and last chars have been exchanged.
//
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"
public String frontBack(String str) {
  if (str.length()==0 || str.length()==1)
    return str;
  else if (str.length()==2){
  String f = str.substring(0,1);
  String b = str.substring(str.length()-1);
  return b + f ;
  }
  else {
    String f = str.substring(0,1);
    String b = str.substring(str.length()-1);
    String m = str.substring(1,str.length()-1);
    return b + m + f;
  }
}

