package com.test;

/**
 * Class description goes here (optional)
 *
 * @author: Kirill Korolenko [korolenko.k.d@gmail.com]
 * Date: 2021-02-02
 * Time: 17:43
 */

class CashBox {
  private final int number;
  private final double minutesForHuman;
  private int counter = 1;

  CashBox(int number, int speedPerHour) {
    this.number = number;
    minutesForHuman = 60d / speedPerHour;
  }

  int getNumber() {
    return number;
  }

  double getWaitingTime() {
    return minutesForHuman * counter;
  }

  void increaseCounter() {
    this.counter++;
  }

  void decreaseCounter() {
    if(counter > 1) {
      this.counter--;
    }
  }
}
