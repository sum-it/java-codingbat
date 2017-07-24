//Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
//
//endOther("Hiabc", "abc") → true
//endOther("AbC", "HiaBc") → true
//endOther("abc", "abXabc") → true

public boolean endOther(String a, String b) {
  int alen= a.length();
  int blen=b.length();
  if (alen==0 || blen ==0)
    return true;
  if (blen>=alen && b.substring(blen-alen).toLowerCase().equals(a.toLowerCase()))
    return true;
  if (alen>blen && a.substring(alen-blen).toLowerCase().equals(b.toLowerCase()))
    return true;
  return false;
}

