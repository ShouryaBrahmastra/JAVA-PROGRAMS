public class TestIterated {
  public static void main(String args[]) {
    try {
      loopy();                             // Call the method that will throw the exception.
    } catch(IteratedArithmeticException e) {
      System.out.println("Originating exception was: " + e.getCause());
      int iteration = e.getIteration();
      if(iteration < 0) {
      System.out.println("Iteration count not recorded");
      } else {
        System.out.println("Iteration count when exception occurred: " + iteration);
      }
    }
  }
 
  // This method throws an exception - eventually:
  static void loopy() throws IteratedArithmeticException {
    int iteration = 0;                                                 
    int result = 0;                                                    
    int divisor = 0;                                                   
 
    
    for(iteration = 0 ; ; ++iteration)
      try {
        divisor = (int)(100*Math.random());                            
        result = 1000/divisor;                                         
      } catch(ArithmeticException e) {
        throw new IteratedArithmeticException(iteration, e);
      }
  }
}
