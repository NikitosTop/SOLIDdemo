package com.company;

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CardHolder cardHolder = new CardHolder();
        cardHolder.payment(new User(console.nextLong(), console.nextInt()));
    }
}