public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 0; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        //2. 
        for (int i = 1; i <= Math.pow(2, n); i*=2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        //3.1
        for (int i = 1; i <= n; i++){		//Outer loop
            for(int j = 1; j <= n; j++) {	//Inner loop
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
