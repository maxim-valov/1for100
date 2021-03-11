# **Приложение 1for100**


**Код приложения [1for100](https://github.com/maxim-valov/1for100/blob/master/src/Main.java)**

```java
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int transfer = 1000;
        int bid = 1;
        int bonus;
        if (transfer >= 1000) {
            bonus = transfer / 100 * bid;
        } else {
            bonus = 0;
        }
        int balance = account + transfer + bonus;
        System.out.println("Balance: " + balance);
        System.out.println("Bonus: " + bonus);
    }
}
```

**Или**

```java
ublic class Main {
    public static void main(String[] args) {
        int account = 100;
        int transfer = 1000;
        int bid = 1;
        int bonus = (transfer >= 1000) ? transfer / 100 * bid : 0;
        int balance = account + transfer + bonus;
        System.out.println("Balance: " + balance);
        System.out.println("Bonus: " + bonus);
    }
}
```

***Примечание**: Тип **int** выбран так, как в расчётах будут использоваться только целые числа и граничных значений данного типа достаточно для работы с переменными "account", "transfer", "bid", "bonus".

**Примеры работы приложения**:

![transfer999](https://user-images.githubusercontent.com/74412798/110772078-fdef5780-8239-11eb-97e0-602e1df47adf.png)

![transfer1000](https://user-images.githubusercontent.com/74412798/110772082-fe87ee00-8239-11eb-8abe-f89225e92d9d.png)
