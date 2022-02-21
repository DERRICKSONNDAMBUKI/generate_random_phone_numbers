import random
def random_phone_num_generator():    
    
    first = str(random.randint(100, 999))
    
    
    if ( '8' not in first ):
        if ('9' not in first ):
                
            first = first
        
            second = str(random.randint(1, 655)).zfill(3)

            last = (str(random.randint(1, 9998)).zfill(4))
            while last in ['1111', '2222', '3333', '4444', '5555', '6666', '7777', '8888']:
                last = (str(random.randint(1, 9998)).zfill(4))

            return '{}-{}-{}'.format(first, second, last)
        else:
            return random_phone_num_generator()
    else:
        return random_phone_num_generator()

n = int(input("How many phone numbers do you want? "))
for i in range(0, n):
    print(random_phone_num_generator())