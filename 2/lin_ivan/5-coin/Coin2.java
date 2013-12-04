import java.io.*;
import java.util.*;

public class Coin {
  private int flips, tails, heads;
  private double fairness;
  private String face;
  private String name;
  private double value;
  
  
  
  public Coin(){
    face = "heads";
    heads = 0;
    tails = 0;
    flips = 0;
    fairness = 0.5;
  }
  
  
  public Coin(String n){
    name = n;
    if (n == "Quarter"){
      value = .25;
    }
    if (n == "Dime"){
      value = .10;
    }
    if (n == "Nickel"){
      value = .05;
    }
    if (n == "Penny"){
      value = .01;
    }
    face = "heads";
    fairness = 0.5;
    flips = 0;
    tails = 0;
    heads = 0;
  }
}