package com.company;

public class User {

    private Long cardNum;
    private Integer spentMoney;

    public User(Long cardNum, Integer spentMoney) {
        this.cardNum = cardNum;
        this.spentMoney = spentMoney;
    }

    public Long getCardNum() {
        return cardNum;
    }

    public void setCardNum(Long cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getSpentMoney() {
        return spentMoney;
    }

    public void setSpentMoney(Integer spentMoney) {
        this.spentMoney = spentMoney;
    }
}
