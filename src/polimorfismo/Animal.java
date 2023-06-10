package polimorfismo;

class Animal {
    public void fazerBarulho() {
        System.out.println("O animal está fazendo barulho.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro está latindo.");
    }
}

class Gato extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("O gato está miando.");
    }



    // Executavel
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerBarulho(); // Resultado: "O cachorro está latindo."
        animal2.fazerBarulho(); // Resultado: "O gato está miando."
    }
}
