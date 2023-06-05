package com.orange.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("randomInt variable: "+ randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("randomInt variable: "+ randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("randomDouble variable: "+ randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("randomDouble variable: "+ randomDouble1);

        System.out.println("Random boolean:" + DataGeneratorUtil.getRandomBoolean());


        Customer lena = new Customer("Lena Stici", "lena.stici@gmail.com", 38);
        System.out.println("Object name Lena: "+ lena.getName());
        System.out.println("Object email Lena: "+ lena.getEmail());
        System.out.println("Object age Lena: "+ lena.getAge());

        lena.setName("Lena Her");
        lena.setEmail("lena.her@gmail.com");
        lena.setAge(41);
        System.out.println("Object name Lena: "+ lena.getName());
        System.out.println("Object email Lena: "+ lena.getEmail());
        System.out.println("Object age Lena: "+ lena.getAge());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),DataGeneratorUtil.getRandomEmail(),
                DataGeneratorUtil.getRandomInt(127));

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(7));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 60));

        System.out.println(randomDataCustomer.toString());


    }
}
