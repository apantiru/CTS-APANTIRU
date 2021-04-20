package ro.ase.csie.cts.g1094.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
	    
		ScreenData coordsSolider1 = new ScreenData(100, 10, 10, "Green");
		ScreenData coordsSolider2 = new ScreenData(100, 10, 10, "Green");

		ScreenData coordsTree1 = new ScreenData(50, 50, 0, "Green");
		ScreenData coordsTree2 = new ScreenData(50, 50, 0, "Green");
		
		ModelFlyweightActions soldier = Model3DFactory.getModel(ModelTypes.SOLDIER);
		soldier.display(coordsSolider2);
		soldier.display(coordsSolider1);
		
		ModelFlyweightActions tree = Model3DFactory.getModel(ModelTypes.SOLDIER);
		soldier.display(coordsTree1);
		soldier.display(coordsTree2);
		
		
		


		
	}

}
