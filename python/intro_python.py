import sys

i = 0
print("Hello World!")

print(len(sys.argv))
size = len(sys.argv)

while i < size:
	print(sys.argv[i])
	i = i + 1

for args in sys.argv:
	print(args)
