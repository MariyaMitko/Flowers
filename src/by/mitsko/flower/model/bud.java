package by.mitsko.flower.model;

import by.mitsko.flower.model.flower;

import by.mitsko.flower.model.gardener;

public class bud {
	
	 public String budSize;
	 public String budColor;
	
	 public bud(String budSize, String budColor) {
		 this.budSize = budSize;
  	     this.budColor = budColor;
	
		}
	public void YongBud (bud bud)	{
		budSize = "Big";
		budColor = petal.color;
	System.out.println("Bud size: " + budSize);
	System.out.println("Bud color: " +budColor);
	}
	public void LittleFadeBud (bud bud)	{
		budSize = "Big";
		budColor = "Brown";
	System.out.println("Bud size: " + budSize);
	System.out.println("Bud color: " + budColor);
	}
	public void FadeBud (bud bud)	{
		budSize = "Smoll";
		budColor = "Black";
	System.out.println("Bud size: " + budSize);
	System.out.println("Bud color: " + budColor);
}
}
