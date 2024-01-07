# (x,y)
loc = input()
y = loc[0]
x = int(loc[1])
print(y,x)


# 이 상태로 한번 dx,dy을 바꿔서 한번 => 총 8번의 경우의수
dx = [1,1,-1,-1]
dy = [2,-2,2,-2]

# 알파벳이 몇번째인지 숫자로 변경 => a는 인덱스 1부터 시작
alpha = ['0','a','b','c','d','e','f','g','h']
y = alpha.index(y)

count = 0 
for i in range(2):
    dx , dy = dy , dx 
    for j in range(4):
        nx = x+dx[j]
        ny = y+dy[j]
        if nx < 1 or ny<1 or nx>8 or ny>8 :
            continue
        count+=1

print(count)


# + ) 책에 있는 방식에서 얻은 점

# 아스키 코드 사용 ord('알파벳'))
# column = int(ord(input_data[0])) - int(ord('a')) + 1 #으로 알파벳 인덱스 알아냄

# set을 사용하여 방향 정의
# steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]


