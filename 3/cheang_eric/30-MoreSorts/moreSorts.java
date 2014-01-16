public class moreSorts{
    static int[] returnVariable;
    
    public static int[] inSort(int[] sortMe){
	
	returnVariable = new int[sortMe.length];
	int orgInd = 0;
	int retInd = 0;
	
	for (int orgCmp:sortMe){
	    int changeBomb = 0;
	    for (int retCmp:returnVariable){
		if (orgCmp < retCmp){
		    changeBomb++;
		    int[] tempArray = returnVariable;
		    int shiftStep = retInd;
		    returnVariable[shiftStep] = orgCmp;
		    shiftStep++;			
		    for (; shiftStep < returnVariable.length-1; shiftStep++){
			returnVariable[shiftStep] = tempArray[shiftStep-1];
		    }
		}
	    }
	    if (changeBomb > 0){
	    returnVariable[orgInd] = orgCmp;
	    }
	    changeBomb = 0;
	    orgInd++;
	    retInd++;
	}
	return returnVariable;
    }

    public static void main(String args[]){
	
	moreSorts testSort = new moreSorts();
	int[] pokemon = new int[5];
	pokemon[0] = 43;
	pokemon[1]=324;
	pokemon[2]=34;
	pokemon[3]=191;
	pokemon[4]=29;
	
	for (int x : moreSorts.inSort(pokemon)){
	    System.out.println(x);
	}
    }
}