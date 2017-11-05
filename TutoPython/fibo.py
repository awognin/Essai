
# Fibonacci numbers module

def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while b < n:
        print b,
        a, b = b, a + b
    print a, b, n

def fib2(n):   # return Fibonacci series up to n
    result = []
    a, b = 0, 1
    while b < n:
        result.append(b)
        a, b = b, a + b
        print b
    return result
    
    
def complexe(a, b):
    z = a + " + j" + b
    return z
    
def module(a, b):
    m = a*a + b*b
    return m
