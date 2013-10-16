import java.io.*;
import java.util.*;

public class BankAccount{
    private int balance;

    public BankAccount(int b) {
	balance = b;}

    public int getBalance() {
	return balance;}

    public void deposit(int a) {
	balance = balance + a;}
   
    public void withdraw(int a) {
	//there will never be a negative case as the game stops at 0
	balance = balance - a;} 
}
