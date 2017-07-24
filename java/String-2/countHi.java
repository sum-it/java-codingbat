//Return the number of times that the string "hi" appears anywhere in the given string.
//
//countHi("abc hi ho") → 1
//countHi("ABChi hi") → 2
//countHi("hihi") → 2
public int countHi(String str) {
 int counter=0;
  for (int count=0;count<str.length()-1;count++){
    if (str.substring(count,count+2).equals("hi"))
    counter++;
  }
  return counter;
}
