import java.util.Scanner;

public class Main {

	private static void showMenu(){
		System.out.println("---------------");
		System.out.println("1 -> Ар-деко");
		System.out.println("2 -> Вікторіанській");
		System.out.println("3 -> Модерн");
		System.out.println("---------------");
	}

	private static int getItemFromMenu(){
		showMenu();
		Scanner input = new Scanner(System.in);
		int numberOfItem = input.nextInt();
		return numberOfItem;
	}

	private static void artDecoFurniture(){
		Furniture chair = new Furniture("Крісло", "Ретро-Шарм", 1957);
		Furniture sofa = new Furniture("Диван", "Элегантно-Луксозний", 9360.91);
		Furniture table = new Furniture("Столик", "Лукс Вінтаж", 6710);
		showDataFurniture(chair, sofa, table);
	}

	private static void victorianFurniture(){
		Furniture chair = new Furniture("Крісло", "Тиха гавань", 2340);
		Furniture sofa = new Furniture("Диван", "Мудрість віків", 7340.57);
		Furniture table = new Furniture("Столик", "Місце роздумів", 4340);
		showDataFurniture(chair, sofa, table);
	}

	private static void modernFurniture(){
		Furniture chair = new Furniture("Крісло", "Стар шіп", 1340);
		Furniture sofa = new Furniture("Диван", "Гіпер портал", 5340.17);
		Furniture table = new Furniture("Столик", "Пульт керування", 4340);
		showDataFurniture(chair, sofa, table);
	}

	private static void showDataFurniture(Furniture chair, Furniture sofa, Furniture table){
		System.out.println(chair);
		System.out.println(sofa);
		System.out.println(table);
		double sumOfFurniture = chair.getPrice() + sofa.getPrice() + table.getPrice();
		System.out.println("Загальна сума: " + sumOfFurniture);
	}

	private static void selectFurniture(){
		int selectedMenuItem;
		do {
			selectedMenuItem = getItemFromMenu();
		} while (!(selectedMenuItem > 0 && selectedMenuItem < 4));

		switch (selectedMenuItem){
			case 1:
				artDecoFurniture();
				break;
			case 2:
				victorianFurniture();
				break;
			case 3:
				modernFurniture();
				break;
		}
	}

	public static void main(String[] args) {
		selectFurniture();
	}
}