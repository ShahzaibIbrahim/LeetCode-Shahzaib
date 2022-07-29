package com.leetcode.easy;

public class DefangeIPAddress {


    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {

        System.out.println(new DefangeIPAddress().defangIPaddr("1.1.1.1"));
    }
}
