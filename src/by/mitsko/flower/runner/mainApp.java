package by.mitsko.flower.runner;
import by.mitsko.flower.model.bud;
import by.mitsko.flower.model.flower;
import by.mitsko.flower.model.gardener;

public class mainApp {

	public static void main(String[] args) {
	    gardener gardener = new gardener("Ivan");
		flower fl = new flower("Rose", "red");
		bud bud = new bud(null, null);
		
		
		gardener.informAboutFlowerState(fl);       
        fl.bloom(5);
        bud.YongBud(bud);
		gardener.informAboutFlowerState(fl); 
		fl.littleFade();
		bud.LittleFadeBud(bud);
		gardener.informAboutFlowerState(fl); 
		fl.totalFade();
		bud.FadeBud(bud);
		gardener.informAboutFlowerState(fl);
		
	}

}
