package factory;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectFactory objectFactory = new ObjectFactory();
        Tank tank = objectFactory.createObject(Tank.class);
        Elf elf = objectFactory.createObject(Elf.class);
        Hobbit hobbit = objectFactory.createObject(Hobbit.class);
        System.out.println(tank);
        System.out.println(elf);
        System.out.println(hobbit);
    }
}
