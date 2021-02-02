package com.test;

/**
 * Class description goes here (optional)
 *
 * @author: Kirill Korolenko [korolenko.k.d@gmail.com]
 * Date: 2021-02-02
 * Time: 17:29
 */

class FSM {
  private int state = 0;

  CashBox[] cashboxes = {
      new CashBox(1, 10),
      new CashBox(2, 13),
      new CashBox(3, 15),
      new CashBox(4, 17),
  };

  private void setState(int state) {
    this.state = state;
  }

  int getState() {
    return state;
  }

  void handlingData(String input) {
    switch (input) {
      case "A":
        CashBox best = getBestCashBox();
        best.increaseCounter();
        setState(best.getNumber());
        break;
      case "1":
        cashboxes[0].decreaseCounter();
      case "2":
        cashboxes[1].decreaseCounter();
      case "3":
        cashboxes[2].decreaseCounter();
      case "4":
        cashboxes[3].decreaseCounter();
    }
  }

  private CashBox getBestCashBox() {
    CashBox best = cashboxes[0];
    for(CashBox cashBox: cashboxes) {
      if(cashBox.getWaitingTime() < best.getWaitingTime()) {
        best = cashBox;
      }
    }
    return best;
  }

  void reset() {
    state = 0;
  }
}
