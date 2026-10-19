# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

point1 = Point(10.0, 15.0)
point2 = Point(30.0, 15.0)

hypot = point1.distance()
print(hypot)

dist = point2.distanceTo(point1)
print(dist)