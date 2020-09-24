# Код взят здесь -
# https://ru.stackoverflow.com/questions/655590/%D0%A1%D1%87%D0%B8%D1%82%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D0%B8-%D1%81-com-%D0%BF%D0%BE%D1%80%D1%82%D0%B0-%D0%B2-python
#from typing import re
import regex as re  # $ pip install regex
import serial
# import pyserial
# import minimalmodbus

#for line in ser.read()
# i=1
#ser = serial.Serial('COM7', 9600, timeout=10, bytesize=8, parity='N', stopbits=1)
ser = serial.Serial('COM7')
ser.timeout=5
ser.baudrate = 9600
ser.bytesize=8
ser.parity='N'
ser.stopbits=1
ser.rtsToggle=True
#bytesize=serial.EIGHTBITS
#stopbits=serial.STOPBITS_ONE
#parity=serial.PARITY_NONE
print('Подключаемся на порт - ', ser.name)

i = 1
r=""
b=""
while (i<=20):
    #a = ser.readline()
    # a=ser.read_all() //!==========
    a = ser.read(10);
    print('Чт :', a)
    text = "gffdg"
    text = str(a)

    text = text.replace(text[0], '', 1)
    text = text.replace(text[0], '', 2)
    text = text.replace(text[0], ' ')
    text = text.replace('t', '')
    text = text.replace('n', '')
    text = text.replace('r', '')
    text = text.replace('&', '')
    #text = text.replace('\'', '')

    #text = text.rstrip('\n')
    #text = text.rstrip('\t')
    #text = re.sub(r'[^\t\n\r]', '', 'Hello1@#!%!#&&!*!#$#%@*+_{\u00A0ёж!')
    #print(re.sub(r'[^\w\s]', '', 'Hello1@#!%!#&&!*!#$#%@*+_{\u00A0ёж!'))
    #print(re.sub(r'[^\w\\s\t\n]', '', text))
    #print(re.sub(r'[^\t\n\r]', '', text))

    ##print('Длt:  ', text)

    '''d = "erttyy"
    d = text.replace("\t", "sssssss")
    #d = a.decode('ascii')
    print('Длd:', d)'''
    i += 1
'''    c = str(a);
    print('C=', c);
    c = c.replace(c[0], '', 1)
    c = c.replace(c[0], '', 2)
    c = c.replace(c[0], '', 2)
    print('C=', c);
    b+=(c);
    #lol = a.STOPBITS;
    #print('a.STOPBITS', lol)
    #b = a.getCD
    #print('a.getCD :', b)
    # a=ser.read()
    #a=ser.read()
    res1_new = []
    # разбиваем по символу
    res1 = b.split("t")
    #res1 = b.split("t")
    d=''
    for val in res1:
        # срезаю пробелы
        # val = val.strip()
        #print(val)
        # формирую новый массив
        d+=val
        res1_new.append(val)
    print(res1_new)
    res2_new = []
    res2 = d.split("n")
    for val in res2:
        # срезаю пробелы
        # val = val.strip()
        #print(val)
        # формирую новый массив
        res2_new.append(val)
    print(res2_new)
    print('b=', b)
'''

'''    text = str(a)
    if len(text)>=7 :
        text = text.replace(text[0], '', 1)
        text = text.replace(text[0], '', 1)
        text = text.replace(text[0], '', 1)
        text = text.replace(text[0], '', 1)
        text = text.replace(text[2], '', 1)
        print('Удалены символы :', text)
        r = r + text
        print("Получено число HEX =", r)
    elif len(str(a))==4:
        print("Получено число HEX =", r)
        #r=""
        print('===================')
'''
ser.close()
