package by.mitsko.flower.model;

public class gardener {
	
	public static int count;
	public String name;
	
	public gardener (String name){
		this.name = name;
	}	
    public void informAboutFlowerState (flower flower){
    	if (flower != null){
    	    System.out.println("flower title: " + flower.title);
    	    System.out.println("flower color: " + flower.color);
    	
    	if (flower.petal != null){
    		this.informAboutFlowerPetals(flower.petal);
    	}
    	}
    }
    public void informAboutFlowerPetals (petal[] petals){
    	  System.out.println("flower petal count: " + getPetalsCount(petals));
    	  System.out.println("============Info about petals=============");
    	
    	   	for (petal petal: petals){
    	   		if (petal != null){
    		System.out.println("petal size: " + petal.size);
    		System.out.println("petal shape: " + petal.shape);
    		System.out.println("petal color: " + petal.color);
    		System.out.println("------------------------------------------");
    	}
    	   	}
    }
    public int getPetalsCount(petal[] petals){
    	count = 0;
    	for (petal petal: petals){
    		if (petal != null){
    			count++;
    		}
    	}
    	return count;
    }
    
		}

