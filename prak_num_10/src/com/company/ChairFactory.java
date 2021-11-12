package com.company;

public class ChairFactory implements Chair{

    public VictorianChair createVictorianChair() {
        VictorianChair app = new VictorianChair(156);
        System.out.println(app.getAge() + " лет стулу");
        return null;
    }

    public MagicChair createMagicChair() {
        MagicChair app = new MagicChair();
        app.doMagic();
        return null;
    }

    public FunctionalChair createFunctionalChair() {
        FunctionalChair app = new FunctionalChair();
        System.out.println(app.summa(4 ,8) + " я посчиталь");
        return null;
    }
}
