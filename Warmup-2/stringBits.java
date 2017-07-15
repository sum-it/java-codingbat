//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//stringBits("Hello") → "Hlo"
//stringBits("Hi") → "H"
//stringBits("Heeololeo") → "Hello"

public String stringBits(String str) {
  String result="";
  for(int count=0;count<str.length();count=count+2){
    result=result+str.charAt(count);
  }
  return result;
}
