/**
 *
 */

/**
 * @author testuser
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

    Person taro = new Person();
    taro.name = "taro";
    taro.age = 18;
    System.out.println(taro.name);
    System.out.println(taro.age);

    Person jiro = new Person("jiro",20);
    System.out.println(jiro.name);
    System.out.println(jiro.age);

    Person saburo = new Person("saburo");
    saburo.age = 21;
    System.out.println(saburo.name);
    System.out.println(jiro.age);

    Person namaenashi = new Person(25);
    System.out.println(namaenashi.name);
    System.out.println(namaenashi.age);

    Person hanako = new Person(17,"hanako");
    System.out.println(hanako.name);
    System.out.println(hanako.age);
 	}

}
