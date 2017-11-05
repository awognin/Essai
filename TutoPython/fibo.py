
# Fibonacci numbers module

def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while b < n:
        print b,
        a, b = b, a + b
    print a, b+22, n, n+7

def fib2(n):   # return Fibonacci series up to n
    result = ()
    a, b = 0, 1
    while b < n:
        result.append(b).append("")
        a, b = b, a + b
        print b, a
    return result
    
    
def complexe(a, b):
    z = a + " + j" + b
    zbar = a + " - j" + b
    return z
    
def moduleCarre(a, b):
    m2 = a*a + b * b
    return m2
