package mutation.ejercicio1;

public class FindVal{

  public static int findVal(int numbers[], int val){
    int findVal = -1;
    for(int i = 0; i < numbers.length; i++)
    //for(int i = 1; i < numbers.length; i++) //mutante
      if(numbers[i] == val)
        findVal = i;

    return findVal;
  }


}

