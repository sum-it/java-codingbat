#We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return True if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
#
#make_bricks(3, 1, 8) → True
#make_bricks(3, 1, 9) → False
#make_bricks(3, 2, 10) → True
def make_bricks(small, big, goal):
  bbricks=goal/5
  sbricks=goal%5
  if (big>bbricks):
    if((goal%5) <=small):
      return True
    else:
      return False
  else:
    if (((bbricks-big)*5 +sbricks) <=small ):
      return True
    else:
      return False

print make_bricks(3,1,8)
print make_bricks(3,1,9)
print make_bricks(3,2,10)
print make_bricks(0,0,0)
print make_bricks(1,1,0)
print make_bricks(-1,-2,2)

