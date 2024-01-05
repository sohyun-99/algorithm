# 시뮬레이션 문제

n,m = map(int,input().split()) # nxm 맵 생성 
x,y,r = map(int,input().split()) # (x,y) 방향= r


arr = [] 
for i in range(n):
    arr.append(list(map(int,input())))

# 위 : 0 (d인덱스 0~3) / 오 : 1 (3~6) / 아 : 2(2~5) / 왼:3(1~4)

# 왼 , 아 , 오 , 위 , 왼 , 아 , 오 , 위  순서 <- 
dx=[0,1,0,-1,0,1,0,-1] 
dy=[-1,0,1,0,-1,0,1,0]

a=1
count = 1 # 방문한 칸의 수 

def r_to_d(r):
    if r == 0 :
        return 0
    elif r==1 :
        return 3
    elif r==2:
        return 2
    elif r==3:
        return 1
    
def d_to_r(d):
    if d == 0 or d ==  4:
        return 3
    elif d==1 or d ==  5:
        return 2
    elif d==2 or d==6:
        return 1
    elif d==3 or d==7:
        return 0


while(a==1):
    l = int(r_to_d(r))
    for i in range(l,l+4):
        nx = x + dx[i]
        ny = y + dy[i]

        # 0 인 곳으로 이동
        if  arr[nx][ny]==0 :
            count+=1
            arr[nx][ny]=2 # 방문했다는 의미

            # 이동 후 다음 좌표 설정
            x,y = nx,ny 
            r = int(d_to_r(i))
            break
        # 상하좌우 다봤는데 방문했거나 모두 1일때 처리
        if i==l+3 : 
            a=0

print(count)

# 회전을 한다는 것은 애초에 왼쪽부터 탐색한다는 것이므로 왼쪽을 탐색하고 탐색 후 왼쪽을 본다고 생각하고 그에 해당하는 왼쪽을 탐색 r_to_d , d_to_r 함수를 사용하여 수시로 변환해주는 방식


# 이코테 풀이에서 참고할점

# 방향 전환 방식
# def turn_left():
#     global direction
#     direction -= 1
#     if direction == -1:
#         direction = 3
# dx=[-1,0,1,0] dy=[0,1,0,-1] (북동남서)로 방향을 정의하고 
# 전역 변수로 direction을 설정하여 인덱스를 -1씩하여 방향을 수시로 바꿔주는 방식
# (예를 들어 인덱스=2/남쪽 => 왼쪽 회전 => 인덱스=1/동쪽) (-1이될때만 예외처리(-1->3))
# => 나는 너무 단순하게 배열의 길이를 늘려 8개를 만들어서 사용했음 (살짝 번거로움)
    
