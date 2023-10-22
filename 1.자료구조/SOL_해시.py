# 딕셔너리
team = dict()
team = {'a':1,'b':2}

print(team['a']) #1
print(team['b']) #2

team['c'] = 3
team[3]=[1,2,3]

team.get('3') # 값 찾기

print(team['c']) #3

# # 딕셔너리 생성
# a = {1: 'a'}

# # key(2), value(b) 쌍 추가
# a[2] = 'b'
# >>> a
# {1: 'a', 2: 'b'}

# # key(3), value([1, 2, 3]) 추가
# a[3] = [1, 2, 3]
# >>> a
# {1: 'a', 2: 'b', 3: [1, 2, 3]}

# # key 2인 요소 삭제
# del a[2]
# >>> a
# {1: 'a', 3: [1, 2, 3]}

# # key 1인 요소 접근
# >>> a[1]
# a

# # Key List 만들기
# >>> a.keys()
# dict_keys([1, 3])

# # Key: Value 쌍 얻기
# >>> a.items()
# dict_items([(1, 'a'), (3, [1, 2, 3])])

# # key로 value 얻기
# >>> a.get(1)
# 'a'

# # Key: Value 쌍 모두 지우기
# a.clear()
# >>> a
# {}

# # 중복 주의
# a = {1: 'a', 1: 'b'}
# >>> a
# {1: 'b'}

# 딕셔너리 관련 참고 링크
# https://bigdaheta.tistory.com/9

# counter 각 키값의 빈도수 출력
from collections import Counter

Counter(["hi", "hey", "hi", "hi", "hello", "hey"])
# Counter({'hi': 3, 'hey': 2, 'hello': 1})

Counter("hello world")
# Counter({'h': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1})