//Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"
public String stringSplosion(String str) {
  String result="";
  if (str.length()<=1)
    return str;
  for (int count=1;count<=str.length();count++){
    result=result+str.substring(0,count);
  }
  return result;
}

