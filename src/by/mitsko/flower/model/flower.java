package by.mitsko.flower.model;

public class flower {
         public String title; 
         public String color;
         public petal[] petal;
         
         public flower(){  
       
         }
         public flower(String title, String color){ 
        	 this.color = color;    
        	 this.title = title;
         }
          public void bloom(int petalCount){    
        	  if (petalCount > 0) {
        		  petal = new petal[petalCount];
        		  for (int i = 0; i<5; i++){
        		  petal[i] = new petal(4,"oval","pink");
        		  }
        		  System.out.println();
        	  }
          }
          public void littleFade(){
        	  this.color = "brown";
        	  for (int i=0; i<this.petal.length; i= i+3) {
        		  this.petal[i] = null;
        	  }
          }
          public void totalFade(){
        	  this.color = "black";
        	  for (int i=0; i<this.petal.length; i= i+1)
        		  if (this.petal[i] != null){
        			  this.petal[i] = null;
        		  }
          }
          
} 
