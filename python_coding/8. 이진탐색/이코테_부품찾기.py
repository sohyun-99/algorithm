import sys

def binary_search(arr , x, start ,end):
    while start <= end :
        mid = (start+end)//2 
        if arr[mid]==x:
            return 'yes'
        elif arr[mid] > x :
            end = mid-1
        else :
            start = mid+1
    return 'no'

    

n = int(sys.stdin.readline().rstrip())
arr = list(map(int , sys.stdin.readline().split())) 
m = sys.stdin.readline().rstrip()
arr_x = list(map(int , sys.stdin.readline().split()))

arr.sort() # 정렬

for x in arr_x :
    print(binary_search(arr , x , 0, n-1),end=" ")


# 정수 n의 범위가 상당히 크다 -> 처음부터 순차 탐색하면 당연히 시간 초과 => 이진 탐색
# 숫자가 있는 위치를 이진탐색으로 총 m번 돌려서 찾기

# 추가
# 계수 정렬 풀이 => 모든 원소의 번호 포함하는 크기의 리스트([0]*100001) 만들어서 인덱스에 특정 번호 부품이 있는지(1로 표시) 매칭

# 집합 자료형 풀이 => set()은 집합 자료형 초기화할때 사용 , 애초에 arr을 list가 아닌 set으로 받은 후 if i in arr : 로 찾아도 됨

# 세가지 풀이 중 집합 자료형 풀이가 가장 간결한 소스코드
# => 단순히 특정한 데이터가 존재하는지 검사할때는 set을 사용하는 것이 유용할 수 있다
