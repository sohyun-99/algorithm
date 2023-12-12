# 시뮬레이션 문제

n,m = map(int,input().split()) # nxm 맵 생성 
x,y,r = map(int,input().split()) # (x,y) 방향= r


arr = [] 
for i in range(n):
    arr.append(list(map(int,input())))

# 왼 , 아 , 오 , 위 순서 <- 
dx=[0,1,0,-1] 
dy=[-1,0,1,0]

a=1
count = 1 # 방문한 칸의 수 

while(a>1):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if  arr[nx][ny]==0 :
            count+=1
            x,y = nx,ny
            break
        if i==3:
            a=0


print(count)



