def factorial(num):
    if num < 0:
        return "Error: Factorial of negative numbers does not exist."
    elif num == 0:
        return 1
    else:
        product = 1
        for i in range(1, num+1):
            product *= i
        return product

# Test the function with some examples
print(factorial(5))
print(factorial(0))
print(factorial(-2))
