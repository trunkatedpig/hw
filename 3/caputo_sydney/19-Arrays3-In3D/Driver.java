import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Array a= new Array();
	double[] anArray= new double[10];
	  anArray[0]=1.0;
	  anArray[1]=2.0;
	  anArray[2]=3.0;
	  anArray[3]=4.0;
          anArray[4]=5.0;
          anArray[5]=6.0;
	  anArray[6]=7.0;
          anArray[7]=8.0;
          anArray[8]=9.0;
	  anArray[9]=10.0;

	System.out.println(a.mean(anArray));
	System.out.println(a.stddev(anArray));

}
    


}