import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.Document;

public class main{
    public static void main(String[]args){

        //Reading docs. + index
        LinkedList<Document> index= new LinkedList<Document>();

        String line = null;
        
        try {
         File f =new File(FileName);
         Scanner scan = new Scanner(f);
         
         scan.nextLine();
         while(scan.hasNextLine()){
          line = scan.nextLine();
          
          if(line.trim().length()<3){
           System.out.println("Empty line found,skipping this line="+line);
           break;
           }
           
           System.out.println(line);
           //String[] values = line.split(",");
           String x = line.substring(0,line.indexOf(','));
           int id = Integer.parseInt(x.trim());
           String content = line.substring(line.indexOf(',')+1).trim();
          }
          }catch(Exception e){
           System.out.println("end of file");
           }






        //inverted index
        LinkedList<Word> invertedIndex = new LinkedList<Word>(); 

        
         if(!index.empty()){
            index.findFirst();
        boolean found = false;
        while(!index.last()){
        if(index.find(word)){
            found = true;
            break;}
        index.findNext();}

        if(index.find(word))
            found = true;

        invertedIndex.insert(word);


        }

        //BST

        //menue

    
    }

    public static LinkedList<Integer> booList(String bool){
        String query = bool.toLowerCase();
        Stack<String> words = new Stack<String>();
        Stack<E> operaters = new stack();
String word;
int start = 0;
for(int i =0; i<words.length); i++){
    if(words.charAt(i) == ' ')
    word = words.substring(start, i);
    start = i + 1;



    //insert in queue or stack
    if(!(word.equals("and") || word.equals("or")))
    words.push(word);
    else{ 
        
        if(word.equals("or"))
        while (!operaters.empty())
       words.push(evalute(retrieve(words.pop()), retrieve(words.pop()), operaters.pop()));

        else
        while (!operaters.empty() && top.equals("and"))
        words.push(evalute(retrieve(words.pop()), retrieve(words.pop()), operaters.pop()));

       operaters.push(word);
    }
}
while (!operaters.empty())
words.push(evalute(retrieve(words.pop()), retrieve(words.pop()), operaters.pop()));

return words.pop();
    }

    public static LinkedList<Integer> evalute(LinkedList<Integer> list1, LinkedList<Integer> list2, String op){
      LinkedList<Integer> result = list1;
      String word;

      if(op.equals("and"))
      if(!list1.empty()){
        list1.findFirst();

      while (!list1.last()) {
        if(list2.find(list1.retrieve()))
        result.insert(list1.retrieve());
        list2.findNext();
    
    }

        if(list2.find(list1.retrieve()))
        result.insert(list1.retrieve());

      
   

    }

else{
    if(!list1.empty() || !list2.empty()){
result = list1;
list2.findFirst();

while (!list2.last()){}
if(!list1.find(list2.retrieve()))
result.add(list2.retrieve());
list2.findNext();}

if(!list1.find(list2.retrieve()))
result.add(list2.retrieve());


}
return result;
}
}  
           
