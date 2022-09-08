
public class Cat
{
    public static final int EYES = 2;
    public static final int MIN_WEIGHT = 450;
    public static final int MAX_WEIGHT = 8500;
    private double originWeight;
    private double weight;
    private String name;

    private static double foodWeight;

    public double minWeight;
    private double maxWeight;
    private static int catCount = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        System.out.println("New cat count:" + addCat());
    }

    public Cat(String myName,double myWeight)
    {
        setName(myName);
        setWeight(myWeight);
    }

    public Cat(int myWeight)
    {
        this.weight = myWeight;
    }

    public void setWeight(double myWeight)
    {
        this.weight = myWeight;
    }

    public void setName(String myName)
    {
        this.name = myName;
    }

    public String getName(){
        return name;
    }

    public static int addCat()
    {
        return ++catCount;
    }

    public static int delCat()
    {
        return --catCount;
    }

    public static int getCatCount()
    {
        return catCount;
    }

    public double getOriginWeight()
    {
        return originWeight;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if(getStatus() == "Dead" || getStatus() == "Exploded") {delCat();}
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        foodWeight += amount;
        if(getStatus() == "Dead" || getStatus() == "Exploded") {delCat();}
    }

    public void Toilet(){
        weight -= 150;
        System.out.println("Хозяин! Я обосрался! Я высрал 150 г. и теперь вешу " + weight );
        if(getStatus() == "Dead" || getStatus() == "Exploded") {delCat();}
    }

    public double getFoodWeight(){
        return foodWeight;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if(getStatus() == "Dead" || getStatus() == "Exploded") {delCat();}
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}