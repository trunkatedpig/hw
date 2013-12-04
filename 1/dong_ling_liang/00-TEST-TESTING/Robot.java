import java.io.*;
import java.util.*;

public class Robot{
    public int[] hall;
    private int pos;
    private boolean facingRight;

    public Robot(int[] h, int p, boolean f){
	hall = h;
	pos = p;
	facingRight = f;
    }
    private boolean forwardMoveBlocked(){
	if (facingRight && pos >= hall.length-1){
	    return true;
	}
	else if (!(facingRight) && pos <= 0){
	    return true;
	}
	else {
	    return false;
	}
    }
    private void move(){
	if (hall[pos] > 0){
	    hall[pos] = hall[pos] - 1;
	    if (hall[pos] == 0){
		if (forwardMoveBlocked()){
		    facingRight = !(facingRight);
		}
		else {
		    if (facingRight){
			pos = pos + 1;
		    }
		    else {
			pos = pos - 1;
		    }
		}
	    }
	}
	else {
	    if (forwardMoveBlocked()){
		facingRight = !(facingRight);
	    }
	    else {
		if (facingRight){
		    pos = pos + 1;
		}
		else {
		    pos = pos - 1;
		}
	    }
	}
    }
    public int clearHall(){
	int move = 0;
	while (!(hallIsClear())){
	    move();
	    move = move + 1;
	}
	return move;
    }
    public boolean hallIsClear(){
	for (int i = 0; i < hall.length; i++){
	    if (hall[i] != 0){
		return false;
	    }
	}
	return true;
    }
}
