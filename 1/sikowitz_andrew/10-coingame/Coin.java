import java.io.*;
import java.util.*;

public class Coin {
    private int face;
    private int heads;
    private int tails;
    private double weight;
    private double value;
    private String name;

    public Coin() {
	heads = 0;
	tails = 0;
	face = 0; //Starts Heads
	weight = 0.5; //0 = Always Heads, 1 = AlwaysTails, 0.5 = Fair Coin, etc.
	value = .01;
	name = "Penny";
    }

    public Coin(double weight) {
	this.weight = weight;
	heads = 0;
	tails = 0;
	face = 0;
	value = 0.1;
	name = "Penny";
    }

    public Coin(double weight, double value, String name) {
	this.weight = weight;
	this.value = value;
	this.name = name;
	heads = 0;
	tails = 0;
	face = 0;
    }

    public void reset() {
	heads = 0;
	tails = 0;
	face = 0;
    }

    public String getFace() {
	if (face == 0)
	    return "Heads";
	else
	    return "Tails";
    }

    public int getCount() {
	return heads + tails;
    }

    public int getHeads() {
	return heads;
    }

    public int getTails() {
	return tails;
    }

    public double getWeight() {
	return weight;
    }

    public double getValue() {
	return value;
    }

    public String getName() {
	return name;
    }

    public void setWeight(double weight) {
	this.weight = weight;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setValue(double value) {
	this.value = value;
    }

    public boolean equals(Coin other) {
	return (this.getFace().equals(other.getFace()));
    }

    public void roll() {
	double rand = Math.random() - 0.5 + weight;
	face = (int) Math.round(rand);
	if (face == 0) {
	    heads ++;
	}
	else {
	    tails ++;
	}
    }
}
