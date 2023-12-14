package com.ncalderon.challenges;

import java.util.AbstractList;
import java.util.List;
import java.util.stream.Collectors;

public class IovlabsChallenge {

    private static List<Character> convertStringToCharList(final String s) {
        return new AbstractList<Character>() {
            @Override
            public Character get(int index) {
                return s.charAt(index);
            }

            @Override
            public int size() {
                return s.length();
            }
        };
    }

    public static String solution(String s) {
        List<Character> p = convertStringToCharList(s);
        for (int i = 0; i < s.length(); i++) {
            Character c = p.get(i);
            Character ic = p.get(s.length()-i);
            if (c != '?' && ic != '?' && c != ic){
                return "NO";
            }

            if (c == '?' && ic == '?'){
                p.set(i, 'a');
                p.set(s.length()-i, 'a');
            }

            if (c != '?' && ic == '?'){
                p.set(s.length()-i, c);
            }

            if (c == '?' && ic != '?'){
                p.set(i, ic);
            }
        }
        return p.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main (String[]args){
        assert solution("?ab??a").equals("aabbaa");
        assert solution("bab??a").equals("NO");
        assert solution("?a?").equals("aaa");
        assert solution("radar").equals("radar");
        assert solution("mom").equals("mom");
        assert solution("a?n?").equals("anna");
        assert solution("a?").equals("aa");
        assert solution("a").equals("a");


    }
}
