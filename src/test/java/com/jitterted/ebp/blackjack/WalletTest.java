package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

  @Test
  public void newWalletIsEmpty() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void newWalletWhenMoneyAddedThenIsEmptyIsFalse() throws Exception {
    // GIVEN a new wallet
    Wallet wallet = new Wallet();

    // WHEN non-zero money is added
    wallet.addMoney(10);

    // THEN isEmpty == false
    assertThat(wallet.isEmpty())
        .isFalse();
  }

  @Test
  public void newWalletBalanceIsZero() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.balance())
        .isZero();
  }

  @Test
  public void newWalletAddMoney15ThenBalanceIs15() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(15);

    assertThat(wallet.balance())
        .isEqualTo(15);
  }

  @Test
  public void newWalletAdd17AndAdd18ThenBalanceIs35() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(17);
    wallet.addMoney(18);

    assertThat(wallet.balance())
        .isEqualTo(17 + 18);
  }

  @Test
  public void addMoneyOfLessThanZeroThrowsException() throws Exception {
    Wallet wallet = new Wallet();

    assertThatThrownBy(() -> {
      wallet.addMoney(-1);
    })
      .isInstanceOf(IllegalArgumentException.class);
  }

}
