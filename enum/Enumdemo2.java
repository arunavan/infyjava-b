package com.infosys;
import java.util.Scanner;

enum color{
	GREEN,
	ORANGE,
	WHITE
	
}

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Enumdemo2 {
	    Day day;
	    
	    public Enumdemo2(Day day)
	    { this.day = day; 
	    }
	    public void dayIsLike()
	    {  switch (day) {
	        case MONDAY:
	            System.out.println("Mondays are bad.");
	            break;
	        case FRIDAY:
	            System.out.println("Fridays are better.");
	            break;
	        case SATURDAY:
	        case SUNDAY:
	            System.out.println("Weekends are best.");
	            break;
	        default:
	            System.out.println("Midweek days are so-so.");
	            break;
	        }
	    }
	    public static void main(String[] args)
	    {
	        String str = "MONDAY";
	        Enumdemo2 t1 = new Enumdemo2(Day.valueOf(str));
	        t1.dayIsLike();
	    }
	}