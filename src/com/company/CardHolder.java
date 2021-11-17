package com.company;

import java.util.HashMap;
import java.util.Map;

public class CardHolder extends ApplePay{

    private final Map<Integer, Integer> cardHolder = new HashMap<>();

    @Override
    public void payment(User user) {
        long tempCard = 4441111452545421L;
        cardHolder.put(Long.hashCode(tempCard), 3000);
        if(CheckInfo(tempCard) == "Correct card") {
            super.payment(user);
            GetBalance(user.getCardNum(), user.getSpentMoney());
        }else{
            System.out.println(CheckInfo(tempCard));
        }
    }

    private String CheckInfo(long tempCard){
        return cardHolder.containsKey(Long.hashCode(tempCard)) ? "Correct card" : "Wrong Card";
    }

    private void GetBalance(Long cardNum, Integer money){
        System.out.println("Your balance: " + (cardHolder.get(cardNum.hashCode()) - money));
    }

}
