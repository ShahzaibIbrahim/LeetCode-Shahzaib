package com.leetcode.interviews.practice;

public class ConvertSecondsIntoDate {

    //convert seconds to string formatted (2w2d, 4m2s, etc)

    public String stringFormatDate(int seconds) {

        int weeks = seconds / (7*24*60*60);
        int days = seconds / (24*60*60) - 7*weeks;
        int hours = seconds / (60*60) - 7*24*weeks - 24*days;
        int minutes = seconds / 60 - 7*24*60*weeks - 24*60*days - 60*hours;
        seconds = seconds - 7*24*60*60*weeks - 24*60*60*days - 60*60*hours - 60*minutes;


        return "" + weeks + "w" + days + "d" + hours + "h" + "," + minutes + "m" + seconds + "s";
    }

    public static void main(String[] args) {
        System.out.println(new ConvertSecondsIntoDate().stringFormatDate(4441244));
    }


}
