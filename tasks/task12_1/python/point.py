# Task 12.1: Point class
from math import hypot, sqrt

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self): hypot(self.x, self.y)
    def distanceTo(self, point):
        return sqrt(pow(point.x - self.x, 2)) - (pow(point.y - self.y, 2))
