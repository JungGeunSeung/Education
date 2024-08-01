# tuple
# 한번 정한 값을 변경, 삭제, 추가 할 수 없다.
# read only
# 자바에서 final 상수에 해당한다고 생각하면 된다.
l = [1,2,3]
t = (1,2,3)
l[0] = 10
# t[0] = 10 # 값이 변경되지 않는다.
print(t[0])

t1 = (1,2,3)
t2 = 1,2,3,4 #괄호 생략 가능
print(t2)
# 값이 하나인 튜플을 만들고 싶을때
t3 = 1 # 그냥 int 1
t3 = (1) # 그냥 int 1
t3 = (1,) # 그래서 ,로 적고 아무것도 적어주지 않는다. ()괄호 생략 가능
print(t3)
# print(t3[1]) #값이 하나이기 때문에 index out of range 에러가 발생한다.

t = tuple(range(5)) # tuple 함수도 사용 가능
print(t)

l = list("hello") # 문자열도 list나 tuple 선언이 가능하다 이렇게 되면 문자열 하나하나 배열로 들어가게 된다.
print(l)
t = tuple('hello')
print(t)





