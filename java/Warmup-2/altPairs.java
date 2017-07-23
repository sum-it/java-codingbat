//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//altPairs("kitten") → "kien"
//altPairs("Chocolate") → "Chole"
//altPairs("CodingHorror") → "Congrr"

public String altPairs(String str) {
  String result="";
  for (int count=0;count<str.length();count++){
    if (count%4==0 || count%4==1){
      result=result+str.substring(count,count+1);
    }
  }
  return result;
}

