//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"

public String startOz(String str) {
  String a ="";
  String b = "";
  if (str.length() >=1 && str.substring(0,1).equals("o"))
    a="o";
  if (str.length() >=2 && str.substring(1,2).equals("z"))
    b="z";
    return a+b;
}

