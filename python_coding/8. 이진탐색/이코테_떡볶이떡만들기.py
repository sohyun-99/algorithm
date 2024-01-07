import sys

n,m = map(int,sys.stdin.readline().split())
arr = list(map(int,sys.stdin.readline().split()))

def binary_search(arr,m,start,end):
    while (start<=end):
        mid = (start+end)//2
        sum_h = 0

        # 떡의 길이 계산
        for i in arr:
            if i > arr[mid] :
                sum_h += (i - arr[mid])

        if sum_h == m :
            return arr[mid]
        elif sum_h > m : 
            start = mid+1
        else:
            end = mid - 1
    return None


print(binary_search(arr,m,0,n-1))


# 분석 : 탐색 범위가 크다
