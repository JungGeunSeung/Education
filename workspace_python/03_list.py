a= [1, 1.2, 'word', True] # 파이썬에도 배열에 어떤 타입을 담을 수 있다.
print(a)
print( a[1] )
# 파이썬에서는 index범위를 초과하는 index를 적으면, 오류가 발생한다.
print(a[-2]) # 음수로 적으면 리스트의 뒤에서 부터 카운트해서 찾아준다 맨뒤가 -1이 된다.

a[3] = False
a[-1] = False
print(a)

print('abcd'[0]) # 문자열도 '열'이기때문에 배열로 취급해서 해당하는 문자열을 출력할수 있다.
print(a[2][1]) # 그래서 배열안에 문자열이 있으면 2차원배열처럼 해당 배열안에 있는 문자도 []index를 통해 가능하다

a = list() # 배열을 초기화 할수 있다. 배열로 만들어주는 list함수라고 생각하면된다. 아무것도 안적으면 초기화가 가능하다.
print(a)

# range
# range(시작index, 종료index, step) # step : n만큼 증가
# 시작 index의 기본값은 : 0
# 종료 index의 기본값은 : 리스트의 길이
# step의 기본값은 : 1
a = range(10) # 전달인자 하나만 주면, 앞에 0이 생략되어서 0,10 으로 출력 되고 리스트의 길이를 정해준다
print(a)
print(list(a))
print( list (range(4,10,2))) # 4부터 10앞까지 2씩 증가
print( list (range(4,10,2))) # 4부터 10앞까지 2씩 증가
print( list (range(10,0))) # 종료 index가 시작 index보다 작으면 아무것도 되지 않는다.
print( list (range(10, 0, -1))) # step 도 음수가 될수 있다 이럴때는 시작 인덱스와 종료 인덱스를 반대로 적어준다

a = [100,15,13,1,1,26,41,1,1]

a.append(52) # 리스트 마지막에 추가
print(a)

a.sort() # 오름차순으로 정렬
print(a)

print('!')
a.sort(reverse=True) # 내림차순이 없기때문에 이런식으로 도 쓴다.
print(a)


a.reverse() # 배열 뒤집기
print(a)
a.sort()
print(a)

print(a.index(15)) # 전달인자와 같은 값이 있는 인덱스 번호를 반환한다

a.insert(1,200) # 첫번째 전달인자에 해당하는 인덱스를 두번째 전달인자의 값으로 끼워넣는다. (나머지는 뒤로 밀린다)
print(a)

a.remove(1) # 순차적으로 첫번째 나오는 값을 삭제
print(a)

x = a.pop() # 맨뒤에 값을 빼고 리턴해준다 변수에 담을 수 있다.
print(x)
print(a)

print(a.count(1)) # 전달인자와 같은 값이 몇개가 있는지 카운트 된다.

b = [-1, -2]
a.extend(b) # 배열 합치기 a += b 와 같다. 리턴값이 없다 
print(a)

# 숫자로만 이루어져있는 배열은 밑에 min,max,sum 도 가능하다
print( min(a))
print( max(a))
print( sum(a))

