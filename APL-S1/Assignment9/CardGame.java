
import java.util.*;
import java.util.Random;
class CardGame{
    
    public static void dealCards(String suits[],int[] ranks) {
       
        for(int i=0; i<suits.length; i++){
            for(int j=0; j<9; j++){
                System.out.println("Card " + i + " " + j);

            }
        }


        
    }

    public static boolean chooseFirstPlayerOne(){

        Random random =new Random();
        int n = random.nextInt(2);
        boolean bool =false;
        String playerOne ="Bob";
        String playerTwo ="Alice";
        System.out.println("Starting simple card game simulation...");
        System.out.println();
        if(n==1){
            bool = true;
            }
            else{
                bool = false;
            }
        if(bool == true){
            System.out.println(playerOne + " goes first");
            }
            else{
                System.out.println(playerTwo + " goes first");
                }
        return bool;
        
       
    }

    public static void main(String[] args){
        
        String suits[] = {"clubs","diamonds","hearts","spades"};
        char suit[] = {'J','Q','K','A'};
        int ranks[] = {2,3,4,5,6,7,8,9,10};

        CardDeck deck = new CardDeck();
        
        // Deck.shuffle();
        chooseFirstPlayerOne();
    //    Deck.printDeck();
        dealCards(suits,ranks);    


}
}