def sud_solver():
    print('Enter 0 in place of blank. enter commas in between the numbers.')
    row1 = input('Enter first row of sudoko: ')
    row2 = input('Enter second row of sudoko: ')
    row3 = input('Enter third row of sudoko: ')
    row4 = input('Enter fourth row of sudoko: ')
    row5 = input('Enter fifth row of sudoko: ')
    row6 = input('Enter sisth row of sudoko: ')
    row7 = input('Enter seventh row of sudoko: ')
    row8 = input('Enter eighth row of sudoko: ')
    row9 = input('Enter nineth row of sudoko: ')
    row_1=row1.split(',')
    row_2=row2.split(',')
    row_3=row3.split(',')
    row_4=row4.split(',')
    row_5=row5.split(',')
    row_6=row6.split(',')
    row_7=row7.split(',')
    row_8=row8.split(',')
    row_9=row9.split(',')
    r= [row_1,row_2,row_3,row_4,row_5,row_6,row_7,row_8,row_9]
    for i in r:
        for j in i:
            if j in i:
                c =1
    if c==1:
        print('Invalid input!!!')
    continue
    print('hi')
sud_solver()
