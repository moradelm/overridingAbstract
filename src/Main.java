public class Main {
    public static void main(String[] args) {
//        DogList DLO = new DogList();
//        Dog d = new Dog();
//        DLO.add(d);

//        AnimalList ALO = new AnimalList();
//        Dog d = new Dog();
//        Fish f = new Fish();
//        ALO.add(d);
//        ALO.add(f);
        Animal[] list = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();
        list[0]=d;
        list[1]=f;
        for(Animal x:list){
            x.noise();
        }

    }
}