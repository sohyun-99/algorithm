### 정수 1개 입력받기
N = int(input())
 
### 한줄 정수 리스트 입력받기
p = list(map(int,input().split()))
 
### 여러개 정수 입력받기
a,b,c = map(int,input().split())

# 한줄에 여러개의 문자열 입력 받기
a, b = input().split()

## 문자열 여러줄 리스트
p = [input() for _ in range(a)] # 길이가 정해져있음
                                # 안정해져있음

n = int(input())

#2차원 배열 저장
loc = []
for i in range(n):
    loc.append(list(map(int, input().strip().split())))


### 여러 줄의 정수 리스트 입력받기

li = [int(input()) for _ in range(n)]
## n 없이 한 줄로
li = [int(input()) for _ in range(int(input()))]
 
### N행 배열 입력받기
#### 숫자인 경우
N=int(input()) # N개의 행
arr=[[*map(int,input().split())] for _ in range(N)]
 
#### 문자열인 경우
N=int(input()) # N개의 행
arr=[list(input()) for _ in range(N)]
 
## 입력 빠르게하기
import sys
input=sys.stdin.readline # input함수 바꾸기


# lstrip: 문자열에 왼쪽 공백이나, 인자가된 문자열의 모든 조합을 제거 
# rstrip: 문자열에 오른쪽 공백이나, 인자가된 문자열의 모든 조합을 제거
# strip: 양쪽 문자열에 공백이나, 인자가된 문자열의 모든 조합을 제거 


###
board=[[]]
answer = max(map(max,board))**2 # 2차원 배열의 최댓값 찾기
