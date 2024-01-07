def solution(board):
    
    for i in range(1,len(board)):
        for j in range(1,len(board[0])):
            
            check = [board[i-1][j-1],board[i-1][j],board[i][j-1]]
            if board[i][j]>=1 : 
                zero_count = check.count(0)
                if zero_count == 0:
                    board[i][j]=min(check)+1
    
    answer = max(map(max,board))**2 # 2차원 배열의 최댓값 찾기
    
    return answer

# 1st처음 구상한 알고리즘은 3중 포문으로 가능하길래 1000*1000*1000이상의 시간복잡도 => 빠른 포기
# 2nd 다른 알고리즘이 있을 거라고 믿고 구상 
# => 어느 정사각형이든 오른쪽 끝모서리는 존재하므로 각 좌표를 dp방식으로 적용하여 왼쪽,위쪽,위왼대각선의 값을 합산해 나가면서 가장 큰 값을 가진 게 정딥이다. => 합산하는 방식은 왼오대각 중에 모두 1이상이라면 최소값에 +1한다

