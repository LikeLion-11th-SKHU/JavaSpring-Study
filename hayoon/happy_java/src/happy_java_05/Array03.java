package happy_java_05;

public class Array03 {
    public static void main(String[] args) {
        int[] array1 = new int[5]; // 배열 크기 정하기
        array1[0] = 1; // 입력받은 값 or 파일로부터 읽은 값 으로 초기화해줄 때 사용
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = new int[]{1,2,3,4,5}; // 배열 선언과 동시에 초기화
        int[] array3 = {1,2,3,4,5}; // 배열 선언과 동시에 초기화

        System.out.println("array1 의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("array2 의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("array3 의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }
    }