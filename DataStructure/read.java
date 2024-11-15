import java.io.File;
import java.util.Scanner;

public class read{
 
 public static void Load(String FileName){
  String line =null;
  
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
     
     }
    
    
    public static void main(String[]args){
      Load("dataset.csv");
      }
      
     }