import java.util.*;

class RPS {
    public static String computerChoice() {
        int n=(int)(Math.random()*3);
        if(n==0) return "Rock";
        if(n==1) return "Paper";
        return "Scissors";
    }
    public static int winner(String user,String comp) {
        if(user.equals(comp)) return 0;
        if(user.equals("Rock")&&comp.equals("Scissors")) return 1;
        if(user.equals("Scissors")&&comp.equals("Paper")) return 1;
        if(user.equals("Paper")&&comp.equals("Rock")) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Games: ");
        int g=sc.nextInt();
        int uw=0,cw=0;
        for(int i=0;i<g;i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user=sc.next();
            String comp=computerChoice();
            int res=winner(user,comp);
            if(res==1) uw++; else if(res==-1) cw++;
            System.out.println("You: "+user+" Computer: "+comp);
        }
        System.out.println("User Wins: "+uw+" Computer Wins: "+cw);
        System.out.println("User %: "+(uw*100.0/g)+" Computer %: "+(cw*100.0/g));
    }
}
