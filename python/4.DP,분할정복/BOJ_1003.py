def count_fibonacci(n):
    # 0과 1이 출력되는 횟수를 저장하는 리스트 초기화
    counts = [[1, 0], [0, 1]]

    if n <= 1:
        return counts[n]

    # 2부터 n까지의 피보나치 수열의 0과 1이 출력되는 횟수 계산
    for i in range(2, n + 1):
        zero_count = counts[i - 1][0] + counts[i - 2][0]
        one_count = counts[i - 1][1] + counts[i - 2][1]
        counts.append([zero_count, one_count])

    return counts[n]

# 입력값 받기
T = int(input())  # 테스트 케이스 수

for _ in range(T):
    N = int(input())  # 인덱스 입력
    result = count_fibonacci(N)
    print(*result)