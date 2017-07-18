//Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//
//last2("hixxhi") → 1
//last2("xaxxaxaxx") → 1
//last2("axxxaaxx") → 2
public int last2(String str) {
  int count=0;
  if (str.length() <=3)
  return count;
  for (int counter=0; counter<str.length()-2;counter++){
    if (str.substring(counter,counter+2).equals(str.substring(str.length()-2,str.length())))
    count ++;
  }
 return count; 
}

