//Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
//
//wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
//wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
//wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> result = new ArrayList<String>();
  //String result[]= new String[words.length];
  int count2=0;
  for (int count=0;count<words.length;count++){
    if (words[count].length()==len)
      continue;
    result.add(words[count]);
  }
  return result;
}

