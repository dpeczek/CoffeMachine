package coffee;

public enum Money {
	FIFTY_CENTS,
    ONE_DOLLAR,
    TWO_DOLLARS,
    FIVE_DOLLARS;
	
    public static double getColorValue(Money coin) {
        
    switch (coin) {
      case FIFTY_CENTS:
          return 0.5;
      case ONE_DOLLAR:
    	  return 1.0;
      case TWO_DOLLARS:
    	  return 2.0;
      case FIVE_DOLLARS:
    	  return 5.0;
      }
	return 0;
    }
}
