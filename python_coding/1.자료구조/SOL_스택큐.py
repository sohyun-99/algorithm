# stack
#빈 리스트 선언
stack = []

#2,5,8 차례대로 리스트에 추가하기(=Push)
stack.append(2)
stack.append(5)
stack.append(8)

#값이 모두 입력된 리스트 출력하기
print("stack : ", stack)

#리스트 pop함수 통해 마지막으로 입력된 데이터 순 출력
print("첫번째 pop")
print(stack.pop())
print(stack)

print("두번째 pop")
print(stack.pop())
print(stack)

print("세번째 pop")
print(stack.pop())
print(stack)


# 큐 queue
from collections import deque

q = deque([])

q.append(1) # 1 push

q.popleft() # 1 pop
