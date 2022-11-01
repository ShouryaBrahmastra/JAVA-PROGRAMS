public class IteratedArithmeticException extends Throwable {
 
  // Default Constructor:
  public IteratedArithmeticException(){}
 
  // Standard constructor:
  public IteratedArithmeticException(String s, Throwable cause) {
    super(s, cause);                                               
  }
 
  public IteratedArithmeticException(int iteration, Throwable cause) {
    super(cause);                                                    
 
    this.iteration = iteration;                                        
 
  }
 
  public int getIteration() {                                         
    return iteration;                                                  
  }
 

  private int iteration = -1;                  
}
