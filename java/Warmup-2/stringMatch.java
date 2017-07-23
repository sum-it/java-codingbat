//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
//stringMatch("xxcaazz", "xxbaaz") → 3
//stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0
public int stringMatch(String a, String b) {
  int counter=0;
  for (int count=0;count<a.length()-1 && count <b.length()-1;count++){
    if (a.substring(count,count+2).equals(b.substring(count,count+2))){
      counter++;
    }
  }
  return counter;
}

