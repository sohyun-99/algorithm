# 딕셔너리
team = dict()
team = {'a':1,'b':2}

print(team['a']) #1
print(team['b']) #2

team['c'] = 3

print(team['c']) #3

# counter 각 키값의 빈도수 출력
from collections import Counter

Counter(["hi", "hey", "hi", "hi", "hello", "hey"])
# Counter({'hi': 3, 'hey': 2, 'hello': 1})

Counter("hello world")
# Counter({'h': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1})