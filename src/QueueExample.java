import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;
import java.util.Stack;

public class QueueExample {

    public static void main(String[] args){

        Queue<String> queue=new LinkedList();

        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charrlette");

        System.out.println(queue);
        String nextUp= queue.element();
        System.out.println(nextUp);

        // clear the queue..can use for loop also ...or just a clear() function.
        IntStream.range(0, queue.size()).forEach(i -> {
            queue.remove();
            System.out.println(queue);
        });

   // Stack example as well here.....

        Stack<String> deckOfCards= new Stack();
        String card1="Jack  :  Diamonds" ;
        String card2="8  : Hearts";
        String card3="3  : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);
        System.out.println(deckOfCards.peek());
        System.out.println(deckOfCards.size());

        while(!deckOfCards.empty()){
            deckOfCards.pop();
            System.out.println(deckOfCards);
        }
    }
}
