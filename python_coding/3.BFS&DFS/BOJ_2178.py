from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(maze, N, M):
    queue = deque()
    queue.append((0, 0, 1)) 
    visited = set()
    visited.add((0, 0))

    while queue:
        x, y, count = queue.popleft()

        if x == N - 1 and y == M - 1:  
            return count

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < M and maze[nx][ny] == 1 and (nx, ny) not in visited:
                queue.append((nx, ny, count + 1))
                visited.add((nx, ny))

N, M = map(int, input().split())
maze = []
for _ in range(N):
    maze.append(list(map(int, input())))

result = bfs(maze, N, M)
print(result)