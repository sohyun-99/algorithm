#주사위 굴리기

# <-문제->
# N x M 인 지도 존재
# 지도 좌표 (r,c) 

# 지도 이동한 칸 쓰여있는 수 = 0 -> 바닥면 칸 복사
# 0이 아니면 칸에 쓰여있는 수가 바닥면으로 복사됨 칸 = 0

#동서남북 순
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
dice = [0,0,0,0,0,0]

#주사위 굴렸을때 바뀌는 값
def move_go(go):
    if go == 0:
        dice[0], dice[2], dice[3], dice[5] = dice[3], dice[0], dice[5], dice[2]
    elif go == 1:
        dice[0], dice[2], dice[3], dice[5] = dice[2], dice[5], dice[0], dice[3]
    elif go == 2:
        dice[0], dice[1], dice[4], dice[5] = dice[4], dice[0], dice[5], dice[1]
    elif go == 3:
        dice[0], dice[1], dice[4], dice[5] = dice[1], dice[5], dice[0], dice[4]

N,M,x,y,k = map(int,input().split()) # 세로 가로 좌표x,y 명령개수 순

set=[]
for _ in range(N):
    set.append(list(map(int, input().split())))

move = [*map(int, input().split())] 

for i in move:
    ii = move[i] - 1
    x += dx[i-1]
    y += dy[i-1]
    # if x < 0 or x >= N or y < 0 or y >= M:
    #     continue
    move_go(ii)
    if set[x][y] == 0:
        set[x][y] = dice[-1]
    else:
        dice[-1] = set[x][y]
        set[x][y] = 0
    print(dice[0])
