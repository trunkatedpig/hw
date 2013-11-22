import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	int[] hal = {1, 1, 2, 2};
	Robot phil = new Robot(hal, 1, true);
	System.out.println(phil.clearHall());
    }
}
