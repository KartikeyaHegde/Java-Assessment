package Order;

public interface Hot {
    Coffee();
    Tea();
}

public class Coffee implements Hot{
    Latte,Cappuccino,Expresso;
}

    Coffee() {

    }
}


public class Tea implements  Hot {
    Masala, Black;
}

