public class Document{
    LinkedList<String>words = new LinkedList<>();
    int id ;
    
    public Document(int id, LinkedList<String>words){
     this.id =id;
     this.words=words;
     }
    public boolean find(String word){
   if(words.exist(word))
   return true;
   return false;
    }
    }