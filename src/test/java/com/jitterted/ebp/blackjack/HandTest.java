package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HandTest {

  private static final Suit DUMMY_SUIT = Suit.HEARTS;

  @Test
  public void handValueOf22IsBusted() throws Exception {
    List<Card> cards = List.of(new Card(DUMMY_SUIT, "10"),
                               new Card(DUMMY_SUIT, "8"),
                               new Card(DUMMY_SUIT, "4"));
    Hand hand = new Hand(cards);

    assertThat(hand.busted())
        .isTrue();
  }
}