package com.jitterted.ebp.blackjack;

public class Wallet {

  private int balance;

  public Wallet() {
    balance = 0;
  }

  public boolean isEmpty() {
    return balance == 0;
  }

  public void addMoney(int amount) {
    ensureAmountZeroOrMore(amount);
    balance += amount;
  }

  public int balance() {
    return balance;
  }

  public void bet(int betAmount) {
    ensureSufficientBalanceFor(betAmount);
    balance -= betAmount;
  }

  private void ensureAmountZeroOrMore(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  private void ensureSufficientBalanceFor(int betAmount) {
    if (balance < betAmount) {
      throw new IllegalStateException();
    }
  }
}
