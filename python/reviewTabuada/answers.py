#First question

def	largestValue(n1, n2, n3):
	if n1 > n2 and n1 > n3:
		return n1
	if n2 > n1 and n2 > n3:
		return n2
	if n3 > n1 and n3 > n2:
		return n3
	return "none"

def	largestValueArray(array):
	i = 0
	for value in array:
		if value > i:
			i = value
	return i

#Second question

def	isPrime(num):
	if num > 1:
	    # Iterate from 2 to n // 2
	    for i in range(2, (num//2)+1):
	        # If num is divisible by any number between
	        # 2 and n / 2, it is not prime
	        if (num % i) == 0:
	            print(num, "is not a prime number")
	            break
	    else:
	        print(num, "is a prime number")
	else:
	    print(num, "is not a prime number")

def	showPrimeNumbers(n):
	i = 0
	if n <= 0:
		print("number needs to be > than 0")
	while i <= n:
		isPrime(i)
		i += 1

#Third question

def	isPerfectSquare(n):
	total = 0
	for i in range(1, n + 1, 2):
		total += i
	if total == n:
		print(n, "is a perfect square")
	else:
		print(n, "is not a perfect sqaure")

n1 = 22
n2 = 420
n3 = 10
array = [42, 101, 2]

print("First Question:")
print(largestValue(n1, n2, n3))
print(largestValueArray(array))

print("Second Question:")
showPrimeNumbers(42)

print("third Question:")
isPerfectSquare(16)
