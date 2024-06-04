//순환 함수 : 자기자신을 호출하는 함수
public class Code01 {
    public static void main(String[] args) {
        func();
        // 무한루프에 빠짐
    }

    public static void func(){
        System.out.println("Hello.....");
        func();
    }
}
