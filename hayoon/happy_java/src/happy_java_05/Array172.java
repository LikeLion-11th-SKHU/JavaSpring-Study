package happy_java_05;
import java.util.Arrays;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        // sort(Object[]) - Object는 모든 객체의 조상으로, 어떤 객체의 배열이든 올 수 있다.
        Arrays.sort(items);

        for (Item item : items){ // for each 문
            System.out.println(item);
        }
    }
}

// Comparable 은 어떤 Item이 큰지, 작은지 기준을 정하는 interface다.
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) { // 생성자 만들기
        this.name = name;
        this.price = price;
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다. (자신과 같은 타입의 객체가 들어옴)
    // 홍길동, 고길동 -> 유니코드로 비교 -> 홍길동이 더 큰 값.
    @Override
    public int compareTo(Object 0) {
        Item d = (Item) o;
        return this.name.compareTo(d.name); // 양수, 0, 음수 (문자열 가나다순)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name +'\'' +
                ", price=" + price +
                '}';
    }
}