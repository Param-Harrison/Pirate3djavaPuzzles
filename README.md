Pirate3djavaPuzzles
===================
MY practice on Java puzzles based on my experience in C#

Level 1 ? Statements and expressions
  x1=3
  y1=5
  x2=2
  y2=7
  return x1*x2+y1*y2

  Output : 41

Level 2 ? Single function
  dot(x1,y1,x2,y2)
    a=x1*x2
    b=y1*y2
    return a+b
  return dot(3,5,2,7)

  Output : 41

Level 3 ? Nested functions
  vec(x1,y1)
    dot(x2,y2)
      return x1*x2+y1*y2
  return vec(3,5).dot(2,7)

  Output : 41

Level 4 ? Object orientation
  vec(x,y)
    dot(v)
      return x*v.x+y*v.y
    middle(v)
      return vec((x+v.x)/2,(y+v.y)/2)
  v1=vec(0,-5)
  v2=vec(6,15)
  v3=vec(2,7)
  return v1.middle(v2).dot(v3)

  Output : 41

Level 5 ? Functional programming
  vec(x,y)
    length=sqrt(x*x+y*y)
    add(v)=vec(x+v.x,y+v.y)
  
  trajectory(position,speed)
    at(i)=if(i>0) at(i-1).add(speed) else position
  
  t=trajectory(vec(0,4),vec(1,4))
  return t.at(9).length
  
  Output : 41
  
* Code is self explanatory, it is not at all complicated. It involves classes and objects for most of the problems.
