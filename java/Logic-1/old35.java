//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
//
//old35(3) → true
//old35(10) → true
//old35(15) → false
public boolean old35(int n) {
  boolean val1=(n%3 ==0);
  boolean val2=(n%5==0);
  return ((val1 && !val2) || (!val1 && val2) );
}
