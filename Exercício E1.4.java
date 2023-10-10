class Animal{
    void som(){
        System.out.print("Voz produzida pelo animal: ");
    }
}

class Sapo extends Animal{
    void som(){
        super.som();
        System.out.println("Coaxar");
    }
}

class Cachorro extends Animal{
    void som(){
        super.som();
        System.out.println("Latir");
    }
}

class Boi extends Animal{
    void som(){
        super.som();
        System.out.println("Mugir");
    }
}

public class TestaAnimais{
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Cachorro();
        animais[2] = new Boi();
        
        int i;
        
        for(i = 0; i < 3; i++){
            animais[i].som();
        }
    }
}
