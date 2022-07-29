package com.leetcode.easy;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DecodeMessage {
    public String decodeMessage(String key, String message) {
        StringBuilder builder = new StringBuilder();
        key= key.replace(" ", "");
        List<Character> refinedKey = new ArrayList<>();

        for(int i=0; i<key.length(); i++) {
            if(!refinedKey.contains(key.charAt(i))) {
                refinedKey.add(key.charAt(i));
            }
        }

        for(int i=0; i<message.length(); i++) {
            if(message.charAt(i) == ' ') {
                builder.append(" ");
            } else {
                int index = refinedKey.indexOf(message.charAt(i));
                char c = (char) (index + 'a');
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DecodeMessage().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
        System.out.println(new DecodeMessage().decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
