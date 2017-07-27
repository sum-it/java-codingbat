# By Websten from forums
#
# Given your birthday and the current date, calculate your age in days. 
# Account for leap days. 
#
# Assume that the birthday and current date are correct dates (and no 
# time travel). 
#

def daysBetweenDates(year1, month1, day1, year2, month2, day2):
    result=0
    if (year1==0):
        doy= (year2-year1)*365
        for i in range(year1,year2):
            if isLeapYear(i):
                doy +=1
    if (month1==0):
        dom=0
        for i in range(month2):
            dom += daysinMonth(i)
        if (month2>2 and isLeapYear(year2)):
            dom+=1
    if (day1==0):
        dod=day2-day1
    if (year1==0 and month1 ==0 and day1==0):
        return doy+dom+dod
    if (year2<year1 or (year2==year1 and month2 <month1) or (year2==year1 and month2 ==month1 and day2 <day1)):
        return -1
    init= daysBetweenDates(0,0,0,year1,month1,day1)
    final=daysBetweenDates(0,0,0,year2,month2,day2)
    return final-init
    
def daysinMonth(month):
    if month in (4,6,9,11):
        return 30
    elif month in (1,3,5,7,8,10,12):
        return 31
    return 28
    

def isLeapYear(year):
    return (( year%4==0 and year%100!=0) or year%400==0) 
# Test routine

def test():
    test_cases = [((2012,1,1,2012,2,28), 58), 
                  ((2012,1,1,2012,3,1), 60),
                  ((2011,6,30,2012,6,30), 366),
                  ((2011,1,1,2012,8,8), 585 ),
                  ((1900,1,1,1999,12,31), 36523)]
    for (args, answer) in test_cases:
        result = daysBetweenDates(*args)
        if result != answer:
            print "Test with data:", args, "failed"
        else:
            print "Test case passed!"

test()
