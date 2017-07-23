//The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
//
//wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//wordCount(["c", "c", "c", "c"]) → {"c": 4}
public Map<String, Integer> wordCount(String[] strings) {
  Map<String,Integer> result = new HashMap <String,Integer>();
  for (int i=0;i<strings.length;i++){
    if (!result.containsKey(strings[i]))
      result.put(strings[i],1);
    else
      result.put(strings[i],result.get(strings[i])+1);
  }
  return result;
}

