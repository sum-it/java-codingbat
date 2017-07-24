//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
//
//countCode("aaacodebbb") → 1
//countCode("codexxcode") → 2
//countCode("cozexxcope") → 2
//
public int countCode(String str) {
  int counter=0;
  for  (int count=0;count<str.length()-3;count++){
    if ((str.substring(count,count+2).equals("co")) && (str.substring(count+3,count+4).equals("e")))
      counter++;  
  }
  return counter;
}


