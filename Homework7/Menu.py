def calc_menu():
    stop_work = False
    while(stop_work != True):
        print("Какую операцию вы хотите произвести?")
        print("1_+; 2_-; 3_*; 4_/; 5_x_выход ?")
        user_input = int(input())
        if(user_input == 1 ):
            from Homework7.Addition import Addition
            ad = Addition
            print(ad)
            print('')
        elif(user_input == 2):
            from Homework7.Substraction import Substraction
            sub = Substraction
            print(sub)
            print('')
        elif(user_input == 3):
            from Homework7.Multiplication import Multiplication
            mult = Multiplication
            print(mult)
            print('')
        elif(user_input == 4):
            from Homework7.Division import Division
            di = Division
            print(di)
            print('')
        elif(user_input == 5):
            print("Завершение работы")
            stop_work = True
        else:
            print("ВВедено некорректное значение")
calc_menu()