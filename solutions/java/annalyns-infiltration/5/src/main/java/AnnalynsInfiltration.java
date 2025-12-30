class AnnalynsInfiltration {

    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;

    
    public static boolean canFastAttack(boolean knightIsAwake) {
        try {
            return !knightIsAwake;
        } catch (UnsupportedOperationException x){
            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        try {
            return knightIsAwake || archerIsAwake || prisonerIsAwake;
        } catch (UnsupportedOperationException x) {
            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
      }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       try {
            return !archerIsAwake && prisonerIsAwake;
        } catch (UnsupportedOperationException x){
            throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
               try {
                   return !archerIsAwake && (petDogIsPresent || prisonerIsAwake && !knightIsAwake);
    } catch (UnsupportedOperationException x) {
        throw new UnsupportedOperationException("Please implement the (static)AnnalynsInfiltration.canFreePrisoner() method");
     }
   }
}