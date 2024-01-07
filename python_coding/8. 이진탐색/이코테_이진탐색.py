def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        # 찾은 경우 중간점 인덱스 반환  
        if array[mid] == target:
            return mid
        # 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        elif array[mid] > target:
            end = mid - 1
        # 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
        else:
            start = mid + 1
    return None

# n(원소의 개수)와 target(찾고자 하는 문자열)을 입력받기
n, target = list(map(int, input().split()))
# 전체 원소 입력받기
array = list(map(int, input().split()))

# 이진 탐색 수행 결과 출력
result = binary_search(array, target, 0, n-1)

if result == None:
    print("원소가 존재하지 않습니다")
else:
    print(result+1)


# 이진탐색 문제 특징
    # 입력 데이터가 많거나 탐색 범위가 매우 넓은 편
    # 1000만개나 1000억 이상의 탐색 범위라면 이진탐색을 의심해보면됨
    # 단 이때 input()을 사용하면 동작 속도가 느려 시간 초과 오답 판정을 받을 수 있음 => impor sys // sys.stdin.readline().rstrip() // 이용