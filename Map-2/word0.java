//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
//
//word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
//word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
//word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

public Map<String, String> mapAB4(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    if (map.get("a").length() == map.get("b").length()){
      map.put("a","");
      map.put("b","");
    }
    if (map.get("a").length() > map.get("b").length())
      map.put("c",map.get("a"));
    if (map.get("a").length() < map.get("b").length())
    map.put("c",map.get("b"));
  }
  return map;
}

