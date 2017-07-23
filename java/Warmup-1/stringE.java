//Return true if the given string contains between 1 and 3 'e' chars.
//
//stringE("Hello") → true
//stringE("Heelle") → true
//stringE("Heelele") → false

public boolean stringE(String str) {
  int counter=0;
  int count=0;
  for (counter=0; counter<str.length();counter++){
    if (str.substring(counter,counter+1).equals("e"))
      count++;
  }
  return (count >=1 && count <=3 );
}

