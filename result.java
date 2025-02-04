class Result { 
    /* 

     * Complete the 'fizzBuzz' function below. 

     * 

     * The function accepts INTEGER n as parameter. 

     */ 
    int n = 15; 

    public static void fizzBuzz(int n) { 

    // Write your code here 

    int i = 0; 

    while(i<n){ 

    i++; 

    if (i <= 3*5) 

    System.out.println("FizzBuzz"); 

 

 int i = 0; 

    while(i<n){ 

    i++; 

    if (i%3!=0) 

    System.out.println("FizzBuzz"); 

     

    if (i%5!=0) 

    System.out.println("FizzBuzz"); 

     

    if (i/3) 

    System.out.println("FizzBuzz"); 

    } 

    } 

} 
