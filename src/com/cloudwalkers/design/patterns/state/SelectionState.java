/**
 * 
 */
package com.cloudwalkers.design.patterns.state;

/**
 * @author nijogeorgep
 *
 */
public class SelectionState implements State {

  OnlineShopping shopping;

  public SelectionState(OnlineShopping shopping) {
    this.shopping = shopping;
  }

  @Override
  public void assemble() {
    System.out.println("Cannot Assemble Unless Selected");
  }

  @Override
  public void authorise() {
    System.out.println("Cannot Authorise Unless Selected");
  }

  @Override
  public void dispatch() {
    System.out.println("Cannot Dispatch Unless Selected");
  }

  @Override
  public void purchase() {
    System.out.print("-> Purchase");
    shopping.setCurrentState(shopping.getPurchaseState());
  }

  @Override
  public void complete() {
    System.out.println("-> Complete");
    shopping.setCurrentState(shopping.getSelectionState());
  }

}
