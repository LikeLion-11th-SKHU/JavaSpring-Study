package happy_java_04;

public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 되면 기본생성자가 자동으로 만들어지지 않는다.
    public User(String name, String email) { // return만 해주는 객체 = 불변객체
        this(name, email, null); // super생성자를 제외하고는 this 생성자가 첫번째 줄에 있어야 함.
    }

    // 생성자 오버로딩
    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}