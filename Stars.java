public static void main(String[] args) {
        
        
        System.out.println("a.");
        for(int i = 10; i >= 0; i--) {
            for(int j = i; j >= 0; j--) { //nested for loop which prints i amount of stars
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        
        System.out.println("b.");
        for(int i = 10; i >= 0; i--) { 
            for(int j = i - 1; j >=0; j--) { //print i - 1 star
                System.out.print(" ");
            }
            
            for(int j = 10 - i; j >= 0; j--) { //print 9 - i stars
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.println("c.");
        for(int i = 10; i >= 0; i--) {
            for(int j = 1; j <= 10 - i; j++) { //print 10 - i stars
                System.out.print(" ");
            }
            
            for(int j = i; j >= 0; j--) { //print i stars
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.println("d.");
        //top half (i counts up like the number of stars)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //bottom half (i counts down)
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
}
