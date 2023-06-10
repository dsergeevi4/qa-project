 import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

			
		// генерируем строку, заданой длины
		 public static String getRandomString(int length){
		     String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		     Random random=new Random();
		     StringBuffer sb=new StringBuffer();
		     for(int i=0;i<length;i++){
		       int number=random.nextInt(26);
		       sb.append(str.charAt(number));
		     }
		     return sb.toString();
		 }

		// генерируем пол М или Ж
			 public static String getRandomSex(){
			     String str="МЖ";
			     Random random=new Random();
			     StringBuffer sb=new StringBuffer();
			       int number=random.nextInt(2);
			       sb.append(str.charAt(number));
			     
			     return sb.toString();
			 }
		
	    public static void main(String[] args) throws InstantiationException, IllegalAccessException  {

	      //создаем список объектов        
	        List<Students> listt = new ArrayList<Students>();
	        Random random=new Random();
	        
	      for(int i=0; i<100; i++) 
	    	  {
	    	      //добавляем объекты в список
	    	  listt.add(new Students(getRandomString(random.nextInt(9)+2),random.nextInt(16)+16,getRandomSex()));
	    	      	  }
	        
	      for(Students mc : listt) {
		        System.out.println("" + mc);
		    }
	    
	    
	    int max = 0;
	    double max_sr = 0;

	    
	    for(int i=0;i<listt.size();i++){
	        //определяем максимальный возраст
	        if (max<listt.get(i).getAge())
	            max=listt.get(i).getAge();
	        max_sr +=listt.get(i).getAge();//суммируем возраст для определения среднего
	    }
	    
	    // определяем средний возраст
	    max_sr /= listt.size();
	   

	    System.out.println("\n/////////////\nMax age = "+max);
	    System.out.println("Average_age = "+max_sr);
	    
	    List<Students> listm = new ArrayList<Students>();//список мальчиков
	    List<Students> listw = new ArrayList<Students>();//список девочек
	    for(int i=0;i<listt.size();i++){
	    	
	           if(listt.get(i).getGender().equals("М")){
	        	     listm.add(listt.get(i));
	            
	        }
	           else  listw.add(listt.get(i));
	    }
	    
	    
	    for(Students mc : listm) {
	        System.out.println("Студент мужского пола: " + mc);
	    }
	    for(Students mc : listw) {
	        System.out.println("Студент женского пола: " + mc);
	    }
	    

	}

}