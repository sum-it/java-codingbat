#Given two strings, return True if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: s.lower() returns the lowercase version of a string.
#
#end_other('Hiabc', 'abc') → True
#end_other('AbC', 'HiaBc') → True
#end_other('abc', 'abXabc') → True

def end_other(a, b):
  if (len(a)==0 or len(b)==0):
    return True
  if (len(a)>=len(b)):
    if(a[0-len(b):].lower()==b.lower()):
      return True
  if(b[0-len(a):].lower()==a.lower()):
    return True
  return False
